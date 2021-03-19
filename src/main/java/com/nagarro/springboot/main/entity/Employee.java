package com.nagarro.springboot.main.entity;


public class Employee 
{
	private int Empcode;
	
	private String Name;
	
	
	private String Loc;
	
	
	private String Email;
	
	
	private String Dob;

	public int getEmpcode() {
		return Empcode;
	}

	public void setEmpcode(int empcode) {
		Empcode = empcode;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLoc() {
		return Loc;
	}

	public void setLoc(String loc) {
		Loc = loc;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDob() {
		return Dob;
	}

	public Employee(int empcode, String name, String loc, String email, String dob) 
	{
		this.Empcode = empcode;
		this.Name = name;
		this.Loc = loc;
		this.Email = email;
		this.Dob = dob;
	}

	public void setDob(String dob) {
		Dob = dob;
	}

	public Employee() {
		
	}
}
