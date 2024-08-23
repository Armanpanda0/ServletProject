package com.ap.Practic_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AlterTable {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/practicO";
		String name="root";
		String pass="Arman@2002";
		String quary="alter table person add column adrs varchar(45)";
		String quary1="alter table person drop column adrs";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,name,pass);
			Statement st=con.createStatement();
			st.execute(quary1);
			con.close();
//			System.out.println("One new col is added");
			System.out.print("new row deleted!!");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
