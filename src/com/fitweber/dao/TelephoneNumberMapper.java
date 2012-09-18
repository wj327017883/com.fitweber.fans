package com.fitweber.dao;

import java.util.List;

import com.fitweber.pojo.TelephoneNumber;
/**
 * 
 * 2012-9-16 ����12:02:01 
 * TelephoneNumberMapper.java
 *
 * @author wheatmark hajima11@163.com
 *
 */
public interface TelephoneNumberMapper {
	
	/**
	 * ����id���ҵ绰����
	 * @param id
	 * @return
	 */
	public TelephoneNumber selectTelephoneNumberById(String id);
	
	/**
	 * ��ȡ���е绰����
	 * @return
	 */
	public List<TelephoneNumber> getAllTelephoneNumber();
	
	/**
	 * �����µ绰����
	 * @param telephoneNumber
	 */
	public void insertTelephoneNumber(TelephoneNumber telephoneNumber);
	
	/**
	 * ���µ绰����
	 * @param telephoneNumber
	 */
	public void updateTelephoneNumber(TelephoneNumber telephoneNumber);
	
	/**
	 * ɾ���绰����
	 * @param telephoneNumber
	 */
	public void deleteTelephoneNumber(TelephoneNumber telephoneNumber);
}
