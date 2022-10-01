package com.mnrega.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mgnrega.bean.EmpProj;
import com.mgnrega.bean.Employee;
import com.mgnrega.bean.Gpm;
import com.mgnrega.bean.Project;
import com.mgnrega.utility.DBUtil;
import com.mysql.cj.xdevapi.Result;

public class MgInterImpl implements MgInter {

	@Override
	public String addProject(int projid, String projname, String projdesc, int duration, String sdate) {

		String res = "------Project Not inserted. Please try again !---------";

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("insert into mgnrega_project values(?,?,?,?,?)");

			ps.setInt(1, projid);
			ps.setString(2, projname);
			ps.setNString(3, projdesc);
			ps.setInt(4, duration);
			ps.setString(5, sdate);

			int r = ps.executeUpdate();

			if (r > 0) {
				res = "************Project created successfully.....************";
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return res;
	}

	@Override
	public List<Project> viewListOfProject() {
		List<Project> pp = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from mgnrega_project");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				pp.add(new Project(rs.getInt("projid"), rs.getString("projname"), rs.getString("projdesc"),
						rs.getInt("pro_duration"), rs.getString("proj_startdate")));
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return pp;
	}

	@Override
	public String addGPM(String gpmname, String gpmmobile, String gpmemail, String gpmadd, String gpmaadhar,String password) {
		String res = "------Gram Panchayat Member Not inserted. Please try again !---------";

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement(
					"insert into mgnrega_gpm (gpmname,gpmmobile,gpmemail,gpmvill,gpmaadhar,password) values(?,?,?,?,?,?)");

			ps.setString(1, gpmname);
			ps.setString(2, gpmmobile);
			ps.setNString(3, gpmemail);
			ps.setString(4, gpmadd);
			ps.setString(5, gpmaadhar);
			ps.setString(6, password);

			int r = ps.executeUpdate();

			if (r > 0) {
				res = "************Gram Panchayat Member created successfully.....************";
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return res;
	}

	@Override
	public List<Gpm> viewAllGPM() {
		List<Gpm> pp = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from mgnrega_gpm");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				pp.add(new Gpm(rs.getInt("gpmid"), rs.getString("gpmname"), rs.getString("gpmmobile"),
						rs.getString("gpmemail"), rs.getString("gpmvill"), rs.getString("gpmaadhar")));
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return pp;
	}

	@Override
	public String allocateProjectToGpm(int projid, int gpmid) {
		String res = "------Not allocated. Please try again !---------";

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("insert into mgnrega_gpm_project values(?,?)");

			ps.setInt(1, projid);
			ps.setInt(2, gpmid);

			int r = ps.executeUpdate();

			if (r > 0) {
				res = "************Gram panchayat Member (" + gpmid + ") allocated to the project (" + projid
						+ ") successfully.....************";
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return res;
	}

	@Override
	public List<EmpProj> listOfEmpOnProject(String projname) {
		List<EmpProj> ep = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement(
					"select mp.projname, me.empname,me.empadd,me.empmobile,me.total_days,me.empwages  from mgnrega_employee me inner join mgnrega_project mp inner join mgnrega_employee_project mep on mep.projid = mp.projid and mep.empid = me.empid where mp.projname = ?");
			ps.setString(1, projname);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				EmpProj epp = new EmpProj();

				epp.setProjname(rs.getString("projname"));
				epp.setEmpname(rs.getString("empname"));
				epp.setEmpadd(rs.getString("empadd"));
				epp.setEmpmobile(rs.getString("empmobile"));
				epp.setTotal_days(rs.getInt("total_days"));
				epp.setEmpwages(rs.getInt("empwages"));

				ep.add(epp);

			//	System.out.println(epp);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return ep;
	}

	@Override
	public String addEmployee(String empname, String empmobile, String empemail, String empadd, String empaadhar,
			int empwages, int total_days, String password) {
		String res = "------Employee  Not inserted. Please try again !---------";

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement(
					"insert into mgnrega_employee (empname,empmobile,empemail,empadd,empaadhar,empwages,total_days,password) values(?,?,?,?,?,?,?,?)");

			ps.setString(1, empname);
			ps.setString(2, empmobile);
			ps.setNString(3, empemail);
			ps.setString(4, empadd);
			ps.setString(5, empaadhar);
			ps.setInt(6, empwages);
			ps.setInt(7, total_days);
			ps.setString(8, password);

			int r = ps.executeUpdate();

			if (r > 0) {
				res = "************Employee created successfully.....************";
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return res;
	}

	@Override
	public Employee viewEmployeeDetail(String empemail) {
		Employee em = null;

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement(" select * from mgnrega_employee where empemail = ?");

			ps.setString(1, empemail);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				int i = rs.getInt("empid");
				String n = rs.getString("empname");
				String m = rs.getString("empmobile");
				String e = rs.getString("empemail");
				String a = rs.getString("empadd");
				String ad = rs.getString("empaadhar");
				int w = rs.getInt("empwages");
				int td = rs.getInt("total_days");
				String p = rs.getString("password");

				em = new Employee(i, n, m, e, a, ad, w, td, p);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return em;
	}

	@Override
	public String assignEmployeeToProject(int projid, int empid) {
		String res = "------Not allocated. Please try again !---------";

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("insert into mgnrega_employee_project values(?,?)");

			ps.setInt(1, projid);
			ps.setInt(2, empid);

			int r = ps.executeUpdate();

			if (r > 0) {
				res = "************Employee  (" + empid + ") allocated to the project (" + projid
						+ ") successfully.....************";
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return res;
	}

	@Override
	public List<EmpProj> viewTotalEmpWorkedInProject(int empid) {

		List<EmpProj> empproj = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement(
					"select e.empid ,e.empname,e.total_days,e.total_days*e.empwages total_wages,p.projname,p.projid from mgnrega_employee e inner join mgnrega_project p inner join mgnrega_employee_project mep on mep.projid=p.projid and mep.empid=e.empid where e.empid=?");

			ps.setInt(1, empid);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				EmpProj em = new EmpProj();
				
				em.setEmpid(rs.getInt("empid"));
				em.setEmpname(rs.getString("empname"));
				em.setTotal_days(rs.getInt("total_days"));
				em.setEmpwages(rs.getInt("total_wages"));
				em.setProjname(rs.getString("projname"));
				em.setProjid(rs.getInt("projid"));
				
				empproj.add(em);
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return empproj;

	}

	@Override
	public boolean loginAsGpm(String email, String password) {
		
		
		List<Gpm> pp = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from mgnrega_gpm");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				pp.add(new Gpm(rs.getInt("gpmid"), rs.getString("gpmname"), rs.getString("gpmmobile"),
						rs.getString("gpmemail"), rs.getString("gpmvill"), rs.getString("gpmaadhar"),rs.getString("password")));
			}

			
			for(Gpm g: pp) {
				if(g.getGpmemail().equalsIgnoreCase(email) && g.getPassword().equals(password)) {
					return true;
				}
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		
		
		
		
		return false;
	}

}
