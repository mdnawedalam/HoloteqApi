package com.holoteq.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.holoteq.dto.TheoryTestAppointment;
import com.holoteq.entity.TheoryTestAppointmentEntity;
import com.holoteq.filter.TheoryTestAppointementFilter;
import com.holoteq.repository.TheoryTestAppointmentRepository;
import com.holoteq.service.TheoryTestAppointementService;
import com.holoteq.utils.AbstractBasicService;

@Service
public class TheoryTestAppointementServiceImpl extends
		AbstractBasicService<TheoryTestAppointmentEntity, TheoryTestAppointment, TheoryTestAppointementFilter, TheoryTestAppointmentRepository>
		implements TheoryTestAppointementService {

	private static final Logger LOGGER = LoggerFactory.getLogger(TheoryTestAppointementServiceImpl.class);

	public TheoryTestAppointementServiceImpl() {
		super(TheoryTestAppointmentEntity.class, TheoryTestAppointment.class, TheoryTestAppointementFilter.class);
	}

	@Autowired
	private TheoryTestAppointmentRepository theoryTestAppointementRepo;

	@Override
	protected TheoryTestAppointmentRepository getRepository() {
		return this.theoryTestAppointementRepo;
	}

	@Override
	public TheoryTestAppointment findById(Long id) {
		return super.findByIdDefault(id);
	}

	@Override
	public Long create(TheoryTestAppointment theoryTestAppointment) {
		// TODO Auto-generated method stub
		return super.createDefault(theoryTestAppointment);
	}

}
