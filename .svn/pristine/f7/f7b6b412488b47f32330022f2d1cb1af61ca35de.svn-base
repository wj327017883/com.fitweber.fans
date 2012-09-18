/**
 * com.fitweber.fans TelephoneNumberService
 */
package com.fitweber.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.fitweber.service.SqlSessionFactoryService;

import com.fitweber.dao.TelephoneNumberMapper;
import com.fitweber.pojo.TelephoneNumber;

/**
 * 2012-9-16 ÏÂÎç7:17:01 
 * TelephoneNumberService.java
 *
 * @author wheatmark hajima11@163.com
 *
 */

public class TelephoneNumberService {
	private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryService.getSqlSessionFactory();
	
	/**
	 * 
	 * @param telephoneNumber
	 */
	public void saveTelephoneNumber(TelephoneNumber telephoneNumber){
		SqlSession session = sqlSessionFactory.openSession();
		TelephoneNumberMapper telephoneNumberMapper=session.getMapper(TelephoneNumberMapper.class);
		telephoneNumberMapper.insertTelephoneNumber(telephoneNumber);
		session.commit();
		session.close();
	}
	
	/**
	 * 
	 * @param telephoneNumberList
	 */
	public void batchSaveTelephoneNumber(List<TelephoneNumber> telephoneNumberList){
		
	}
}
