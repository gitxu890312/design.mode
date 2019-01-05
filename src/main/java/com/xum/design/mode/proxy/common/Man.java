package com.xum.design.mode.proxy.common;
/**
 * 
 * @author xum890312
 * 男人
 */
public class Man implements Person {

	private String name;
	
	public Man(String name) {
		super();
		this.name = name;
	}

	@Override
	public void findLove() {
		System.out.println("我是"+name);
		System.out.println("我要找个女朋友");
		System.out.println("我的要求是白富美");
	}

}
