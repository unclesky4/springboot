package org.unclesky4.springboot.entity;

import java.io.Serializable;

/**
 * 教师类
 * @author unclesky4
 *
 */
public class Teacher implements Serializable{
	
	private static final long serialVersionUID = -8276359255827191685L;
	private int tid;
	private String name;
	private int sex;  // 0:女 1:男
	
	public Teacher() {}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}
	

}
