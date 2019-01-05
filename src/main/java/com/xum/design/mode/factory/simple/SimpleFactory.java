package com.xum.design.mode.factory.simple;

import com.xum.design.mode.factory.LiulianPizza;
import com.xum.design.mode.factory.PeigenPizza;
import com.xum.design.mode.factory.Pizza;

public class SimpleFactory {

	public Pizza createPizza(String name) {
		Pizza pizza = null;
		if (name.equals("liulian")) {
			pizza = new LiulianPizza();
		} else if (name.equals("peigen")) {
			pizza = new PeigenPizza();
		} else {
			System.out.println("不存在的pizza");
		}
		return pizza;
	}
}
