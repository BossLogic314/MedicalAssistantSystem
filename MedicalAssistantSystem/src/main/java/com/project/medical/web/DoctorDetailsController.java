package com.project.medical.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.medical.model.Doctor;
import com.project.medical.model.Hospital;
import com.project.medical.model.Qualification;
import com.project.medical.service.DoctorDetailsService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class DoctorDetailsController {

	@Autowired
	private DoctorDetailsService doctorDetailsService;
	
	@GetMapping("/doctorDetails")
	public List<Doctor> getAllDoctorsInfo() {
		
		return doctorDetailsService.getAllDoctorsInfo();
	}
	
	@GetMapping("/getDoctorSpecialization")
	public String getDoctorSpecialization(int specializationId) {
		
		return doctorDetailsService.getDoctorSpecialization(specializationId);
	}
	
	@GetMapping("/getDoctorQualifications")
	public List<Qualification> getDoctorQualifications(int doctorId) {
		
		return doctorDetailsService.getDoctorQualifications(doctorId);
	}
	
	@GetMapping("/getDoctorFromId")
	public Doctor getDoctorFromId(int doctorId) {
		
		return doctorDetailsService.getDoctorFromId(doctorId);
	}
	
	@GetMapping("/getHospitalFromId")
	public Hospital getHospitalFromId(int hospitalId) {
		
		return doctorDetailsService.getHospitalFromId(hospitalId);
	}
}
