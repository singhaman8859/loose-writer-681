package com.mgnrega.bean;

public class Gpm {
	private int gpmid;
	private String gpmname;
	private String gpmmobile;
	private String gpmemail;
	private String gpmvill;
	private String gpmaadhar;
	private String password;

	public int getgpmid() {
		return gpmid;
	}

	public void setgpmid(int gpmid) {
		this.gpmid = gpmid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public String getGpmname() {
		return gpmname;
	}

	public void setGpmname(String gpmname) {
		this.gpmname = gpmname;
	}

	public String getGpmmobile() {
		return gpmmobile;
	}

	public void setGpmmobile(String gpmmobile) {
		this.gpmmobile = gpmmobile;
	}

	public String getGpmemail() {
		return gpmemail;
	}

	public void setGpmemail(String gpmemail) {
		this.gpmemail = gpmemail;
	}

	public String getGpmvill() {
		return gpmvill;
	}

	public void setGpmvill(String gpmvill) {
		this.gpmvill = gpmvill;
	}

	public String getGpmaadhar() {
		return gpmaadhar;
	}

	public void setGpmaadhar(String gpmaadhar) {
		this.gpmaadhar = gpmaadhar;
	}

	public Gpm(int gpmid, String gpmname, String gpmmobile, String gpmemail, String gpmvill, String gpmaadhar) {
		super();
		this.gpmid = gpmid;
		this.gpmname = gpmname;
		this.gpmmobile = gpmmobile;
		this.gpmemail = gpmemail;
		this.gpmvill = gpmvill;
		this.gpmaadhar = gpmaadhar;
	}

	@Override
	public String toString() {
		return "Gpm [gpmid=" + gpmid + ", gpmname=" + gpmname + ", gpmmobile=" + gpmmobile + ", gpmemail=" + gpmemail
				+ ", gpmvill=" + gpmvill + ", gpmaadhar=" + gpmaadhar + "]";
	}

	public Gpm(String gpmname, String gpmmobile, String gpmemail, String gpmvill, String gpmaadhar,String password) {
		super();
		this.gpmname = gpmname;
		this.gpmmobile = gpmmobile;
		this.gpmemail = gpmemail;
		this.gpmvill = gpmvill;
		this.gpmaadhar = gpmaadhar;
		this.password=password;
	}
	
	public Gpm(int gpmid,String gpmname, String gpmmobile, String gpmemail, String gpmvill, String gpmaadhar,String password) {
		super();
		this.gpmid=gpmid;
		this.gpmname = gpmname;
		this.gpmmobile = gpmmobile;
		this.gpmemail = gpmemail;
		this.gpmvill = gpmvill;
		this.gpmaadhar = gpmaadhar;
		this.password=password;
	}

}
