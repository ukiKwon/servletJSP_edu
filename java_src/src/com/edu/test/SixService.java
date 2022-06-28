package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/*
 *[0628] web.xml >> Servlet config 정보 가지고 오기
 */

public class SixService extends HttpServlet {

	String name, pwd;

	@Override
	public void init(ServletConfig config) throws ServletException {
		/*
		 * [0628] init():: 에서 Servlet config 정보 가지고 오기
		 */
		name = config.getInitParameter("name");
		pwd = config.getInitParameter("pwd");
	}

	@Override
	// service() 설정
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		// outsteram 설정
		PrintWriter out = resp.getWriter();
		out.print("<h1>"+req.getMethod()+"method requested from User</h1></br>");
		/*
		 * [0628] init() 에서 호출해도 되고, 여기서 할당해줘도 됨
		 */
		name = this.getInitParameter("name");
		pwd = this.getInitParameter("pwd");
		
		out.print("name :" + name + ", pwd :" + pwd + "</br>");
		out.close();
	}

}
