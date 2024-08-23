package com.ap.Practic_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteFromTable {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/practicO";
		String name="root";
		String pass="Arman@2002";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,name,pass);
			Statement st=con.createStatement();
			st.execute("delete from person where id=1");
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Delete successfully....");
	}

}
