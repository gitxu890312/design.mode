package com.xum.design.mode.wrap;
/**
 * 装饰者-眼镜
 */
public class Glasses implements Show {
	//被装饰者的引用
	private Show show;
	
	public Glasses(Show show) {
		super();
		this.show = show;
	}

	@Override
	//附体中实现接口时，会调用主体的实现show.show()，并加上自己特有的功能（带着眼镜的）。
	public String show() {
		return "带着眼镜的"+show.show();
	}
}
