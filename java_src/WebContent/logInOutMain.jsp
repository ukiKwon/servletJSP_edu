<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
	<% if (session.isNew() || session.getAttribute("id") == null) { %>
<!-- JSP 스크립트 표현식 -->
<%-- 		
		<% String str = (String)request.getAttribute("msg"); 
		   if (str == null) { str = "";}
		%>str
		<%= str %> 
--%>
<!-- EL 표현식 -->
		${msg}
		
		<form action="loginout.jsp" method="post">
			<label>ID</label></label><input type="text" name="id"/></br>
			<label>비밀번호</label></label><input type="password" name="pwd"/></br>
			<input type="submit" value="로그인"/>
		</form>
	<% } else { %>
		<p> <a href="loginout.jsp"> 로그 아웃</a>	</p>
	<% } %>