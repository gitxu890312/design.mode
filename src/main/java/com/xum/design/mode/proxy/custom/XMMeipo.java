package com.xum.design.mode.proxy.custom;

import java.lang.reflect.Method;

import com.xum.design.mode.proxy.common.Person;
import com.xum.design.mode.proxy.common.Women;

public class XMMeipo implements XMInvocationHandler{

	private Person target;
	public static void main(String[] args) {
		XMMeipo meipo = new XMMeipo();
		
		Person person = (Person)meipo.getInstance(new Women("赵敏") );
		person.findLove();
	}

	public Object getInstance(Person person) {
		/**
		 * 创建代理对象 arg1 被代理对象的类加载器 arg2 被代理对象的接口 arg3 代理的实例
		 */
		this.target = person;
		Object proxy = XMProxy.newProxyInstance(new XMClassLoader(), person.getClass().getInterfaces()[0], this);
		return proxy;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("自定义代理********");
		System.out.println("开始挑选对象");
		System.out.println("-------");
		method.invoke(target, args);
		System.out.println("-------");
		System.out.println("对象挑选完毕");
		return null;
	}
}
