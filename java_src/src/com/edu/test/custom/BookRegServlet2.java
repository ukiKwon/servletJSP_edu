package com.edu.test.custom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * [0629] VO 객체 이용한 페이지 간 데이터 넘겨주기
 */
//@WebServlet("bookOutput")
public class BookRegServlet2 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//수신 처리
		req.setCharacterEncoding("UTF-8");
		Book b2 = (Book) req.getAttribute("FORWARD_DATA1");
		//응답 처리
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>책 제목 :" + b2.getTitle());
		out.print("<h1>책 저자 :" + b2.getAuthor());
		out.print("<h1>책 출판 :" + b2.getPublisher());
		out.close();
	}
}
