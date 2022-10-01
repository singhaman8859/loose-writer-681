package com.mgnrega.bean;

public class Project {
	
	private int projid;
	private String projname;
	private String projdesc;
	private int pro_duration;
	private String proj_startdate;
	public Project(int projid, String projname, String projdesc, int pro_duration, String proj_startdate) {
		super();
		this.projid = projid;
		this.projname = projname;
		this.projdesc = projdesc;
		this.pro_duration = pro_duration;
		this.proj_startdate = proj_startdate;
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
		return "Project [projid=" + projid + ", projname=" + projname + ", projdesc=" + projdesc + ", pro_duration="
				+ pro_duration + ", proj_startdate=" + proj_startdate + "]";
	}
	
	public Project() {
		
	}
	

}
