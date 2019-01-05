package com.xum.design.mode.strategy.good;

public class Dagger implements Weapon {
	@Override
	public void attack() {
		System.out.println("匕首 攻击减掉10 血量");
	}
}
