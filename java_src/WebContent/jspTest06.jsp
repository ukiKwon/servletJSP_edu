<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		public void work(String p, PageContext pc) {
			try {
				JspWriter out = pc.getOut();
				if (p.equals("include")) {
					out.print("---include 전---");
					pc.include("logInOutMain.jsp");
					out.print("---include 후---");
				} else if (p.equals("forward")) {
					pc.forward("logInOutMain.jsp");
				} else {
					out.print("아무것도 없음");
				}
			} catch (Exception e) {
				System.out.println("오류 발생!");
			}
		}
	%>
	<%
		String p = request.getParameter("p");
		this.work(p, pageContext);
	%>
</body>
</html>