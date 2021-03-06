package com.edu.test;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FlowFilterFive implements Filter {

	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("init() 호출 ........ five");
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		req.setCharacterEncoding("UTF-8");
		System.out.println("doFilter() 호출 전 ........ five");
		chain.doFilter(req, res);
		System.out.println("doFilter() 호출 후 ........ five");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy() 호출 ........ five");
	}
}
