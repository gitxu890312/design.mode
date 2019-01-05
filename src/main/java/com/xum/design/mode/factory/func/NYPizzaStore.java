package com.xum.design.mode.factory.func;

import com.xum.design.mode.factory.NYLiulianPizza;
import com.xum.design.mode.factory.NYPeigenPizza;
import com.xum.design.mode.factory.Pizza;

public class NYPizzaStore extends PizzaStore {
	// 工厂方法，将创建对象的过程，在具体的子类中实现
	public Pizza createPizza(String name) {
		Pizza pizza = null;
		if (name.equals("liulian")) {
			pizza = new NYLiulianPizza();
		} else if (name.equals("peigen")) {
			pizza = new NYPeigenPizza();
		} else {
			System.out.println("不存在的pizza");
		}
		return pizza;
	}

}
