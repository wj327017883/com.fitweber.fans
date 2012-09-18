package com.fitweber.dao;

import java.util.List;

import com.fitweber.pojo.Tips;
/**
 * 
 * 2012-9-16 上午12:01:47 
 * TipsMapper.java
 *
 * @author wheatmark hajima11@163.com
 *
 */
public interface TipsMapper {
	
	/**
	 * 根据id查找消息
	 * @param id
	 * @return
	 */
	public Tips selectTipsById(String id);
	
	/**
	 * 获取所有消息
	 * @return
	 */
	public List<Tips> getAllTips();
	
	/**
	 * 插入新消息
	 * @param tips
	 */
	public void insertTips(Tips tips);
	
	/**
	 * 更新消息
	 * @param tips
	 */
	public void updateTips(Tips tips);
	
	/**
	 * 删除消息
	 * @param tips
	 */
	public void deleteTips(Tips tips);
}
