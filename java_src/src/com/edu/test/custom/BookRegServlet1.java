package com.edu.test.custom;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * [0629] VO 객체 이용한 페이지 간 데이터 넘겨주기
 */
//@WebServlet("bookReg")
public class BookRegServlet1 extends HttpServlet {
	
	final String FORWARD_PAGE = "/bookOutput";
	final String FORWARD_DATA1 = "book";
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1. 파라미터 추출
		req.setCharacterEncoding("UTF-8");
		String p1 = req.getParameter("title");
		String p2 = req.getParameter("author");
		String p3 = req.getParameter("publisher");
		
		//2. VO 클래스 = Book 이용해서 넘겨줄 데이터 생성
		Book b1 = new Book(p1, p2, p3);
		req.setAttribute(FORWARD_DATA1, b1);
		
		//유효성 검사 (생략)
		if (p1.isEmpty() || p2.isEmpty() || p3.isEmpty()) {
//			RequestDispatcher rd = req.getRequestDispatcher("bookInput.jsp");
			RequestDispatcher rd = req.getRequestDispatcher("jspTest08.jsp");
			req.setAttribute("error", "책 제목, 작가 이름, 출판사 명을 다시 확인해주세요");
			rd.forward(req, resp);
			return ;
		}
		
		//3. request에 데이터 등록
		req.setAttribute(FORWARD_DATA1, b1);
		//4. 페이지 이동
		ServletContext sc = this.getServletContext();
//		RequestDispatcher rd = sc.getRequestDispatcher(FORWARD_PAGE);
		RequestDispatcher rd = sc.getRequestDispatcher("/bookOutput.jsp"); //[20220701] EL 문법 테스트
		rd.forward(req, resp); //다시 돌아오지 않는다.
		
	}
}
