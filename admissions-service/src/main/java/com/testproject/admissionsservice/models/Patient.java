package com.testproject.admissionsservice.models;

public class Patient {
	private String Id;
	private String name;
	private String nationality;
	
	public Patient() {
		
	}
	
	public Patient(String id, String name,String nation) {
		Id=id;
		this.name=name;
		nationality=nation;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	
}
