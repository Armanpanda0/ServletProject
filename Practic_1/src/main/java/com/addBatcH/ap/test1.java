package com.addBatcH.ap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/practicO";
		String name="root";
		String pass="Arman@2002";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,name,pass);
			Statement st=con.createStatement();
			/*
			 * setAutoCommit this make the if false then it will not reflect the manupulatiion of data will not going 
			 * reflected to the database .... then expicitly we have to commit it with the connection referance
			 * :- If we are not going to do AutoCommit then bydefault (true) ;
			 * 
			 */
			con.setAutoCommit(true);
			st.addBatch("insert into person values(50,'ajaya',25)");
			st.addBatch("insert into person values(51,'ajaya',25)");
			st.addBatch("insert into person values(52,'ajaya',25)");
			st.addBatch("insert into person values(53,'ajaya',25)");
			st.addBatch("delete from person where id>= 25");
			//another file
			//st.addBatch("select * from person");//Statement.executeUpdate() or Statement.executeLargeUpdate() cannot issue statements that produce result sets.
			//con.commit();
			int[] intarr=st.executeBatch();
			for(int n:intarr) {
				System.out.println(n);
			}
			con.close();
			System.out.println("Executed 22.jul");
			
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		

	}

}
