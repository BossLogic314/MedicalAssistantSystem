package com.project.medical.model;

public class Qualification {

	private int id;
	private int doctorId;
	private String degreeName;
	private String joiningYear;
	private String graduationYear;
	
	public Qualification(int id, int doctorId, String degreeName, String joiningYear, String graduationYear) {
		this.id = id;
		this.doctorId = doctorId;
		this.degreeName = degreeName;
		this.joiningYear = joiningYear;
		this.graduationYear = graduationYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	public String getJoiningYear() {
		return joiningYear;
	}

	public void setJoiningYear(String joiningYear) {
		this.joiningYear = joiningYear;
	}

	public String getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(String graduationYear) {
		this.graduationYear = graduationYear;
	}
}
