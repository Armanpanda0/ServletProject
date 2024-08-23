package com.ap.Practic_1;

import java.sql.*;

//import com.mysql.cj.jdbc.Driver;

public class InsertTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/practicO";
		String name="root";
		String pass="Arman@2002";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,name,pass);
			//after the connection One statement to carry it to database
			Statement st=con.createStatement();
			//execute the non selected statement
			//st.execute("delete from person where id=1");
			st.execute("insert into person values(1,'Arman',22)");
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Successfully inserted");
		

	}

}
