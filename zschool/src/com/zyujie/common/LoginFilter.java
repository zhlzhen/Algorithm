package com.zyujie.common;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		HttpSession session = request.getSession();
		// 如果session不为空，则可以浏览其他页面
		String url = request.getServletPath();
		System.out.println(url);
		//这里判断目录，后缀名，当然也可以写在web.xml中，用url-pattern进行拦截映射
		if ((!request.getServletPath().equals("/login.action"))
				&& (!request.getServletPath().equals("/login.jsp"))
				&& (!request.getServletPath().equals("/relogin.jsp"))
				&& (!request.getServletPath().equals("/jquery-1.8.0.min.js"))) {
			System.out.println(request.getServletPath());
			if (session.getAttribute("userInfo") == null) {
				session.invalidate();
				response.setContentType("text/html;charset=gb2312");
				PrintWriter out = response.getWriter();
				out.println("<script language='javascript' type='text/javascript'>");
				out.println("alert('由于你长时间没有操作,导致Session失效!请你重新登录!');window.location.href='" + request.getContextPath() + "/relogin.jsp'");
				out.println("</script>");
			} else {
				chain.doFilter(request, response);
			}
		} else {
			chain.doFilter(request, response);
		}

	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
