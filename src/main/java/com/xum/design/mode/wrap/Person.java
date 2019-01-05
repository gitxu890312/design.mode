package com.xum.design.mode.wrap;
/**
 * 被装饰者（主体）人
 */
public class Person implements Show {
	@Override
	public String show() {
		return "人";
	}
	public static void main(String[] args) {
		Show show = new Person();
		System.out.println(show.show());;
		//给人穿个衣服
		show = new Clothes(show);
		System.out.println(show.show());
		//给人穿个鞋子
		show = new Shoe(show);
		System.out.println(show.show());
	}
}
