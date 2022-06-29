package com.edu.test.cookie;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/*
 *[0629] Cookie1에서 보낸 쿠키 전송 내용을 확인하는 Servlet
 */
//@WebServlet("/viewcookie")
public class Cookie2 extends HttpServlet {
	@Override

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		//outsteram  생성
		PrintWriter out = resp.getWriter();
		out.print("<h1>"+ req.getMethod()+ " method requested from User</h1></br>");
		/* 아래부터 수정 필요 */
		Cookie[] cookies = req.getCookies();
		for (int i = 0; cookies!=null && i < cookies.length; i++) {
			Cookie c = cookies[i];
			out.print("<h1>"+ c.getName() + " - " + c.getValue());
		}
		if (cookies == null) {
			out.print("<h1> 쿠키 생성 안됨");
			out.print("<script>location.replace('http://localhost:8080/edu/sendcookie');</script>");
		}
		out.close();
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
