package com.xum.design.mode.factory;
/**
 * 
 * @author xum890312
 * 培根pizza
 */
public class PeigenPizza implements Pizza {

	@Override
	public String getName() {
		return "培根pizza";
	}

	@Override
	public void prepare() {
		System.out.println("准备"+getName()+"原料");
	}

}
