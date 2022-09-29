package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseUtil {

	
	public static Connection provideConnection() {
		
		Connection connec = null;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
		connec =	DriverManager.getConnection("jdbc:mysql://localhost:3306/mgnrega","root","aman");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		return connec;
	}
	
//	public static void main(String[] args) {
//		
//	  Connection cc  =  DataBaseUtil.provideConnection();
//		
//	  try {
//	PreparedStatement ps =	cc.prepareStatement("insert into aman values(?,?)");
//		ps.setInt(1, 11);
//		ps.setString(2, "amnann");
//		
//		ps.executeUpdate();
//		
//		
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	  
//	  
//	}
//	
}
