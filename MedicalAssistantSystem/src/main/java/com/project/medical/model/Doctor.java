package com.project.medical.model;

public class Doctor {

	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private char gender;
	private int specializationId;
	private int experience;
	private int contactDetailsId;
	private int salaryId;

	public Doctor(int id, String firstName, String lastName, int age, char gender, int specializationId, int experience,
			int contactDetailsId, int salaryId) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.specializationId = specializationId;
		this.experience = experience;
		this.contactDetailsId = contactDetailsId;
		this.salaryId = salaryId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getSpecializationId() {
		return specializationId;
	}

	public void setSpecializationId(int specializationId) {
		this.specializationId = specializationId;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getContactDetailsId() {
		return contactDetailsId;
	}

	public void setContactDetailsId(int contactDetailsId) {
		this.contactDetailsId = contactDetailsId;
	}

	public int getSalaryId() {
		return salaryId;
	}

	public void setSalaryId(int salaryId) {
		this.salaryId = salaryId;
	}
}
