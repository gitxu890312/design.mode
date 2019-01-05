package com.xum.design.mode.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author xum890312
 * 猴子
 */
public class Monkey implements Serializable {
	protected float height;
	
	protected float weight;
	
	protected Date birthday;
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

//	public Date getBirthday() {
//		return birthday;
//	}
//
//	public void setBirthday(Date birthday) {
//		this.birthday = birthday;
//	}


}
