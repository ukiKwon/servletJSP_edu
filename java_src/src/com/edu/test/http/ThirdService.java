package com.edu.test.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/third")
public class ThirdService extends HttpServlet {
	@Override
/*
 * [0627] init�� ������ �����Ǵ� ���� �������� ȣ���
 * @see javax.servlet.GenericServlet#init()
 */
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		//�ʱ�ȭ�۾�
		super.init();
		System.out.println("init()ȣ��.........third");
	}
   /*
    * [0627] �ϳ��� url�� 2���� ���� �����ϴ� ���
    * method : get, post�� ������ �����ϸ� ��
    */
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet()ȣ��.........third");
		System.out.println("method>>" + req.getMethod());

		//response
		resp.setContentType("text/html;charset=UTF-8");//OutStream ���� ���� �����ؾ���
		//
		PrintWriter out = resp.getWriter();//�ܺη� ���� stream ������
		out.print("<html>");
		out.print("<head><title>RESPONSE !</title></head>");
		out.print("<body><h1>This is third response</h1> <br></br> �ȳ�</body>");
		out.print("</html>");
		//stream �ݱ�
		out.close();
	}
	/*
	 * [0627] ����ڰ� ���� ��û�ø��� ȣ���.(*init()�� ���� �ѹ���)
	 * * service()�� ȣ��ɶ����� HttpServletRequest/Response �Ķ���͵� �� ������ ������
	 * * �������� ����, ���� ��
	 * @see javax.servlet.http.HttpServlet#service(javax.servlet.ServletRequest, javax.servlet.ServletResponse)
	 */
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
		//���� ����
		System.out.println("service()ȣ��.........third");
	}
}
