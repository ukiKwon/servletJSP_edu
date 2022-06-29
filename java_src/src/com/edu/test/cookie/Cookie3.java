package com.edu.test.cookie;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/*
 *[0629] 지역변수 개념 && 쿠키이용한 cnt 변수 증가 시키기
 */
//@WebServlet("/countcookie")
public class Cookie3 extends HttpServlet {
	@Override

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		//outsteram  생성
		PrintWriter out = resp.getWriter();
		out.print("<h1>"+ req.getMethod()+ " method requested from User</h1></br>");
		
		int cnt = 0;
		/* 아래부터 수정 필요 */
		Cookie[] cookies = req.getCookies();
		for (int i = 0; cookies != null 
						&& i < cookies.length; i++) {
			if (cookies[i].getName().equals("count")) {
				cnt = Integer.parseInt(cookies[i].getValue());
			}
			cnt++;
		}
		if (cookies == null) {
			out.print("<h1> 쿠키 생성 안됨");
			out.print("<script>location.replace('http://localhost:8080/edu/sendcookie');</script>");
		}
		//Cookies 값 변경
		Cookie c = new Cookie("count", cnt+"");
		resp.addCookie(c);
		
		out.close();
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
