package com.xum.design.mode.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
/**
 * 
 * @author xum890312
 *
 */
public class ZhongJie implements MethodInterceptor{

	public Object getInstance(Class clazz) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		Object create = enhancer.create();
		return create;
	}
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("租房中介准备房源中");
		System.out.println("-----------");
		Object invokeSuper = proxy.invokeSuper(obj, args);
		System.out.println("-----------");
		System.out.println("用户租房完毕");
		return invokeSuper;
	}
	public static void main(String[] args) {
		ZhongJie zhongjie = new ZhongJie();
		DaGongZi instance = (DaGongZi)zhongjie.getInstance(DaGongZi.class);
		String zuFang = instance.zuFang();
		System.out.println("成功租房："+zuFang);
	}
}
