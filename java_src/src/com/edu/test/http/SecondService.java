package com.edu.test.http;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//@WebServlet("/second")
public class SecondService extends HttpServlet{
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("INIT() 서블릿 호출.........second");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("SERVICE() 서블릿.........second");
		
		//outsteram  생성
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>"+ req.getMethod()+ " method requested from User</h1></br>");
		out.print("<h1>필터 테스트입니다</br>");
		/* 아래부터 수정 필요 */
		
		out.close();
	};
	
}
