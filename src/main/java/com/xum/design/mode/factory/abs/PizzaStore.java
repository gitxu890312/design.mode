package com.xum.design.mode.factory.abs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.xum.design.mode.factory.Pizza;

public class PizzaStore {
	// 抽象工厂，将创建对象的方法，封装到接口中
	private AbsFactory factory;

	public PizzaStore(AbsFactory factory) {
		this.factory = factory;
	}

	public Pizza order(String name) {
		// 简单工厂，将pizza的创建方式封装到一个类中
		Pizza pizza = factory.createPizza(name);
		if (pizza == null) {
			return pizza;
		}
		pizza.prepare();
		pizza.make();
		pizza.cut();
		pizza.pack();
		return pizza;
	}

	public String getName() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String readLine = null;
		try {
			readLine = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return readLine;
	}

	public static void main(String[] args) {
		PizzaStore store = new PizzaStore(new CNFactory());
		while (true) {
			String name = store.getName();
			if (name == null || "".equals(name)) {
				break;
			}
			store.order(name);
		}
	}
}
