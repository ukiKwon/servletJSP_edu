package com.edu.test.custom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * [0629] 로그인/아웃 
 */
//@WebServlet("/LogInOutServlet")
public class LogInOutServlet extends HttpServlet {
	final String PARAM1 = "id";
	final String PARAM2 = "pwd";

	//로그인 받음
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter o = resp.getWriter();
		/* 
		 * back 작업
		 */
		//1. ID,비밀번호 추출
		String id = req.getParameter(PARAM1);
		String pwd = req.getParameter(PARAM2);
		//2. 유효성 검사 --> 입력 페이지에서
		if ( id == null || pwd == null ||	//파라미터가 아예 전달되지 않았을 경우
			id.trim().isEmpty() || pwd.trim().isEmpty() ) { //공백 제거 했을시에도 비었을 경우
			System.out.println("ID 또는 비밀번호를 입력하세요");
			o.print("<script>console.log('또는 비밀번호를 입력하세요');</script>");
			o.close();
			return ;
		}
		//3. DB 데이터 삽입
		//4. 현재 로그인 상태 여부 판단 
		HttpSession s = req.getSession(true);
		if( s.isNew() || s.getAttribute(PARAM1) == null) {//로그 in 시도
			System.out.println("현재 로그아웃 되어있습니다.");
			s.setAttribute(PARAM1, id);
			System.out.println("로그인 되었습니다.");
		} else {//로그 in 중임
			System.out.println("현재 로그인 되어있습니다.");			
		}
		//5. 로그인 작업 처리
		
	}
	//로그아웃 받음
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		//outsteram  생성
		PrintWriter out = resp.getWriter();
		out.print("<h1>"+ req.getMethod()+ " method requested from User</h1></br>");
		/* 아래부터 수정 필요 */
		//4. 현재 로그인 상태 여부 판단 
		HttpSession s = req.getSession(false);	//굳이 없으면 새로 만들 필요가 없으니깐 -->  false
		
		if ( s != null && s.getAttribute(PARAM1) != null) { 
			s.invalidate(); //세션 죽이기
			out.print("로그아웃 작업 완료");
		} else {
			out.print("로그인 상태가 아닙니다");
		}
		
		out.close();
	}
	
}
