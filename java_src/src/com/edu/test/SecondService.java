package com.edu.test;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/second")
public class SecondService extends HttpServlet{

	@Override
	public void init(ServletConfig config) 
										throws ServletException {
//		// TODO Auto-generated method stub
//		super.init(config);	
		//초기화작업
		System.out.println("INIT()호출.........second");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) 
																			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.service(arg0, arg1);
		//서비스 구현
		System.out.println("SERVICE()호출.........second");
		
//		Map<String, String[]> para = arg0.getParameterMap();
	
		arg1.setStatus(HttpServletResponse.SC_OK);
	};
	
}
