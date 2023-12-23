package com.supplier;

import java.sql.Connection;


import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//model class
public class SupplierDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	//validate data from user login
	public static boolean validate(String username, String password) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from supplier where Email='"+username+"' AND Password='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	public static List<Supplier> getSupplier(String userName){
		
		ArrayList <Supplier> supplier = new ArrayList<>();
		
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from supplier where Email ='"+userName+"'";
		    rs = stmt.executeQuery(sql);
		    
		    while(rs.next()) {
		    	int id = rs.getInt(1);
		    	String fname = rs.getString(2);
		    	String lname = rs.getString(3);
		    	String mobile = rs.getString(4);
		    	String cname = rs.getString(5);
		    	String cid = rs.getString(6);
		    	String email = rs.getString(7);
		    	String pwd = rs.getString(8);
		    	
		    	Supplier sup = new Supplier(id, fname, lname, mobile, cname, cid, email, pwd);
		    	supplier.add(sup);
		    }
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return supplier;
	}
	
	
	
	
	public static boolean insertSupplier(String fname, String lname, String mobile, String cname, String cid, String email, String password) {
		
		
		boolean isSuccess = false;
				
		try {
            
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into supplier values(0,'"+fname+"','"+lname+"','"+mobile+"','"+cname+"','"+cid+"','"+email+"','"+password+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static boolean  updateSupplier(String id, String firstname, String lastname, String mobile, String companyName, String companyID, String email, String password) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update supplier set FirstName ='"+firstname+"',LastName='"+lastname+"', Mobile='"+mobile+"',CompanyName='"+companyName+"',CompanyID='"+companyID+"',Email='"+email+"',Password='"+password+"'"+"where sid ='"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	public static List<Supplier> getSupplierDetails(String Id){
		
		//usage of wrapper classes to convert string to integer
		int convertedID = Integer.parseInt(Id);
		
		ArrayList<Supplier> sup = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from supplier where sid='"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String fname = rs.getString(2);
				String lname = rs.getString(3);
				String mobile = rs.getString(4);
				String cname = rs.getString(5);
				String cid = rs.getString(6);
				String email = rs.getString(7);
				String password = rs.getString(8);
				
				Supplier s = new Supplier(id, fname, lname, mobile, cname, cid, email, password);
				sup.add(s);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return sup;
	}
	
	public static boolean deleteSupplier(String id) {
		
		int convID =Integer.parseInt(id);
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from supplier where sid = '"+convID+"'";
			int r = stmt.executeUpdate(sql);
			
			if(r > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
		
	}
	
}
