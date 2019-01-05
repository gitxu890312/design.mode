package com.xum.design.mode.factory.simple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.xum.design.mode.factory.Pizza;

public class PizzaStore {
	public Pizza order(String name) {
		//简单工厂，将pizza的创建方式封装到一个类中
		Pizza pizza = new SimpleFactory().createPizza(name);
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
		PizzaStore store = new PizzaStore();
		while(true) {
			String name = store.getName();
			if(name==null||"".equals(name)) {
				break;
			}
			store.order(name);
		}
	}
}
