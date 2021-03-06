<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 역할: RequsetDispatcher forward() 기능 -->
<!-- 
	* forward 방식
	(1) jsp 내 직접 디스패처(RequsetDispatcher rd = response.getDispatcher()) 기능 사용
	(2) pageContext 사용
	(3) jsp 표준액션 태그 사용
 -->
 <!-- [2022.06.30] XML 태그 표현식 -->
<%-- <jsp:forward page="logInOutMain.jsp"/> --%>
<%-- <% String param = request.getParameter("p");%>

<!-- p에는 넣은 path 경로 잡아넣으면됨 -->
<jsp:forward page="<%=param %>"/> --%>

<!-- [2022.07.01] EL 표현식 사용 -->
<jsp:forward page="${param.p}"></jsp:forward>