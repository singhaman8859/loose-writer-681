package com.mgnrega.bean;

public class EmpProj {

	private int empid;
	private String empname;
	private String empmobile;
	private String empemail;
	private String empadd;
	private String empaadhar;
	private int empwages;
	private int total_days;
	
	

	private int projid;
	private String projname;
	private String projdesc;
	private int pro_duration;
	private String proj_startdate;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
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
	public int getProjid() {
		return projid;
	}
	public void setProjid(int projid) {
		this.projid = projid;
	}
	public String getProjname() {
		return projname;
	}
	public void setProjname(String projname) {
		this.projname = projname;
	}
	public String getProjdesc() {
		return projdesc;
	}
	public void setProjdesc(String projdesc) {
		this.projdesc = projdesc;
	}
	public int getPro_duration() {
		return pro_duration;
	}
	public void setPro_duration(int pro_duration) {
		this.pro_duration = pro_duration;
	}
	public String getProj_startdate() {
		return proj_startdate;
	}
	public void setProj_startdate(String proj_startdate) {
		this.proj_startdate = proj_startdate;
	}
	@Override
	public String toString() {
		return "EmpProj [empid=" + empid + ", empname=" + empname + ", empmobile=" + empmobile + ", empemail="
				+ empemail + ", empadd=" + empadd + ", empaadhar=" + empaadhar + ", empwages=" + empwages
				+ ", total_days=" + total_days + ", projid=" + projid + ", projname=" + projname + ", projdesc="
				+ projdesc + ", pro_duration=" + pro_duration + ", proj_startdate=" + proj_startdate + "]";
	}

	
	
	
	
}
