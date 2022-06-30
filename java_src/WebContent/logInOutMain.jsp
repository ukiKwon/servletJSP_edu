<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
	<% if (session.isNew() || session.getAttribute("id") == null) { %>
		<% String msg = (String)request.getAttribute("msg"); 
		   if (msg == null) { msg = "";}
		%>
		<%= msg %>
		<form action="loginout.jsp" method="post">
			<label>ID</label></label><input type="text" name="id"/></br>
			<label>비밀번호</label></label><input type="password" name="pwd"/></br>
			<input type="submit" value="로그인"/>
		</form>
	<% } else { %>
		<p> <a href="loginout.jsp"> 로그 아웃</a>	</p>
	<% } %>