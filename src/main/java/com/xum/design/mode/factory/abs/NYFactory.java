package com.xum.design.mode.factory.abs;

import com.xum.design.mode.factory.NYLiulianPizza;
import com.xum.design.mode.factory.NYPeigenPizza;
import com.xum.design.mode.factory.Pizza;
/**
 * 
 * @author xum890312
 *
 */
public class NYFactory implements AbsFactory {

	@Override
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
