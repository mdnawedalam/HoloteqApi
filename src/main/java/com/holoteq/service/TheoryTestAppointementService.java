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
	@Path("/")
	List<TheoryTestAppointment> findAll(@BeanParam @Valid TheoryTestAppointementFilter filter);

	@GET
	@Path("/{id : \\d+}")
	TheoryTestAppointment findById(@PathParam("id") @NotNull Long id);

	@POST
	@Path("/add")
	Long create(@NotNull TheoryTestAppointment theoryTestAppointment);

	@PUT
	@Path("/{id : \\d+}")
	void update(@PathParam("id") @NotNull Long id, @NotNull TheoryTestAppointment theoryTestAppointment);
	
	@DELETE
    @Path("/{id : \\d+}")
    void deleteById(@PathParam("id") @NotNull Long id);

	@GET
    @Path("/count")
    int count(@BeanParam @Valid TheoryTestAppointementFilter filter);

    @POST
    @Path("/{id : \\d+}/activate")
    void activate(@NotNull @PathParam("id") Long id);

    @POST
    @Path("/{id : \\d+}/deactivate")
    void deactivate(@NotNull @PathParam("id") Long id);
    
}
