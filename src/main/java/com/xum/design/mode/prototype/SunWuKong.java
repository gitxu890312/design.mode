package com.xum.design.mode.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class SunWuKong extends Monkey implements Cloneable, Serializable {

	private GoldBar goldBar;

	public SunWuKong() {
		System.out.println("--------------");
		goldBar = new GoldBar();
		this.height = 150;
		this.weight = 30;
		this.birthday = new Date();
		goldBar.setLength(10);
		goldBar.setR(5);
	}

	/**
	 * 变身
	 * 
	 * @throws CloneNotSupportedException
	 */
	public void change() throws Exception {
		SunWuKong clone = (SunWuKong) clone();
		System.out.println("本尊的生日：" + this.getBirthday().getTime());
		System.out.println("分省的生日：" + clone.getBirthday().getTime());
		System.out.println("本尊和分身的生日" + (clone.getBirthday() == this.getBirthday()));
		System.out.println("本尊和分身是否为同一个对象" + (this == clone));
		System.out.println("本尊和分身是否为同一个金箍棒" + (this.goldBar == clone.goldBar));
		System.out.println("分身的金箍棒" + (clone.goldBar));
		System.out.println("本尊的金箍棒" + (this.goldBar));

	}

	@Override
	protected Object clone() {
		// 浅拷贝
		// return super.clone();
		try {
			// 深克隆
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bis);
			SunWuKong readObject = (SunWuKong) ois.readObject();
			// readObject.birthday = new Date();
			return readObject;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) throws Exception {
		SunWuKong sunwukong = new SunWuKong();
		sunwukong.change();
	}

}
