package com.dao;

import com.bean.User;
import com.exceptions.UserExcep;

public interface UserInter {

	public String registerUser( String  fname,String lname,String email,String mobile, String voterid,String rationId, String aadhar, String pan,  String password);
	
	public User loginvviaemail(String email,String password) throws UserExcep;
	public User loginvviamobile(String email,String password) throws UserExcep;
	
	public String updateMobile(String email,String neww);
	public String updateEmail(String mobile,String neww);
	public String updateAadhar(String email,String neww);
	public String updateFirstName(String email,String neww);
	public String updatepassword(String email,String neww);
	
	public String   deleteUser(String email);
	
	
}
