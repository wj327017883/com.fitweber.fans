/**
 * 
 */
package com.fitweber.pojo;

/**
 * 
 * 2012-9-5 ����11:45:02 
 * TelephoneNumber.java
 * �绰������
 * @author wheatmark hajima11@163.com
 *
 */
public class TelephoneNumber {
	private String Id;
	private String visitCardId;
	private String telephoneNumber;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		Id = id;
	}
	/**
	 * @return the visitCardId
	 */
	public String getVisitCardId() {
		return visitCardId;
	}
	/**
	 * @param visitCardId the visitCardId to set
	 */
	public void setVisitCardId(String visitCardId) {
		this.visitCardId = visitCardId;
	}
	/**
	 * @return the telephoneNumber
	 */
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	/**
	 * @param telephoneNumber the telephoneNumber to set
	 */
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
	
}
