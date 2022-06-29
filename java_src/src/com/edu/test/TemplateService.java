package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/*
 *[0627] 템플릿 설정
 */
@WebServlet("/test")
public class TemplateService extends HttpServlet {
	@Override

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		//outsteram  생성
		PrintWriter out = resp.getWriter();
		out.print("<h1>"+ req.getMethod()+ " method requested from User</h1></br>");
		/* 아래부터 수정 필요 */
		
		out.close();
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
