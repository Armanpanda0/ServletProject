package com.ap.https;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/get")
public class http01 extends HttpServlet {

	//private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		//resp.getWriter().println("<h2>Arman panda</h2>");
		PrintWriter out=resp.getWriter();
		
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		
		if(name.equals("arm@gmail.com") && pass.equals("1234")) {
			RequestDispatcher rqt=req.getRequestDispatcher("homePage.html");
			rqt.forward(req, resp);
			
		}else {
			out.println("<h2>Incorrect Pass/User name</h2>");
			RequestDispatcher rqt=req.getRequestDispatcher("http01.html");
			rqt.include(req, resp);
		}
		
		
		
	}
}
