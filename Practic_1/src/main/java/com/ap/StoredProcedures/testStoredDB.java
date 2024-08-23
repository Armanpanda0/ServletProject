package com.ap.StoredProcedures;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.CallableStatement;



public class testStoredDB {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/practicO";
		String name="root";
		String pass="Arman@2002";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,name,pass);
			CallableStatement sc=con.prepareCall("{call personStor(?,?,?)}");
			sc.setInt(1, 73);
			sc.setString(2, "AAAagaja");
			sc.setInt(3, 21);
			sc.execute();
			System.out.println("Inserted successfully!!!");
			con.close();
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
