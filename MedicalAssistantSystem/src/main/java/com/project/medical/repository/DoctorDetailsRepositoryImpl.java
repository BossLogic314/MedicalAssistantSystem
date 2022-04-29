package com.project.medical.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.medical.model.Doctor;
import com.project.medical.model.Hospital;
import com.project.medical.model.Qualification;

@Repository
public class DoctorDetailsRepositoryImpl implements DoctorDetailsRepository {

	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public Iterable<Doctor> getAllDoctorsInfo() {
		return jdbc.query("select * from Doctor order by specialization_id", this::doctorMapper);
	}
	
	@Override
	public String getDoctorSpecialization(int specializationId) {
		
		return jdbc.queryForObject("select area_of_specialization from Specialization where id = ?", this::specializationMapper,
				specializationId);
	}
	
	@Override
	public List<Qualification> getDoctorQualifications(int doctorId) {
		
		return jdbc.query("select * from Qualification where doctor_id = ?", this::qualificationMapper, doctorId);
	}
	
	@Override
	public Doctor getDoctorFromId(int doctorId) {
		
		return jdbc.queryForObject("select * from Doctor where id = ?", this::doctorMapper, doctorId);
	}
	
	@Override
	public Hospital getHospitalFromId(int hospitalId) {
		
		return jdbc.queryForObject("select * from Hospital where id = ?", this::hospitalMapper, hospitalId);
	}
	
	private Doctor doctorMapper(ResultSet rs, int rowNum) throws SQLException {
		
		return new Doctor(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"), rs.getInt("age"),
				rs.getString("gender").charAt(0), rs.getInt("specialization_id"), rs.getInt("experience"),
				rs.getInt("contact_details_id"), rs.getInt("salary_id"));
	}
	
	private String specializationMapper(ResultSet rs, int rowNum) throws SQLException {
		
		return rs.getString("area_of_specialization");
	}
	
	private Qualification qualificationMapper(ResultSet rs, int rowNum) throws SQLException {
		
		return new Qualification(rs.getInt("id"), rs.getInt("doctor_id"), rs.getString("degree_name"),
				rs.getString("joining_year"), rs.getString("graduation_year"));
	}
	
	private Hospital hospitalMapper(ResultSet rs, int rowNum) throws SQLException {
		
		return new Hospital(rs.getInt("id"), rs.getString("name"), rs.getString("phone_no"), rs.getString("address"));
	}
}
