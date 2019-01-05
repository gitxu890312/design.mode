package com.xum.design.mode.factory;

public interface Pizza {
	
	public String getName();
	/**
	 * 准备原料
	 */
	public void prepare();
	
	/**
	 * 制作
	 */
	public default void make() {
		System.out.println("制作"+getName());
	}
	
	/**
	 * 切割
	 */
	public default void cut() {
		System.out.println("切割"+getName());
	};
	
	/**
	 * 包装
	 */
	public default void pack() {
		System.out.println("包装"+getName());
	}
}
