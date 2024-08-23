package com.addBatcH.ap;
import java.util.*;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;

import java.sql.*;

public class test2 {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/practicO";
		String name="root";
		String pass="Arman@2002";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id ");
		int id=sc.nextInt();
		System.out.println("Enter the Name ");
		String nm=sc.next();
		System.out.println("Enter the age ");
		int age=sc.nextInt();
		String qr="insert into person values(?,?,?)";
		String dq="delete from person where id=?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,name,pass);
			PreparedStatement ps=con.prepareStatement(qr);
//			PreparedStatement pd=con.prepareStatement(dq);
//			pd.setInt(1, id);
			ps.setInt(1, id);
			ps.setString(2, nm);
			ps.setInt(3, age);
			ps.executeUpdate();
			System.out.println("No of rows inserted >>>>");
			con.close();
			
			
		}catch(ClassNotFoundException | SQLException e  ) {
			e.printStackTrace();
		}
	}

}
