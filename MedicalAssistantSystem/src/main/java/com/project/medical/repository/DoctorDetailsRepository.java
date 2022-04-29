package com.project.medical.repository;

import com.project.medical.model.Doctor;
import com.project.medical.model.Hospital;
import com.project.medical.model.Qualification;

public interface DoctorDetailsRepository {

	public Iterable<Doctor> getAllDoctorsInfo();
	
	public String getDoctorSpecialization(int specializationId);
	
	public Iterable<Qualification> getDoctorQualifications(int doctorId);
	
	public Doctor getDoctorFromId(int doctorId);
	
	public Hospital getHospitalFromId(int hospitalId);
}
