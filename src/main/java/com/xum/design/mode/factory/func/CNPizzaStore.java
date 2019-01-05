package com.xum.design.mode.factory.func;

import com.xum.design.mode.factory.LiulianPizza;
import com.xum.design.mode.factory.PeigenPizza;
import com.xum.design.mode.factory.Pizza;

public class CNPizzaStore extends PizzaStore {
	// 工厂方法，将创建对象的过程，在具体的子类中实现
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
