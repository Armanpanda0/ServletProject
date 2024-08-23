package com.rf;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/dologin")
public class loginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html");
			PrintWriter out=resp.getWriter();
			String email=req.getParameter("email");
			String pass=req.getParameter("pass");
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practicO","root","Arman@2002");
				PreparedStatement ps=con.prepareStatement("SELECT * from registationdata where email=? and password=?");
				ps.setString(1, email);
				ps.setString(2, pass);
				ResultSet set=ps.executeQuery();
				
				 
				if(set.next()) {
				
						out.println("Successfully loged-in");
						RequestDispatcher rd=req.getRequestDispatcher("Home.html");
						rd.include(req, resp);
						
					}
				
					else {
						out.println("Wrong Password/email");
						RequestDispatcher rd=req.getRequestDispatcher("Login.html");
						rd.include(req, resp);
					}
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}
