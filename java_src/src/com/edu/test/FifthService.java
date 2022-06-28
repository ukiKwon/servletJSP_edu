package com.edu.test;

import java.io.*;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import sun.security.krb5.EncryptedData;

/*
 *[0628] InputStream 의 Header 정보 보기
 */
@WebServlet("/fifth")
public class FifthService extends HttpServlet {
	final static int MAX_AGE = 32;

//	@Override
//	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.service(arg0, arg1);
//		PrintWriter out = arg1.getWriter();
//
//		out.print("<h1>" + arg0.getMethod());
//		out.print("<h1>" + arg0.getContentType());
//		out.print("<h1>" + arg0.getContentLength());
//
//		if (arg0.getMethod().equals("GET")) {
//			out.print("<h1>" + arg0.getMethod() + " method requested from User</h1></br>");
//			doGet(arg0, arg1);
//		} else {
//			out.print("<h1>" + arg0.getMethod() + " method requested from User</h1></br>");
//			doPost(arg0, arg1);
//		}
//		out.close();
//	}

	@Override
	// service()에서 분기시키고 호출시킴
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		// outsteram 생성
		PrintWriter out = resp.getWriter();
		/*
		 * * [0628] 파라미터 기초 작업
		 */

		/*
		 * /* [0628] InputStream 의 Header 정보 보기
		 */
		// out.print("<h1>"+req.getMethod());
		// out.print("<h1>"+req.getContentType());
		// out.print("<h1>"+req.getContentLength());
		// out.print("<h1>"+req.getQueryString()+"</h1></br>");
		/*
		 * [0628] InputStream 의 Body 정보 보기
		 */
		req.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String sex = req.getParameter("sex");

		// [0628] 나이제한 출력
		if (age != null && Integer.parseInt(age) <= MAX_AGE) {
			out.print("<h1> 이름: " + name + "</hr>");
			out.print("<h1> 나이: " + age + "</hr>");
			out.print("<h1> 성별:" + sex + "</hr>");
		} else {
			out.print("<h1> 나이 제한에 걸렸습니다.(" + MAX_AGE + "살 이하 가능)</h1> </hr>");
		}
		out.close();
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		// outsteram 생성
		PrintWriter out = resp.getWriter();
		/*
		 * [0628] InputStream 의 Header 정보 보기
		 */
			// out.print("<h1>"+req.getMethod());
			// out.print("<h1>"+req.getContentType());
			// out.print("<h1>"+req.getContentLength());
			// out.print("<h1>"+req.getQueryString()+"</h1></br>");
		/*
		 * [0628] InputStream 의 Body 정보 보기
		 */
		req.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String sex = req.getParameter("sex");

		// [0628] 나이제한 출력
		if (age != null && Integer.parseInt(age) <= MAX_AGE) {
			out.print("<h1> 이름: " + name + "</hr>");
			out.print("<h1> 나이: " + age + "</hr>");
			out.print("<h1> 성별:" + sex + "</hr>");
		} else {
			out.print("<h1> 나이 제한에 걸렸습니다.(" + MAX_AGE + "살 이하 가능)</h1> </hr>");
		}
		out.close();
	}
}
