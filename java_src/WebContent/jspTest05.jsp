<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 멤버변수/멤버함수 선언시 -->
<%!
	public int sum(int a, int b) { return a +b;}
%>
<!-- Service 내부 -->
<% int c = this.sum(10000,20000); %>
<%= c %>

