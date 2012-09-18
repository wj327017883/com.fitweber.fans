package com.fitweber.dao;

import java.util.List;

import com.fitweber.pojo.Tips;
/**
 * 
 * 2012-9-16 ����12:01:47 
 * TipsMapper.java
 *
 * @author wheatmark hajima11@163.com
 *
 */
public interface TipsMapper {
	
	/**
	 * ����id������Ϣ
	 * @param id
	 * @return
	 */
	public Tips selectTipsById(String id);
	
	/**
	 * ��ȡ������Ϣ
	 * @return
	 */
	public List<Tips> getAllTips();
	
	/**
	 * ��������Ϣ
	 * @param tips
	 */
	public void insertTips(Tips tips);
	
	/**
	 * ������Ϣ
	 * @param tips
	 */
	public void updateTips(Tips tips);
	
	/**
	 * ɾ����Ϣ
	 * @param tips
	 */
	public void deleteTips(Tips tips);
}
