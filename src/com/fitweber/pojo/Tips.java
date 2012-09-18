package com.fitweber.pojo;

import java.io.Serializable;

public class Tips implements Serializable {
	
	private static final long serialVersionUID = 	-2478236396012275225L;
	
	private String id;
	private String phoneCardId;
	private String title;
	private String message;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhoneCardId() {
		return phoneCardId;
	}
	public void setPhoneCardId(String phoneCardId) {
		this.phoneCardId = phoneCardId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
