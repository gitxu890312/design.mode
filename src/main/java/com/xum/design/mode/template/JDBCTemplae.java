package com.xum.design.mode.template;

public abstract class JDBCTemplae {

	/**
	 * jdbc的通用执行流程
	 */
	public final void createJDBC() {
		//1加载驱动
		driver();
		//2.创建连接
		createConnect();
		//3.封装语句集
		prepareSQL();
		//4.执行sql
		execute();
		//5.获取查询结果
		getResult();
	}
	public abstract void driver();
	
	public void createConnect() {
		System.out.println("创建连接");
	}
	public abstract  void prepareSQL() ;
	
	public void execute() {
		System.out.println("执行sql");
	}
	public void getResult() {
		System.out.println("获取查询结果");
	}
	
	public static void main(String[] args) {
		JDBCTemplae templte = new MysqlTemplate();
		templte.createJDBC();
	}
}
