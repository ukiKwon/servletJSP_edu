package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/*
 *[0627] 반복 사용하는 서블릿 
 */
@WebServlet("/fourth")
public class FourthService extends HttpServlet {
	@Override
	//service()에서 분기시키고 호출시킴
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		//outsteram  생성
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
		//서비스 구현
		System.out.println("SERVICE()호출");
		System.out.println(arg0.getQueryString());
		if( arg0.getMethod().equals("GET") ) {
			System.out.println("GET()호출");
			doGet(arg0, arg1);
		} else {
			System.out.println(">> not implemented yet");
		}
	};
}
