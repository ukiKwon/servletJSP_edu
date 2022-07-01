<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<h1> [20220701] JspTest10.jsp</h1>
<p>JSP bean 테스트하기</p>


<!-- Heap에 아래와 같은 객체가 만들어짐, 참조를 위한 id값 초기화 -->
<jsp:useBean id="hello1" class="com.edu.test.jspbeans.HelloBean"></jsp:useBean> </br>
<p> setPerty 사용 전, 기본 생성자 내용 </p>
<jsp:getProperty property="name" name="hello1" /> </br>
<jsp:getProperty property="num" name="hello1" /> </br>

<p> ====>>>>>> setPerty 사용 </p>
<%-- value 값 정하는 방법
<jsp:setProperty property="name" name="hello1" value="uki"/>
<jsp:setProperty property="num" name="hello1" value="408"/><br>
 --%>
 <!-- value값 정하는 다른 방법(1)
 	 * value 대신에 param 으로 주변 내부적으로 밑에 처럼 동작함
 	 * hello1.setName(request.setParameter("a"));
 	 * hello1.setNum(request.setParameter("b"));

<jsp:setProperty property="name" name="hello1" param="a"/>
<jsp:setProperty property="num" name="hello1" param="b"/><br>
 -->
 <!-- value값 정하는 다른 방법(2)
 	 * value 대신에 param 으로 주변 내부적으로 밑에 처럼 동작함
 	 * hello1.setName(request.setParameter("name"));
 	 * hello1.setNum(request.setParameter("num"));
<jsp:setProperty property="name" name="hello1"/>
<jsp:setProperty property="num" name="hello1"/><br>
-->
<!--  
	* Book hello1이 가진 모든 멤버변수에 대해 setter 메소드를 호출
 	 * hello1.setNum(request.setParameter("num"));
 	 * ... 모든 setter()
-->
<jsp:setProperty property="*" name="hello1"/><br>


<jsp:setProperty property="name" name="hello1" param="a"/>
<jsp:setProperty property="num" name="hello1" param="b"/><br>

<p> setPerty 사용 후 </p>
<jsp:getProperty property="name" name="hello1" /> </br>
<jsp:getProperty property="num" name="hello1" /> </br>