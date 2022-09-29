package com.bean;

public class User {

	
	private String fname;
	private String lname;
	private String email;
	private String mobile;
	private String voterId;
	private String rationId;
	private String aadhar;
	private String pan;
	private String password;
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getVoterId() {
		return voterId;
	}
	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}
	public String getRationId() {
		return rationId;
	}
	public void setRationId(String rationId) {
		this.rationId = rationId;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User( String fname, String lname, String email, String mobile, String voterId, String rationId,
			String aadhar, String pan, String password) {
		super();
		
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mobile = mobile;
		this.voterId = voterId;
		this.rationId = rationId;
		this.aadhar = aadhar;
		this.pan = pan;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", email=" + email + ", mobile="
				+ mobile + ", voterId=" + voterId + ", rationId=" + rationId + ", aadhar=" + aadhar + ", pan=" + pan
				+ ", password=" + password + "]";
	}
	
	public User() {
		super();
	}
	
}
