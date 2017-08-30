package com.boonya.service.provider.entity;

public class User {
	
	private long id;// identify id
	
	private String name;// your account name
	
	private String password;// your password
	
	private String email;// your E-mail
	
	private int   gender;// female:0,male:1
	
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", gender="
				+ gender + "]";
	}
	
	
	

}
