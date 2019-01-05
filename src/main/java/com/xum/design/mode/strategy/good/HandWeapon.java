package com.xum.design.mode.strategy.good;

public class HandWeapon implements Weapon{

	@Override
	public void attack() {
		System.out.println("拳击 减掉5血量");
	}

}
