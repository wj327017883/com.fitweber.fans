/**
 * 
 */
package com.fitweber.pojo;

import java.io.Serializable;

/**
 * 
 * 2012-9-5 ÏÂÎç11:37:57 VisitingCard.java ÃûÆ¬Àà
 * 
 * @author wheatmark hajima11@163.com
 * 
 */

public class VisitingCard implements Serializable {
	
	private static final long serialVersionUID = 	-2478236396012275225L;
	
	private String id;
	private String name;
	private String sex;
	private String title;
	

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

}
