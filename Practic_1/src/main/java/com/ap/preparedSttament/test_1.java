package com.ap.preparedSttament;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class test_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data");
		System.out.println("--------");
		System.out.println("Enter a Unique id");
		int id=sc.nextInt();
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the age");
		int age=sc.nextInt();
		
		String url="jdbc:mysql://localhost:3306/practicO";
		String nm="root";
		String pass="Arman@2002";
		String q="insert into person values(?,?,?)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,nm,pass);
			PreparedStatement ps=con.prepareStatement(q);
			ps.setInt(1, id);
			ps.setInt(3, age);
			ps.setString(2, name);
			int i=ps.executeUpdate();
			System.out.println("It's Done in row "+ i);
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
