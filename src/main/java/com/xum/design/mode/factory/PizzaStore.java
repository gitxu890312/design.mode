package com.xum.design.mode.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaStore {

	public Pizza order(String name) {
		Pizza pizza = null;
		if (name.equals("liulian")) {
			pizza = new LiulianPizza();
		} else if (name.equals("peigen")) {
			pizza = new PeigenPizza();
		} else {
			System.out.println("不存在的pizza");
			return null;
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
