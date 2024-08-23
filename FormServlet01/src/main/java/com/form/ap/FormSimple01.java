package com.form.ap;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FormSimple01 extends GenericServlet {

	//private static final long serialVersionUID = 3211691132686577282L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		int age=Integer.parseInt(req.getParameter("age"));
		System.out.println(name+" "+age+" "+email);
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("<table border=2px>\n"
				+ "<thead>\n"
				+ "<tr>\n"
				+ "<td>Name</td>\n"
				+ "<td>Age</td>\n"
				+ "<td>email</td>\n"
				+ "</tr>\n"
				+ "</thead>\n"
				+ "<tbody>\n");
	   pw.println( "<tr><td>"+name+"</td><td>"+age+"</td><td>"+email+"</td></tr>"
				+ "</tbody>\n"
				+ "</table>");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
