package com.edu.test.servletcontext;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/*
 *[0628] Servlet Context 
 * W/A 간에 ServletContext 정보 교환해보기
 */
//@WebServlet("/context1")
public class SevenService extends HttpServlet {
	@Override
	// [0628] 서버간 변수 공유 방법
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html;charset=UTF-8");
		// outsteram 설정
		PrintWriter out = resp.getWriter();
		out.print("<h1>Get method requested from User</h1></br>");
		// Servlet Context 추출
		ServletContext sc = this.getServletContext();
		/*
		 * 추출해서 확인해보는 것들 1- 서버 정보 얻기
		 */
		out.print("<h1>server Majorinfo: </h1>" + sc.getMajorVersion() + "</br>");
		out.print("<h1>server Minorinfo: </h1>" + sc.getMinorVersion() + "</br>");
		out.print("<h1>server Serverinfo: </h1>" + sc.getServerInfo() + "</br>");
		/*
		 * 추출해서 확인해보는 것들 2- web.xml >> Web Application 변수 사용
		 */
		out.print("<h1>server Application info: </h1>" + sc.getInitParameter("comm_config") + "</br>");
		/*
		 * 추출해서 확인해보는 것들 3- Web Application 변수 설정/수정
		 */
		ShareObject obj1 = new ShareObject();
		obj1.setCount(10000);
		obj1.setStr("HAHA");

		ShareObject obj2 = new ShareObject();
		obj2.setCount(20000);
		obj2.setStr("HOHO");

		// Heap에 있는 ServletContext -> COMM_DATA1, COMM_DATA2가 저장된 주소가 저장됨
		sc.setAttribute("COMM_DATA1", obj1);
		sc.setAttribute("COMM_DATA2", obj2);

		// servlet 종료시에 지역변수 sc는 삭제됨
		out.close();
	}

}
