package com.edu.test.passing;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * [0629] 페이지 이동
 */
//@WebServlet("portalSite")
public class PortalSite extends HttpServlet {
	final String PARAM1 = "id";
	final String PARAM2 = "pwd";
	final String PARAM3 = "site";

	// 데이터 연결 시 URL 바껴서 사용자에게 보여움
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//1. HttpServletRequest 방식 (* URL 변경 일어
		String p1 = req.getParameter(PARAM3);
		if (p1.equals("naver")) {
			resp.sendRedirect("http://www.naver.com");
		} else if (p1.equals("daum")) {
			resp.sendRedirect("http://www.daum.net");
		} else if (p1.equals("zum")) {
			resp.sendRedirect("http://www.zum.com");
		} else if (p1.equals("google")) {
			resp.sendRedirect("https://www.google.com");
		} else {
			;
		}

	}
}