package com.edu.test.session;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/*
 *[0629] 세션 테스트
 */
//@WebServlet("/temp")
public class SessionTest extends HttpServlet {
	@Override

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		//outsteram  생성
		PrintWriter out = resp.getWriter();
		out.print("<h1>"+ req.getMethod()+ " method requested from User</h1></br>");
		/* 아래부터 수정 필요 */
		
		String param = req.getParameter( "p" );
		HttpSession hs = null; //나중에 집언넣겠다
		String msg = null; //stack 에 생성
		
		if( param.equals("create") ) {	//세션 생성
			hs = req.getSession(true);	//HttpServletRequest에 함수가 있다
			if( hs.isNew() ) {
				msg = "새로운 세션 객체가 생성되었습니다.";
			} else {
				msg = "이전 세션 불러왔습니다";
			}
		} else if ( param.equals("delete") ) { //세션 삭제
			hs = req.getSession(false);
			if (hs != null) {
				hs.invalidate();
				msg = "세션 객체가 삭제되었습니다.";
			} else {
				msg = "세션 객체가 존재하지 않습니다.";
			}
		} else if ( param.equals("add") ) { //세션에 첫번째 데이터 추가
			hs = req.getSession();
			req.setCharacterEncoding("UTF-8");
			hs.setAttribute("data1", "첫번째 데이터");
			msg = "세션 데이터 등록 완료";
		} else if ( param.equals("get") ) { //세션에 등록된 데이터 추출
			 hs = req.getSession(false);
			 if (hs != null) {	
				 String str = (String) hs.getAttribute("data1");
				 req.setCharacterEncoding("UTF-8");
				 msg = "불러온 데이터 입니다 >> " + str;
			 }
		} else if ( param.equals("rem") ) { //세션에 등록된 데이터 삭제
			 hs = req.getSession(false);
			 if (hs != null) {
				 hs.removeAttribute("data1");
				 msg = "세션에 등록된 데이터(data1) 삭제 완료";
			 }
		} else if ( param.equals("rep") ) { //세션에 두번째 데이터 추가
			hs = req.getSession();
			req.setCharacterEncoding("UTF-8");
			hs.setAttribute("data1", "두번째 데이터");
			msg = "세션 데이터 등록 완료";
		} else {
			msg = "존재하지 않는 파라미터 name입니다.";
		}
		
		//
		out.print( "<h1>" + msg );
		out.close();
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
