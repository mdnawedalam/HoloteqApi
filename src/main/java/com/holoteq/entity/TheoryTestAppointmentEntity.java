package com.holoteq.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.holoteq.dto.TheoryTestAppointment;
import com.holoteq.utils.BasicTableDtoConverter;



/**
 * @author Nawed Alam
 *
 */
@Entity
@Table( name = "TeroyTestAppointment"/*
		 * name = test, schema = SCHEMA
		 */)
public class TheoryTestAppointmentEntity implements BasicTableDtoConverter<TheoryTestAppointment>{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "QID")
	private Long qId;

	@Column(name = "DATE")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date appointementDate;

	@Column(name = "TRANINGTYPE")
	private String traningTypes;

	
	public Date getAppointementDate() {
		return appointementDate;
	}

	public void setAppointementDate(Date appointementDate) {
		this.appointementDate = appointementDate;
	}

	public String getTraningTypes() {
		return traningTypes;
	}

	public void setTraningTypes(String traningTypes) {
		this.traningTypes = traningTypes;
	}

	@Override
	public void setId(Long id) {
		this.qId = id;
	}

	@Override
	public Long getId() {
		return qId;
	}

	@Override
	public void updateDto(TheoryTestAppointment dto) {
		dto.setAppointementDate(getAppointementDate());
		dto.setTraningType(getTraningTypes());
	}

	@Override
	public void updateEntity(TheoryTestAppointment dto) {
		setAppointementDate(dto.getAppointementDate());
		setTraningTypes(dto.getTraningType());
		
	}


	



}
