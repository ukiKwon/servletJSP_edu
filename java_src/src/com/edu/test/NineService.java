package com.edu.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/*
 * [0628] 변수 생명 주기 확인
 * doGet 내부에 cnt 변수 넣을 때와
 * NineServce 내부에 cnt 변수 넣을 때 차이 확인
 * 확인 방법 : 새로 고침 시마다 cnt 값 증가 확인
 */
@WebServlet("/test9")
public class NineService extends HttpServlet {
	
	//********** 모든 사용자가 공유하게 됨 *******************
 	int cnt = 0;// 멤버변수::새로 고침 누른 횟수

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		// 새로 고침 수 확인
		// int cnt = 0;//지역변수::새로 고침 누른 횟수; ********** 단일사용자가 사용하게 됨 *******************
		this.cnt++;	//this 라고 하면 heap 에 있는 변수로 접근하게끔 한다.

		// outsteram 생성
		PrintWriter out = resp.getWriter();
		out.print("<h1>" + req.getMethod() + " method requested from User</h1></br>");

		out.print("<h1>Cnt>>> " + cnt + "</h1></br>");
		out.close();
	}

}
