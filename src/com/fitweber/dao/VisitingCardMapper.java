/**
 * 
 */
package com.fitweber.dao;

import java.util.List;

import com.fitweber.pojo.VisitingCard;

/**
 * 2012-9-16 上午12:01:27 
 * VisitingCardMapper.java
 *
 * @author wheatmark hajima11@163.com
 *
 */

public interface VisitingCardMapper {
	/**
	 * 根据id查找名片
	 * @param id
	 * @return
	 */
	public VisitingCard selectVisitingCardById(String id);
	
	/**
	 * 获取所有名片
	 * @return
	 */
	public List<VisitingCard> getAllVisitingCard();
	
	/**
	 * 插入新名片
	 * @param visitingCard
	 */
	public void insertVisitingCard(VisitingCard visitingCard);
	
	/**
	 * 更新名片
	 * @param visitingCard
	 */
	public void updateVisitingCard(VisitingCard visitingCard);
	
	/**
	 * 删除名片
	 * @param visitingCard
	 */
	public void deleteVisitingCard(VisitingCard visitingCard);
}
