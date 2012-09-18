/**
 * com.fitweber.fans VisitingCardService
 */
package com.fitweber.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.fitweber.dao.VisitingCardMapper;
import com.fitweber.pojo.VisitingCard;

/**
 * 2012-9-16 ÏÂÎç11:48:51 
 * VisitingCardService.java
 *
 * @author wheatmark hajima11@163.com
 *
 */

public class VisitingCardService {
	private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryService.getSqlSessionFactory();
	
	/**
	 * 
	 * @param visitingCard
	 */
	public void saveVisitingCard(VisitingCard visitingCard){
		SqlSession session = sqlSessionFactory.openSession();
		VisitingCardMapper visitingCardMapper=session.getMapper(VisitingCardMapper.class);
		visitingCardMapper.insertVisitingCard(visitingCard);
		session.commit();
		session.close();
	}
	
	/**
	 * 
	 * @param visitingCardList
	 */
	public void batchSaveVisitingCard(List<VisitingCard> visitingCardList){
		
	}
}
