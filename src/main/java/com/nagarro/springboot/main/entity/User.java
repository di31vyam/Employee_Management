package com.nagarro.springboot.main.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User 
{
	@Id
	private String UserId;
	
	
	private String password;

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
