package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/third")
public class ThirdService extends HttpServlet {
	@Override
/*
 * [0627] init은 서블릿이 생성되는 최초 시점에만 호출됨
 * @see javax.servlet.GenericServlet#init()
 */
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		//초기화작업
		super.init();
		System.out.println("init()호출.........third");
	}
   /*
    * [0627] 하나의 url로 2가지 서비스 구현하는 방법
    * method : get, post로 나눠서 구현하면 됨
    */
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet()호출.........third");
		System.out.println("method>>" + req.getMethod());

		//response
		resp.setContentType("text/html;charset=UTF-8");//OutStream 생성 전에 선언해야함
		//
		PrintWriter out = resp.getWriter();//외부로 보낼 stream 생성함
		out.print("<html>");
		out.print("<head><title>RESPONSE !</title></head>");
		out.print("<body><h1>This is third response</h1> <br></br> 안녕</body>");
		out.print("</html>");
		//stream 닫기
		out.close();
	}
	/*
	 * [0627] 사용자가 서비스 요청시마다 호출됨.(*init()은 최초 한번만)
	 * * service()가 호출될때마다 HttpServletRequest/Response 파라미터도 그 때마다 생성됨
	 * * 없어지는 때는, 응답 후
	 * @see javax.servlet.http.HttpServlet#service(javax.servlet.ServletRequest, javax.servlet.ServletResponse)
	 */
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
		//서비스 구현
		System.out.println("service()호출.........third");
	}
}
