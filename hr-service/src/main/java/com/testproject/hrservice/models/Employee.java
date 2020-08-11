package com.testproject.hrservice.models;

public class Employee {
	private String Id;
	private String firstname;
	private String lastname;
	private String speciality;
	
	public Employee() {
		
	}

	public Employee(String id, String firstname, String lastname, String speciality) {
		super();
		Id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.speciality = speciality;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	

}
