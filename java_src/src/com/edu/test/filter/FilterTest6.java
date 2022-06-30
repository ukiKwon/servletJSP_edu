package com.edu.test.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("test6")
public class FilterTest6 extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		//outsteram  생성
		PrintWriter out = resp.getWriter();
		out.print("<h1>"+ req.getMethod()+ " method requested from User</h1></br>");
		out.print("<h1> 이름: " + req.getParameter("name")+"</br>");

		out.close();
	}
}
