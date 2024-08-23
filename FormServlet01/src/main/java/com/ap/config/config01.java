package com.ap.config;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class config01 extends GenericServlet {

	//private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter pr=res.getWriter();
		ServletConfig con=getServletConfig();
		String s1=con.getInitParameter("p1"); 
		String s2=con.getInitParameter("p2");
		String s3=con.getInitParameter("p3"); 
		
		pr.println("<img src='"+s1+"' width=100px border-radious=50%> <br>");
		pr.println("<img src='"+s2+"' width=100px><br>");
		pr.println("<img src='"+s3+"' width=100px><br>");

	}

}
