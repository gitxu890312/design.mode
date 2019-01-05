package com.xum.design.mode.proxy.custom;

import java.lang.reflect.Method;

public interface XMInvocationHandler {
	  public Object invoke(Object proxy, Method method, Object[] args)
		        throws Throwable;
}
