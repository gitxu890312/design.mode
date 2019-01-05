package com.xum.design.mode.factory;
/**
 * 
 * @author xum890312
 * 培根pizza
 */
public class NYPeigenPizza implements Pizza {

	@Override
	public String getName() {
		return "纽约培根pizza";
	}

	@Override
	public void prepare() {
		System.out.println("准备"+getName()+"原料");
	}

}
