package com.xum.design.mode.factory.abs;

import com.xum.design.mode.factory.Pizza;
/**
 * 
 * @author xum890312
 * 抽象工厂接口
 */
public interface AbsFactory {

	public Pizza createPizza(String name);
}
