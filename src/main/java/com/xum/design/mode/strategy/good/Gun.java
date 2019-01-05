package com.xum.design.mode.strategy.good;

public class Gun implements Weapon{
	@Override
	public void attack() {
		System.out.println("枪攻击 减掉20血量");
	}
}
