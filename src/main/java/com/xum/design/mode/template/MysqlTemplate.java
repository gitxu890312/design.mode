package com.xum.design.mode.template;
/**
 * 
 * @author xum890312
 * mysql jdbc执行模板
 */
public class MysqlTemplate extends JDBCTemplae{

	@Override
	public void driver() {
		System.out.println("加载mysql驱动");
	}

	@Override
	public void prepareSQL() {
		// TODO Auto-generated method stub
		System.out.println("准备mysql查询语句");
	}

}
