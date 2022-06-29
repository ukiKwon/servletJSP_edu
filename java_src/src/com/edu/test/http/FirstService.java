package com.edu.test.http;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class FirstService extends HttpServlet{

	@Override
	public void init(ServletConfig config) 
										throws ServletException {
//		// TODO Auto-generated method stub
//		super.init(config);	
		//�ʱ�ȭ�۾�
		System.out.println("INIT()ȣ��");
		System.out.println(config);
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) 
																			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.service(arg0, arg1);
		//���� ����
		System.out.println("SERVICE()ȣ��");
		System.out.println(arg0.getQueryString());
		if( arg0.getMethod().equals("GET") ) {
			doGet(arg0, arg1);
		}
	};
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		System.out.println("doGet()ȣ��");
	}
	
}
