package com.holoteq.client;

import java.util.Date;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.Response;

import com.holoteq.dto.TheoryTestAppointment;
import com.sun.jersey.api.client.Client;
//import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class TheoryTestAppointmentClient {

	static String URL = "http://localhost:8080/holoteq-app/theoryTestAppointement/";

	public static void getTheoryTestAppointmentById(Long id) {

		javax.ws.rs.client.Client client = ClientBuilder.newClient();
		WebTarget base = client.target(URL);
		WebTarget byId = base.path("{id}").resolveTemplate("id", id);
		TheoryTestAppointment appointmentDetails = byId.request(MediaType.APPLICATION_JSON)
				.get(TheoryTestAppointment.class);
		System.out.println(appointmentDetails.getId() + ", " + appointmentDetails.getAppointementDate() + ", "
				+ appointmentDetails.getTraningType());
		client.close();
	}
	
	public static void addTheoryTestAppointment(TheoryTestAppointment theoryTestAppointment) {
		
		javax.ws.rs.client.Client client = ClientBuilder.newClient();
		WebTarget base = client.target(URL);
		WebTarget add = base.path("add");
		javax.ws.rs.core.Response response = add.request(MediaType.APPLICATION_JSON)
				.post(Entity.json(theoryTestAppointment));
		
		System.out.println("Response Http Status: "+ response.getStatus());
        System.out.println(response.getLocation());
        
	    client.close();
	}

	public static void main(String[] args) {

		getTheoryTestAppointmentById(4L);
		
		TheoryTestAppointment add = new TheoryTestAppointment();
		add.setId(100L);
		add.setAppointementDate(new Date());
		add.setTraningType("Test to Traning type of application");
//		addTheoryTestAppointment(add);
	}
}
