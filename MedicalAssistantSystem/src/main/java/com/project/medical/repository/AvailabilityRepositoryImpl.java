package com.project.medical.repository;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project.medical.model.Availability;

@Repository
public class AvailabilityRepositoryImpl implements AvailabilityRepository {

	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public Iterable<Date> getAvailableDates() {
		
		return jdbc.query("select distinct available_date from Availability order by available_date", this::dateMapper);
	}
	
	@Override
	public Iterable<Availability> getAvailableSlotsForDate(String date) {
		
		return jdbc.query("select * from Availability where available_date = ? and is_free = 1 order by hospital_id",
				this::availabilityMapper, date);
	}
	
	private Date dateMapper(ResultSet rs, int rowNum) throws SQLException {
		return rs.getDate("available_date");
	}
	
	private Availability availabilityMapper(ResultSet rs, int rowNum) throws SQLException {
		return new Availability(rs.getInt("doctor_id"), rs.getDate("available_date"), rs.getTime("available_time"),
				rs.getInt("hospital_id"), rs.getInt("is_free"));
	}
}
