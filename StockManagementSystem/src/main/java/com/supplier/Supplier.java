package com.supplier;

public class Supplier {

	private int sid;
	private String firstname;
	private String lastname;
	private String mobile;
	private String companyName;
	private String companyID;
	private String email;
	private String password;
	
	public Supplier(int sid, String firstname, String lastname, String mobile, String companyName, String companyID,
			String email, String password) {
		
		this.sid = sid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobile = mobile;
		this.companyName = companyName;
		this.companyID = companyID;
		this.email = email;
		this.password = password;
	}

	public int getSid() {
		return sid;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getMobile() {
		return mobile;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getCompanyID() {
		return companyID;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	
	
	
	
}
