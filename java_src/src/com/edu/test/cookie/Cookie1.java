package com.edu.test.cookie;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/*
 *[0629] Cookie 전송 테스트
 */
//@WebServlet("/sendcookie")
public class Cookie1 extends HttpServlet {

	final String COOKIE_ID = "guest";
	final String COOKIE_NAME = "uki";
	final String COOKIE_SUBJECT = "java";
	final String COOKIE_COUNT = "0";

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		// outsteram 생성
		PrintWriter out = resp.getWriter();
		out.print("<h1>" + req.getMethod() + " method requested from User</h1></br>");
		/* 아래부터 수정 필요 */
		out.print("<h1>Cookie 전송 작업</br>");
		
		/* << Cookie >>
		 * name ||  value
		 * id 	  	COOKIE_ID
		 * name 	COOKIE_NAME
		 * subject	COOKIE_SUBJECT
		 */
		
		//[test1] 기본 쿠키 생성/전송
		Cookie c1 = new Cookie("id", COOKIE_ID);
//		c1.setComment("테스트용 쿠키");
		c1.setPath("/");
		resp.addCookie(c1);
		
		//[test2] Cookies3에서 사용
		Cookie c2 = new Cookie("name", COOKIE_NAME);
		c2.setMaxAge(60);// 초단위
		c2.setPath("/");
		resp.addCookie(c2);

		//[test3] Cookies3에서 사용
		Cookie c3 = new Cookie("subject", COOKIE_SUBJECT);
		c3.setMaxAge(60*60);// 초단위
		c3.setPath("/");
		resp.addCookie(c3);

		//[test4] Cookies3에서 사용
		Cookie c4 = new Cookie("count", COOKIE_COUNT);
		c4.setMaxAge(60*60*60);// 초단위
		c4.setPath("/");
		resp.addCookie(c4);
		
		out.close();
	}

}
