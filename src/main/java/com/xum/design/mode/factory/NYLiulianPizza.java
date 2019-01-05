package com.xum.design.mode.factory;
/**
 * 
 * @author xum890312
 * 榴莲pizza
 */
public class NYLiulianPizza implements Pizza {

	@Override
	public String getName() {
		return "纽约榴莲pizza";
	}

	@Override
	public void prepare() {
		System.out.println("准备"+getName()+"原料");
	}

}
