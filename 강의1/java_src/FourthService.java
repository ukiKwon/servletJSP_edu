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
		out.print("IP:"+ req.getRemoteAddr());
		out.close();
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
