package com.project.medical.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.medical.model.Doctor;
import com.project.medical.model.Hospital;
import com.project.medical.model.Qualification;
import com.project.medical.repository.DoctorDetailsRepository;

@Service
public class DoctorDetailsServiceImpl implements DoctorDetailsService {

	@Autowired
	private DoctorDetailsRepository doctorDetailsRepository;
	
	@Override
	public List<Doctor> getAllDoctorsInfo() {
		return (List<Doctor>) doctorDetailsRepository.getAllDoctorsInfo();
	}
	
	@Override
	public String getDoctorSpecialization(int specializationId) {
		
		return doctorDetailsRepository.getDoctorSpecialization(specializationId);
	}
	
	@Override
	public List<Qualification> getDoctorQualifications(int doctorId) {
		
		return (List<Qualification>) doctorDetailsRepository.getDoctorQualifications(doctorId);
	}
	
	@Override
	public Doctor getDoctorFromId(int doctorId) {
		
		return doctorDetailsRepository.getDoctorFromId(doctorId);
	}
	
	@Override
	public Hospital getHospitalFromId(int hospitalId) {
		
		return doctorDetailsRepository.getHospitalFromId(hospitalId);
	}
}
