<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

   <h1> exam09.jsp</h1>
   
 <!-- 동작 방식이 다름 
 	* jsp:include 방식은 원래 jsp 실행파일(.class) 만든 다름 include 
 	* %@ 방식은 원래 jsp가 .java 만들때 include 파일 같이 포함시켜 실행파일(.class) 생성
 -->
<jsp:include page="JspTest02.jsp"></jsp:include>

<%@ include file="JspTest02.jsp" %>