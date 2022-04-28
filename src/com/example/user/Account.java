package com.example.user;

public class Account {
	
		private int id;
		private String name;
		private String email;
	
	public Account() {	
			}
	
	public Account(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public int getld() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
	
}


