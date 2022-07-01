<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
 <!-- [20220701] EL 표현식으로 defauly value 설정하기 
 	* 연관된 소스 : BookRegServlet1.java/ bookOutput.jsp
 -->
 <form action="bookReg" method="post">
	책제목: <input type="text" name="title" value="${book.title}"><br> 
	책저자: <input type="text" name="author" value="${book.author}"><br> 
	출판사: <input type="text" name="publisher" value="${book.publisher}"><br> 
	<input type="submit" value="등록">
</form>
    