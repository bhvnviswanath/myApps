package com.learning.rest.bean;

import javax.validation.constraints.Size;

public class User {

	private int id;
	
	@Size(min=3, message="Name should have minimum 3 characters")
	private String userName;
	private String userOccupation;

	public User(int id, String userName, String userOccupation) {
		super();
		this.id = id;
		this.userName = userName;
		this.userOccupation = userOccupation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserOccupation() {
		return userOccupation;
	}

	public void setUserOccupation(String userOccupation) {
		this.userOccupation = userOccupation;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userOccupation=" + userOccupation + "]";
	}

	
	
}
