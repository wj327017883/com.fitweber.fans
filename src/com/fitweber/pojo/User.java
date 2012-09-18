package com.fitweber.pojo;

import java.io.Serializable;

public class User implements Serializable {
	
	private static final long serialVersionUID = 	-2478236396012275225L;
	private String id;
	private String userName;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
