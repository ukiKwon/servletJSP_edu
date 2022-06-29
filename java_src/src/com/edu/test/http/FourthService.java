package com.edu.test.http;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/*
 *[0627] �ݺ� ����ϴ� ���� 
 */
//@WebServlet("/fourth")
public class FourthService extends HttpServlet {
	@Override
	//service()���� �б��Ű�� ȣ���Ŵ
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		//outsteram  ����
		PrintWriter out = resp.getWriter();
		out.print("<h1>Get method requested from User</h1>");
//		out.print("IP:"+ req.getRemoteAddr());
		out.print("client IP:<h1>" + req.getRemoteAddr()+"</h1>");
		out.print("server URL:<h1>" + req.getRequestURL()+"</h1>");
		out.print("server URI:<h1>" + req.getRequestURI()+"</h1>");
		out.print("server Context:<h1>" + req.getContextPath()+"</h1>");
		out.print("server path:<h1>" + req.getServletPath()+"</h1>");
		out.print("server name:<h1>" + req.getServerName()+"</h1>");
		out.print("server port:<h1>" + req.getServerPort()+"</h1>");		
		
		out.close();
	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) 
																			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.service(arg0, arg1);
		//���� ����
		System.out.println("SERVICE()ȣ��");
		System.out.println(arg0.getQueryString());
		if( arg0.getMethod().equals("GET") ) {
			System.out.println("GET()ȣ��");
			doGet(arg0, arg1);
		} else {
			System.out.println(">> not implemented yet");
		}
	};
}
