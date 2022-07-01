<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="javax.naming.*"%>

<%
	InitialContext ic = new InitialContext(); //JNDI 서버
	DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/myoracle");//jdbc/myoracle 이름으로 된 Connection pool을 찾아줘라
	Connection conn = ds.getConnection();

	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery("select * from test");

	while (rs.next()) {
		out.print("ID:" + rs.getString("id") + ",PWD:" + rs.getString("passwd") + "<br>");
	}
%>

<%= conn %>