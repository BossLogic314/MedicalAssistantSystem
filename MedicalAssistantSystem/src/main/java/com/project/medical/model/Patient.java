package com.project.medical.model;

public class Patient {

	private String aadhaarId;
	private String firstName;
	private String lastName;
	private int age;
	private char gender;
	private String healthIssue;
	private String phoneNo;
	private String address;
	
	public Patient(String aadhaarId, String firstName, String lastName, int age, char gender, String healthIssue, String phoneNo,
			String address) {
		
		this.aadhaarId = aadhaarId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.healthIssue = healthIssue;
		this.phoneNo = phoneNo;
		this.address = address;
	}

	public String getAadhaarId() {
		return aadhaarId;
	}

	public void setAadhaarId(String aadhaarId) {
		this.aadhaarId = aadhaarId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getHealthIssue() {
		return healthIssue;
	}

	public void setHealthIssue(String healthIssue) {
		this.healthIssue = healthIssue;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
