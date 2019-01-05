package com.xum.design.mode.proxy.custom;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

/**
 * 
 * @author xum890312
 * 创建代理对象
 */
public class XMProxy {
	private static final String NL = "\r\n";
	public static Object newProxyInstance(XMClassLoader classLoader,Class<?> interfaces,XMInvocationHandler h) {
		//1.生成接口的实现类代码
		try {
			String proxySrc = generatorSource(interfaces);
			
			//2、将生成的源代码输出到磁盘，保存为.java文件
			String filePath = XMProxy.class.getResource("").getPath();
			File f = new File(filePath + "$Proxy0.java");
			FileWriter fw = new FileWriter(f);
			fw.write(proxySrc);
			fw.flush();
			fw.close();
			//3.编译代码为字节码文件
			JavaCompiler  compiler = ToolProvider.getSystemJavaCompiler();
			StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
			Iterable iterable = manager.getJavaFileObjects(f);
			
			CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
			task.call();
			manager.close();
		
			
			//4.将class文件中的内容，动态加载到JVM中来
			
			Class proxyClass = classLoader.findClass("$Proxy0");
			Constructor c = proxyClass.getConstructor(XMInvocationHandler.class);
			f.delete();
			//5.返回被代理后的代理对象
			return c.newInstance(h);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 简单起见，只实现一个接口
	 * @param interfaces
	 * @return
	 */
	private static String generatorSource(Class<?> interfaces) {
		StringBuffer src = new StringBuffer();
		src.append("package com.xum.design.mode.proxy.custom;").append(NL);
		src.append("import java.lang.reflect.Method ;").append(NL);
		src.append("public class $Proxy0 implements " + interfaces.getName()+ "{").append(NL);
		src.append("XMInvocationHandler h;").append(NL);

		src.append("public $Proxy0(XMInvocationHandler h ){").append(NL);
		src.append("this.h = h;").append(NL);
		src.append("}").append(NL);

		Method[] methods = interfaces.getMethods();
		for (Method m : methods) {
			src.append(" public " + m.getReturnType().getName() + " " + m.getName() + "(){").append(NL);
			src.append("try{"+NL);
			src.append("Method m = "+ interfaces.getName()+".class.getMethod(\""+m.getName()+"\",new Class[]{});").append(NL);
			src.append("h.invoke(this,m,null);");
			src.append("}catch(Throwable e){e.printStackTrace();}");
		}
		src.append("}").append(NL);
		src.append("}").append(NL);
		return src.toString();
	}
}
