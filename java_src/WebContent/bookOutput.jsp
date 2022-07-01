<%@page import="com.edu.test.custom.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!--[20220701] BookRegServlet2 에서 하는 Servlet을 JSP로 구현함 
	* [JSP 방식] jspTest08.jsp -> BookReServlet1 -> bookOutput.jsp 
	* [Servlet 방식] jspTest08.jsp -> BookReServlet1 -> BookReServlet2 
-->
<% 
	Book b1 = (Book) request.getAttribute("book");
%>
<br>
	<p> 스크립트 방식 입니다. </p>

<%= b1.getTitle() %><br>
<%= b1.getAuthor() %><br>
<%= b1.getPublisher() %><br> 

<br>
 <p> EL 표현식입니다. </p>
 	${book} </br>
	${book.title} </br> <!-- EL에서 알아서 book 객체의 getTitle() 호출함 -->
	${book.author} </br>
	${book.publisher} </br>
 	
