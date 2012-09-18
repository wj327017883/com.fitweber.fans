/**
 * 
 */
package com.fitweber.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.fitweber.pojo.TelephoneNumber;
import com.fitweber.pojo.VisitingCard;

/**
 *2012-9-2 parseXML.java
 *
 * @author wheatmark hajima11@163.com
 *
 */
public class parseXML extends HttpServlet{
	
	private static final String CONTENT_TYPE = "text/xml; charset=UTF-8";
	public void doGet(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		request.setCharacterEncoding("UTF-8");
		response.setContentType(CONTENT_TYPE);
		SAXReader reader = new SAXReader();
		PrintWriter out = response.getWriter();
		StringBuffer responseString=new StringBuffer();
		responseString.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?><root><success>Bing Go!</success></root>");
		
		try {
			Document doc = reader.read(request.getInputStream());
			List telephoneInfoList = doc.selectNodes("//telephoneInfo");
			List telephoneNumberList;
			VisitingCardService visitingCardService = new VisitingCardService();
			TelephoneNumberService telephoneNumberService = new TelephoneNumberService();
			String visitingCardId = null,telephoneNumberId=null;
			VisitingCard visitingCard;
			TelephoneNumber telephoneNumber;
			
			for(Object object : telephoneInfoList){
				Element e = (Element)object;
				//System.out.println(e.elementText("name"));
				visitingCard = new VisitingCard();
				visitingCardId = "visitingCard"+Long.toString(System.currentTimeMillis());
				visitingCard.setId(visitingCardId);
				visitingCard.setName(e.elementText("name"));
				visitingCardService.saveVisitingCard(visitingCard);
				telephoneNumberList = e.selectNodes("telephoneNumbers/telephoneNumber");
				for (Object obj : telephoneNumberList) {
					Element telephoneNumberNode =(Element)obj;
					//System.out.println(telephoneNumberNode.getText());
					telephoneNumberId = "telephoneNumber"+Long.toString(System.currentTimeMillis());
					telephoneNumber = new TelephoneNumber(); 
					telephoneNumber.setId(telephoneNumberId);
					telephoneNumber.setVisitCardId(visitingCardId);
					telephoneNumber.setTelephoneNumber(telephoneNumberNode.getText());
					telephoneNumberService.saveTelephoneNumber(telephoneNumber);
				}
			}
		}catch (DocumentException e) {
			e.printStackTrace();
		}
		out.write(responseString.toString());
		out.close();
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		doGet(request,response);
	}
}
