<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 
	[20220701] BookRegServlet1.java -> javaBean 재구현 
 -->
<!-- 
	Book book = new Book(); 
-->
<jsp:useBean id="book" class="com.edu.test.custom.Book"></jsp:useBean>

<!--  
	book.setTitle(request.getParameter("title");
	book.setAutor(request.getParameter("author");
	book.setPublisher(request.getParameter("publisher");
-->
<!-- [Spring] name=book만 있는 정도로 모든게 해결된다. -->
<jsp:setProperty property="*" name="book" />

<% 
	request.setAttribute("book", book);
%>
<!-- 
		ServletContext sc = this.getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher("/bookOutput.jsp"); //[20220701] EL 문법 테스트
		rd.forward(req, resp); //다시 돌아오지 않는다.
 -->
<jsp:forward page="bookOutput.jsp"></jsp:forward>