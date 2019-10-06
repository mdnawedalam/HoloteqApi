	package com.holoteq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.holoteq.entity.TheoryTestAppointmentEntity;

/**
 * @author Nawed Alam
 * Sep 28, 2019
 */
@Repository
public interface TheoryTestAppointmentRepository extends JpaRepository<TheoryTestAppointmentEntity, Long>, TheoryTestAppointmentRepositoryCustom{

}
