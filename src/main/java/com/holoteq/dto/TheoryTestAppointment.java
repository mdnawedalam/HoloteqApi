package com.holoteq.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.holoteq.utils.NamedEntity;

import net.karneim.pojobuilder.GeneratePojoBuilder;

/**
 * @author Nawed Alam Sep 28, 2019
 */
@GeneratePojoBuilder(intoPackage = "*.builder")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TheoryTestAppointment extends NamedEntity {

	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date appointementDate;

	private String trainingType;

	public TheoryTestAppointment() {

	}

	public Date getAppointementDate() {
		return appointementDate;
	}

	public void setAppointementDate(Date appointementDate) {
		this.appointementDate = appointementDate;
	}

	public String getTraningType() {
		return trainingType;
	}

	public void setTraningType(String traningType) {
		this.trainingType = traningType;
	}

}
