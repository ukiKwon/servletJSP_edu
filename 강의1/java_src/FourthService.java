package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/*
 *[0627] �ݺ� ����ϴ� ���� 
 */
@WebServlet("/fourth")
public class FourthService extends HttpServlet {
	@Override
	//service()���� �б��Ű�� ȣ���Ŵ
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		//outsteram  ����
		PrintWriter out = resp.getWriter();
		out.print("<h1>Get method requested from User</h1>");
		out.print("IP:"+ req.getRemoteAddr());
		out.close();
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
