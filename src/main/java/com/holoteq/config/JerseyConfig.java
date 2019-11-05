package com.holoteq.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.holoteq.service.TheoryTestAppointementService;

@Component
@ApplicationPath("/holoteq")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		register(TheoryTestAppointementService.class);
	}
}
