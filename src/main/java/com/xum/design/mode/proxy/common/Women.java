package com.xum.design.mode.proxy.common;
/**
 * 
 * @author xum890312
 * 女人找对象
 */
public class Women implements Person {

	private String name;
	
	public Women(String name) {
		super();
		this.name = name;
	}

	@Override
	public void findLove() {
		System.out.println("我是"+name);
		System.out.println("我是女生，我要找个男朋友");
		System.out.println("我的要求是高富帅");
		
	}

}
