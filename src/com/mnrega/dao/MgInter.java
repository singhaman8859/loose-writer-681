package com.mnrega.dao;

import java.util.List;

import com.mgnrega.bean.*;

public interface MgInter {

	public String addProject(int projid, String projname, String projdesc, int duration, String sdate);

	public List<Project> viewListOfProject();

	public String addGPM(String gpmname, String gpmmobile, String gpmemail, String gpmadd, String gpmaadhar, String password);

	public List<Gpm> viewAllGPM();

	public String allocateProjectToGpm(int projid, int gpmid);

	public List<EmpProj> listOfEmpOnProject(String projname);
	
	public boolean loginAsGpm(String email,String password);

	public String addEmployee(String empname, String empmobile, String empemail, String empadd, String empaadhar,
			int empwages, int total_days, String password);

	public Employee viewEmployeeDetail(String empemail);

	public String assignEmployeeToProject(int projid, int empid);

	public List<EmpProj> viewTotalEmpWorkedInProject(int empid);

}
