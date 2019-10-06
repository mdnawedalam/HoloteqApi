package com.holoteq.service;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.holoteq.dto.TheoryTestAppointment;
import com.holoteq.filter.TheoryTestAppointementFilter;

/**
 * @author Nawed Alam Sep 28, 2019
 */
@Component
@Path("/theoryTestAppointement")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface TheoryTestAppointementService {

	
	@GET
	@Path("/{id}")
	TheoryTestAppointment findById(@PathParam("id") @NotNull Long id);

	@POST
	@Path("/add")
	Long create(@NotNull TheoryTestAppointment theoryTestAppointment);


}
