package org.unclesky4.springboot.entity;

/**
 * 用户类
 * @author unclesky4
 *
 */
public class User {

	private long id;
	private String name;
	private int age;
	
	public User() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
