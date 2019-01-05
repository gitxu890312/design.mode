package com.xum.design.mode.strategy.good;

public class Grenade implements Weapon{
	@Override
	public void attack() {
		System.out.println("手榴弹攻击  减掉30血量");
	}
}
