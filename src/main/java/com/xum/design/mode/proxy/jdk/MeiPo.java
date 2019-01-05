package com.xum.design.mode.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.xum.design.mode.proxy.common.Person;
import com.xum.design.mode.proxy.common.Women;


/**
 * 
 * @author xum890312
 * jdk动态代理
 *  媒婆 ，代理人，帮助别人找对象
 */
public class MeiPo implements InvocationHandler {

	
	private Person target;
	
	public Object getInstance(Person person) {
		/**
		 * 创建代理对象 arg1 被代理对象的类加载器 arg2 被代理对象的接口 arg3 代理的实例
		 */
		this.target = person;
		Object proxy = Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(),
				 this);
		return proxy;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("调用代理对象的invoke函数");
		System.out.println("开始挑选对象");
		System.out.println("-------");
		method.invoke(target, args);
//		target.findLove();
		System.out.println("-------");
		System.out.println("对象挑选完毕");
		return null;
	}

	public static void main(String[] args) {
		MeiPo meipo = new MeiPo();
		Person instance =(Person) meipo.getInstance(new Women("赵薇"));
		instance.findLove();
	}

}
