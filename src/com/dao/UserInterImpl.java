package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.User;
import com.exceptions.UserExcep;
import com.utility.DataBaseUtil;

public class UserInterImpl implements UserInter {

	// *******************************************************************************************

	@Override
	public String registerUser(String fname, String lname, String email, String mobile, String voterid, String rationId,
			String aadhar, String pan, String password) {
		String res = "User Not Inserted......";

		try (Connection con = DataBaseUtil.provideConnection()) {

			PreparedStatement ps = con.prepareStatement("insert into user_registration values (?,?,?,?,?,?,?,?,?)");

			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, email);
			ps.setString(4, mobile);
			ps.setString(5, voterid);
			ps.setString(6, rationId);
			ps.setString(7, aadhar);
			ps.setString(8, pan);
			ps.setString(9, password);

			int signal = ps.executeUpdate();

			if (signal > 0) {
				res = fname + " " + lname + "registered successfully";
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return res;
	}

//***********************************************************************************************************8
	@Override
	public User loginvviaemail(String email, String password) throws UserExcep {
		User us = null;

		try (Connection conn = DataBaseUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from user_registration where email=? and password  = ?");

			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				us = new User(rs.getString("fname"), rs.getString("lname"), rs.getString("email"),
						rs.getString("mobile"), rs.getString("voterId"), rs.getString("rationId"),
						rs.getString("aadhar"), rs.getString("pan"), rs.getString("password"));
			} else {
				throw new UserExcep("Incorrect UserName or Password ...........");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return us;
	}

//******************************************************************************************************
	@Override
	public User loginvviamobile(String mobile, String password) throws UserExcep {
		User us = null;

		try (Connection conn = DataBaseUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from user_registration where mobile=? and password  = ?");

			ps.setString(1, mobile);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			

			if (rs.next()) {
				us = new User(rs.getString("fname"), rs.getString("lname"), rs.getString("email"),
						rs.getString("mobile"), rs.getString("voterId"), rs.getString("rationId"),
						rs.getString("aadhar"), rs.getString("pan"), rs.getString("password"));
			} else {
				throw new UserExcep("Incorrect Username or password...........");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return us;
	}
//************************************************************************************************
	@Override
	public String updateMobile(String email,String neww) {
		
		String res = "Not Updated........";
		
		try (Connection conn = DataBaseUtil.provideConnection()){
			
		PreparedStatement ps =	conn.prepareStatement("update user_registration set mobile = ? where email =?");
		ps.setString(1, neww);
		ps.setString(2, email);
		
	int r  =	ps.executeUpdate();
	
	if(r>0) {
		res = "Mobile Updated successfully......";
	}
			
		} catch ( SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return res;
	}
//*************************************************************************************************
	@Override
	public String updateEmail(String mobile,String neww) {
	String res = "Not Updated........";
		
		try (Connection conn = DataBaseUtil.provideConnection()){
			
		PreparedStatement ps =	conn.prepareStatement("update user_registration set email = ? where mobile =?");
		ps.setString(1, neww);
		ps.setString(2, mobile);
		
	int r  =	ps.executeUpdate();
	
	if(r>0) {
		res = "Email Updated successfully......";
	}
			
		} catch ( SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return res;
	}
//*************************************************************************************************
	@Override
	public String updateAadhar(String email,String neww) {
String res = "Not Updated........";
		
		try (Connection conn = DataBaseUtil.provideConnection()){
			
		PreparedStatement ps =	conn.prepareStatement("update user_registration set aadhar = ? where email =?");
		ps.setString(1, neww);
		ps.setString(2, email);
		
	int r  =	ps.executeUpdate();
	
	if(r>0) {
		res = "Aadhar no. Updated successfully......";
	}
			
		} catch ( SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return res;
	}
//*************************************************************************************************
	@Override
	public String updateFirstName(String email,String neww) {
String res = "Not Updated........";
		
		try (Connection conn = DataBaseUtil.provideConnection()){
			
		PreparedStatement ps =	conn.prepareStatement("update user_registration set fname = ? where email =?");
		ps.setString(1, neww);
		ps.setString(2, email);
		
	int r  =	ps.executeUpdate();
	
	if(r>0) {
		res = "First Nmae is Updated successfully......";
	}
			
		} catch ( SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return res;
	}
//*************************************************************************************************
	@Override
	public String updatepassword(String email,String neww) {
String res = "Not Updated........";
		
		try (Connection conn = DataBaseUtil.provideConnection()){
			
		PreparedStatement ps =	conn.prepareStatement("update user_registration set password = ? where email =?");
		ps.setString(1, neww);
		ps.setString(2, email);
		
	int r  =	ps.executeUpdate();
	
	if(r>0) {
		res = "password Updated successfully......";
	}
			
		} catch ( SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return res;
	}

	
	
//*************************************************************************************************
	@Override
	public String deleteUser(String email) {
String res = "Not deleted........";
		
		try (Connection conn = DataBaseUtil.provideConnection()){
			
		PreparedStatement ps =	conn.prepareStatement("delete from user_registration where email =?");
		ps.setString(1, email);
		
		
	int r  =	ps.executeUpdate();
	
	if(r>0) {
		res = "account deleted  successfully......";
	}
			
		} catch ( SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return res;
	}
	

//***********************************************************************************************
}
//private int userId;
//private String name;
//private String voterId;
//private String rationId;
//private String aadhar;
//private String pan;
//private String password;