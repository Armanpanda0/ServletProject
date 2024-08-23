package com.ap.preparedSttament;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class deleteDynamically {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/practicO";
		String name="root";
		String pas="Arman@2002";
		
		String q1="delete from person where id=?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,name,pas);
			PreparedStatement ps=con.prepareStatement(q1);
			ps.setInt(1, new Scanner(System.in).nextInt());
			
			ps.executeUpdate();
			con.close();
			System.out.println("Deleted");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
