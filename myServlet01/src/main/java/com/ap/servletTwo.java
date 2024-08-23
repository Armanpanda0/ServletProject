package com.ap;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class servletTwo implements Servlet{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("2nd Servlet is Running....");
		//res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("<h1>This is not a link</h1>");
		pw.println("<h1>This is not a link</h1>");
		pw.println("<h1>This is not a link</h1>");
		pw.println("<h1>This is not a link</h1>");
		pw.println("<h1>This is not a link</h1>");
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
