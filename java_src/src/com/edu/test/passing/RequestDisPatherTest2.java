package com.edu.test.passing;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * [0629] RequestDisPatcher 이용한 페이지 이동
 */
//@WebServlet("dispatcher2")
public class RequestDisPatherTest2 extends HttpServlet {
	final String PARAM1 = "id";
	final String PARAM2 = "pwd";
	final String PARAM3 = "site";

	// 데이터 연결 시 URL 바껴서 사용자에게 보여움
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		//outsteram  생성
		PrintWriter out = resp.getWriter();
		out.print("<h1>"+ req.getMethod()+ " method requested from User</h1></br>");
		/* 아래부터 수정 필요 */
		out.print("<h1>Page 2! </h2>");
		
		out.close();

	}
}