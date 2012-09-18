package com.fitweber.action;

import javax.servlet.http.HttpServlet;

/**
 * 2012-9-16 обнГ6:56:05 
 * BaseAction.java
 *
 * @author wheatmark hajima11@163.com
 *
 */

public class BaseAction extends HttpServlet{
	private static final String CONTENT_TYPE = "text/xml; charset=UTF-8";

	/**
	 * @return the contentType
	 */
	public static String getContentType() {
		return CONTENT_TYPE;
	}
	
}
