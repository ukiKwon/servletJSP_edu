package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/*
 *[0628] ServletContext에 저장되어있는 값 접근하기
 *	ServenService에서 사용한 정보 ---> ServletContext에 저장되었음
 */
@WebServlet("/context2")
public class EeightService extends HttpServlet {
	@Override
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		//outsteram  생성
		PrintWriter out = resp.getWriter();out.print("<h1>Get method requested from User</h1></br>");

		
		//ServletContext 정의
		ServletContext sc = this.getServletContext();
		
		//저장된 내용 찍어보기
		/*
		 * ※getter 메소드가 return 타입 == Object 일 경우
		 * Object 클래스밖에 접근이 안된다. 그래서, 자식으로 TypeCasting 해줘야함
		 * 
		 */
		ShareObject obj1 = (ShareObject)sc.getAttribute("COMM_DATA1");
		ShareObject obj2 = (ShareObject)sc.getAttribute("COMM_DATA2");
		//예외 처리
		if (obj1 == null || obj2 ==null) {
			out.print(">> 아직 ServletContext에 저장된 ShareObject 내용이 없습니다.");
			out.close();
			
			return;
		}
		out.print("OBJ1 >> "+obj1.getCount()+"</br>");
		out.print("OBJ1 >> "+obj1.getStr()+"</br>");
		
		out.print("OBJ2 >> "+obj2.getCount()+"</br>");
		out.print("OBJ2 >> "+obj2.getStr()+"</br>");
		
		out.close();
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
