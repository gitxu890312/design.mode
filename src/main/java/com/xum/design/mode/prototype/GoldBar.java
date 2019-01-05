package com.xum.design.mode.prototype;

import java.io.Serializable;

/**
 * 
 * @author xum890312
 * 金箍棒
 */
public class GoldBar implements Serializable{
	/**
	 * 长度
	 */
	private double length;
	/**
	 * 半径
	 */
	private double r;
	/**
	 * 变大
	 */
	public void zoomUp() {
		length = length *2;
		r = r*2;
	}
	/**
	 * 变小
	 */
	public void zoomDown() {
		length = length / 2;
		r = r / 2;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
	
}
