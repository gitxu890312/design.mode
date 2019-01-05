package com.xum.design.mode.strategy.good;
/**
 * 
 * @author 
 * 吃鸡游戏角色
 */
public  class Role {
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 武器接口
	 * 默认为徒手攻击
	 */
	private Weapon weapon = new HandWeapon();
	/**
	 * 攻击函数
	 */
	public void attack() {
		//调用武器的攻击函数
		weapon.attack();
	}
	/**
	 * 获取武器
	 * @return
	 */
	public Weapon getWeapon() {
		return weapon;
	}
	/**
	 * 修改武器
	 * @param weapon
	 */
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public static void main(String[] args) {
		Role role = new Role();
		//默认的攻击方式
		role.attack();
		//获取到匕首
		role.setWeapon(new Dagger());
		role.attack();
		//获取到枪支
		role.setWeapon(new Gun());
		role.attack();
	}
}
