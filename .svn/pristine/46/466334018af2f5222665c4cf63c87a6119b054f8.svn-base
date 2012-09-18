package com.fitweber.service.test;

import java.io.Reader;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.fitweber.dao.TipsMapper;
import com.fitweber.dao.VisitingCardMapper;
import com.fitweber.pojo.Tips;
import com.fitweber.pojo.VisitingCard;
import com.fitweber.service.SqlSessionFactoryService;

public class testMyBatis {
	@SuppressWarnings("deprecation")
	@Test
	public void test(){
		SqlSession session =null;
		try {
			String timeMark = Long.toString(System.currentTimeMillis());
			SqlSessionFactory sessionFactory =  SqlSessionFactoryService.getSqlSessionFactory();
			session = sessionFactory.openSession();
//			TipsMapper tipsMapper = session.getMapper(TipsMapper.class);
			VisitingCardMapper visitingCardMapper = session.getMapper(VisitingCardMapper.class);
			VisitingCard visitingCard = new VisitingCard();
			visitingCard.setId("visitCard"+timeMark);
			visitingCard.setName(timeMark);
			visitingCardMapper.insertVisitingCard(visitingCard);
			System.out.println(new Date(Long.parseLong(visitingCardMapper.selectVisitingCardById("visitCard"+timeMark).getName())).toLocaleString());
//			List<Tips> tipsList = tipsMapper.getAllTips();
//			for (Tips tips : tipsList) {
//				System.out.println(tips.getMessage());
//			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			session.close();
		}
	}
}
