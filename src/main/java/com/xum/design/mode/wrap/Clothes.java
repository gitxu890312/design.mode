package com.xum.design.mode.wrap;
/**
 * 装饰者-衣服
 */
public class Clothes implements Show {
	//主体
	private Show show;
	
	public Clothes(Show show) {
		super();
		this.show = show;
	}

	@Override
	public String show() {
		return "穿着漂亮衣服的"+show.show();
	}
}
