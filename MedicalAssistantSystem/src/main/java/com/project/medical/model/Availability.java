package com.project.medical.model;

import java.sql.Date;
import java.sql.Time;

public class Availability {

	private int doctorId;
	private Date availableDate;
	private Time availableTime;
	private int hospitalId;
	private int isFree;
	
	public Availability(int doctorId, Date availableDate, Time availableTime, int hospitalId, int isFree) {
		this.doctorId = doctorId;
		this.availableDate = availableDate;
		this.availableTime = availableTime;
		this.hospitalId = hospitalId;
		this.isFree = isFree;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public Date getAvailableDate() {
		return availableDate;
	}
	public void setAvailableDate(Date availableDate) {
		this.availableDate = availableDate;
	}
	public Time getAvailableTime() {
		return availableTime;
	}
	public void setAvailableTime(Time availableTime) {
		this.availableTime = availableTime;
	}
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	public int getIsFree() {
		return isFree;
	}
	public void setIsFree(int isFree) {
		this.isFree = isFree;
	}
}
