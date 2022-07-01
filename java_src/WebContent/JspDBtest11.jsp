<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- [20220701] DB 연결 Test
	* 연관소스 : JspDBtest11.jsp
			  JspDBtest12.jsp 
-->
<!-- 인터페이스 선언 -->
<%@ page import="java.sql.*"%>

<%
	//Client request::파라미터 추출
	//id, pwd
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
%>
<%
	//1. JDBC 로딩
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
 	//2. DBMS 서버 접속
	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
	
	//3. Statement 또는 PreparedStatement 객체 생성
	Statement stmt = conn.createStatement();
	PreparedStatement pstmt = conn.prepareStatement("insert into test values(?, ?)");
	pstmt.setString(1, id);
	pstmt.setString(2, pwd);
	//4. SQL문 실행
	/* (1) 테이블 생성 
	 boolean res = stmt.execute("CREATE TABLE test(id VARCHAR2(20), passwd VARCHAR2(20))"); 
	*/
	/* (2) 초기 데이터 삽입
	 stmt.execute("insert into test values('id1', '11')");
	 stmt.execute("insert into test values('id2', '22')");
	 stmt.execute("insert into test values('id3', '33')"); 
	*/
	pstmt.executeUpdate();//pstmt가 가지고 있는 SQL문을 수행해라
	
	ResultSet rs = stmt.executeQuery("select * from test");

	while (rs.next()) {
		out.print("ID:" + rs.getString("id") + ",PWD:" + rs.getString("passwd") + "<br>");
	}
	//5. 자원 해제
	rs.close();
	pstmt.close();
	stmt.close();
	conn.close();
%>

OK
