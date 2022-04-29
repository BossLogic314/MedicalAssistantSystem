package com.project.medical.service;

import java.util.List;

import com.project.medical.model.Doctor;
import com.project.medical.model.Hospital;
import com.project.medical.model.Qualification;

public interface DoctorDetailsService {

	public List<Doctor> getAllDoctorsInfo();
	
	public String getDoctorSpecialization(int specializationId);
	
	public List<Qualification> getDoctorQualifications(int doctorId);
	
	public Doctor getDoctorFromId(int doctorId);
	
	public Hospital getHospitalFromId(int hospitalId);
}
