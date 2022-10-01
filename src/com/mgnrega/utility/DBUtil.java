package com.mgnrega.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	

		
		public static Connection provideConnection() {
			
			Connection connec = null;
			
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
			connec =	DriverManager.getConnection("jdbc:mysql://localhost:3306/mgnregadb","root","aman");
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
			
			
			return connec;
		}
	
}
	

