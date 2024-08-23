package com.ap.Practic_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub\
		String url="jdbc:mysql://localhost:3306/practicO";
		String name="root";
		String pass="Arman@2002";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, name, pass);
		Statement st=con.createStatement();
		String query="create table person("+"id int,nmae varchar(20),age int)" ;
		st.execute(query);
		System.out.println("Executed");
		con.close();
	}

}
