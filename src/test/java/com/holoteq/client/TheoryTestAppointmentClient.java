package com.holoteq.client;

import java.util.Date;
import java.util.List;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.holoteq.dto.TheoryTestAppointment;
import com.holoteq.filter.TheoryTestAppointementFilter;
import com.holoteq.filter.builder.TheoryTestAppointementFilterBuilder;
import com.holoteq.service.TheoryTestAppointementService;
import com.sun.jersey.api.client.Client;
//import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class TheoryTestAppointmentClient {

	@Autowired
	private static TheoryTestAppointementService theoryTestAppointementService;
	
	static String URL = "http://localhost:8080/holoteq/theoryTestAppointement";

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

public static void getAllTheoryTestAppointment(TheoryTestAppointementFilter filter) {
		
		javax.ws.rs.client.Client client = ClientBuilder.newClient();
		WebTarget base = client.target(URL);
		WebTarget add = base.path("/");
		TheoryTestAppointementFilter response = add.request(MediaType.APPLICATION_JSON)
				.get(TheoryTestAppointementFilter.class);
		
		System.out.println("Response Http Status: "+ response.getIds());
//        System.out.println(response.getLocation());
        
	    client.close();
	}

//	 protected static ClientConfig createClientConfig() {
//		  ClientConfig config = new ClientConfig();
//		  config.register(new LoggingFeature(Logger.getLogger(LoggingFeature.DEFAULT_LOGGER_NAME), Level.INFO, LoggingFeature.Verbosity.PAYLOAD_ANY, 10000));
//		  return config;
//		 }
	
	public static void main(String[] args) {

//		getTheoryTestAppointmentById(102L);
		
//		List<TheoryTestAppointment> test = theoryTestAppointementService.findAll(new TheoryTestAppointementFilterBuilder().build());
		
//		System.out.println("test for find all method "+test);
		
//		getAllTheoryTestAppointment(new TheoryTestAppointementFilterBuilder().build());
		
		
		

		
	
//		TheoryTestAppointment add = new TheoryTestAppointment();
//		add.setId(100L);
//		add.setAppointementDate(new Date());
//		add.setTraningType("Test to Traning type of application");
//		addTheoryTestAppointment(add);
	}
}
