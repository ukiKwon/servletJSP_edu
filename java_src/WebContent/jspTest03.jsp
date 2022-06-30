<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	for (int i = 1; i < 10; ++i) {
		for (int j = 1; j < 10; ++j) {
			out.print(i+"*"+j+"="+(i*j)); %> <br>
	 <% } %><br>
 <% } %>
