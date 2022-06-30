<%@page import="com.edu.test.custom.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- <%! Book b1 = new Book(); %> --%>
<%
	Book b1 = (Book) request.getAttribute("book");
	if (b1 == null) {
		b1 = new Book();
	}
%>
<form action="bookReg" method="post">
	책제목: <input type="text" name="title" value="<%= b1.getTitle() %>"><br> 
	책저자: <input type="text" name="author" value="<%= b1.getAuthor() %>"><br> 
	출판사: <input type="text" name="publisher" value="<%= b1.getPublisher() %>"><br> 
	<input type="submit" value="등록">
</form>
