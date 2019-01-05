package com.xum.design.mode.wrap;
/**
 * 装饰者-鞋子 
 */
public class Shoe implements Show {
	//主体
	private Show show;
	
	public Shoe(Show show) {
		super();
		this.show = show;
	}

	@Override
	public String show() {
		return "穿着鞋子的"+show.show();
	}
}
