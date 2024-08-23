package com.ap.Practic_1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTable {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/practicO";
		String name="root";
		String pass="Arman@2002";
		try {
			//class loader
		Class.forName("com.mysql.cj.jdbc.Driver");
		//create a connection
		Connection con=DriverManager.getConnection(url,name,pass);
		//create a statement
		Statement st=con.createStatement();
		//Query exxecution
		st.execute("insert into person values(1,'Arman',23)");
		//close the connection
		con.close();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	

}
