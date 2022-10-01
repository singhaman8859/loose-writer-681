package com.mgnrega.bean;

public class Employee {

	private int empid;
	private String empname;
	private String empmobile;
	private String empemail;
	private String empadd;
	private String empaadhar;
	private int empwages;
	private int total_days;
	private String password;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public Employee(int empid, String empname, String empmobile, String empemail, String empadd, String empaadhar,
			int empwages, int total_days,String password) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empmobile = empmobile;
		this.empemail = empemail;
		this.empadd = empadd;
		this.empaadhar = empaadhar;
		this.empwages = empwages;
		this.total_days = total_days;
		this.password=password;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpmobile() {
		return empmobile;
	}
	public void setEmpmobile(String empmobile) {
		this.empmobile = empmobile;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	public String getEmpadd() {
		return empadd;
	}
	public void setEmpadd(String empadd) {
		this.empadd = empadd;
	}
	public String getEmpaadhar() {
		return empaadhar;
	}
	public void setEmpaadhar(String empaadhar) {
		this.empaadhar = empaadhar;
	}
	public int getEmpwages() {
		return empwages;
	}
	public void setEmpwages(int empwages) {
		this.empwages = empwages;
	}
	public int getTotal_days() {
		return total_days;
	}
	public void setTotal_days(int total_days) {
		this.total_days = total_days;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empmobile=" + empmobile + ", empemail="
				+ empemail + ", empadd=" + empadd + ", empaadhar=" + empaadhar + ", empwages=" + empwages
				+ ", total_days=" + total_days + "]";
	}
	
	
	
}
