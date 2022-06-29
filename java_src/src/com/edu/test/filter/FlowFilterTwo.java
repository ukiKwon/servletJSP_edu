package com.edu.test.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 * [0629] 필터 구현 
 * 인터페이스는 선언된 함수를 모두 구현해야함
 */
public class FlowFilterTwo implements Filter {
	
	//객체 생성 시 호출::초기화 작업
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Init() 호출 ... Two");
	}
	//매핑한 페이지가 유저로부터 요청 시 호출 : 필터링 작업
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("doFilter() 호출 전  ... Two");
		chain.doFilter(req,  resp);
		System.out.println("doFilter() 호출 후  ... Two");
	}
	//필터 삭제 시 호출
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		//어떤 자원 해제 작업 (*필요시)
	}
}
