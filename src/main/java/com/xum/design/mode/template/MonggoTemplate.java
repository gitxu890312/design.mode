package com.xum.design.mode.template;

public class MonggoTemplate extends JDBCTemplae {

	@Override
	public void driver() {
		System.out.println("加载mongo驱动包");
	}

	@Override
	public void prepareSQL() {
		System.out.println("准备mongo查询语句");
		
	}

}
