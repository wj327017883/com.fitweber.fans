package com.fitweber.action.interfaces;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 2012-9-16 下午7:04:14 
 * sampleServlet.java
 *
 * @author wheatmark hajima11@163.com
 *
 */

public interface SampleServlet {
	/**
	 * Servlet Get 方式请求方法
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException;
	
	/**
	 * Servlet Post 方式请求方法
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException;
}
