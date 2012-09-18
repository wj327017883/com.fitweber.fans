/**
 * 
 */
package com.fitweber.dao;

import java.util.List;

import com.fitweber.pojo.VisitingCard;

/**
 * 2012-9-16 ����12:01:27 
 * VisitingCardMapper.java
 *
 * @author wheatmark hajima11@163.com
 *
 */

public interface VisitingCardMapper {
	/**
	 * ����id������Ƭ
	 * @param id
	 * @return
	 */
	public VisitingCard selectVisitingCardById(String id);
	
	/**
	 * ��ȡ������Ƭ
	 * @return
	 */
	public List<VisitingCard> getAllVisitingCard();
	
	/**
	 * ��������Ƭ
	 * @param visitingCard
	 */
	public void insertVisitingCard(VisitingCard visitingCard);
	
	/**
	 * ������Ƭ
	 * @param visitingCard
	 */
	public void updateVisitingCard(VisitingCard visitingCard);
	
	/**
	 * ɾ����Ƭ
	 * @param visitingCard
	 */
	public void deleteVisitingCard(VisitingCard visitingCard);
}
