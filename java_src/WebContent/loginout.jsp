<%@page import="javax.xml.ws.Response"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%!final String POST_TYPE = "POST";%>
<%
	//실행결과를 다시 로그인아웃 메인으로 돌려주기 위한 자료 
	RequestDispatcher rd = request.getRequestDispatcher("logInOutMain.jsp");

	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	if (request.getMethod().equals("POST")) {
		if (id.isEmpty() || pwd.isEmpty()) {
			request.setAttribute("msg", "ID와 비밀번호를 확인해주세요");
			rd.forward(request, response);
			return;
		}
		if (session.isNew() || session.getAttribute("id") == null) {//로그 in 시도
			session.setAttribute("id", id);
			out.println("로그인 되었습니다.");
		} else {//로그 in 중임
			out.println("현재 로그인 되어있습니다.");
		}
	} else if (request.getMethod().equals("GET")){
		if (session != null && session.getAttribute("id") != null) {
			session.invalidate(); //세션 죽이기
			out.print("로그아웃 작업 완료");
		} else {
			out.print("로그인 상태가 아닙니다");
		}
	}
	//로그인/로그아웃 여부와 상관없이 작업 요청했던 화면으로 돌려보내기
	rd.forward(request, response);
%>
OK

