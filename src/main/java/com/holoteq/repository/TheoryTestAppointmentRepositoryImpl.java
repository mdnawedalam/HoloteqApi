package com.holoteq.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

//import com.example.demo.exception.RecordNotFoundException;
import com.holoteq.entity.TheoryTestAppointmentEntity;
import com.holoteq.exception.RecordNotFoundException;
import com.holoteq.filter.TheoryTestAppointementFilter;

/**
 * @author Nawed Alam Sep 29, 2019
 */
public class TheoryTestAppointmentRepositoryImpl implements TheoryTestAppointmentRepositoryCustom {

	private static final Logger LOGGER = LoggerFactory.getLogger(TheoryTestAppointmentRepositoryImpl.class);

	@Resource
	private EntityManager entityManager;

	@Override
	public List<TheoryTestAppointmentEntity> findAll(TheoryTestAppointementFilter filter) {

		final TypedQuery<TheoryTestAppointmentEntity> dynamicTypedQuery = getDynamicTypedQuery(filter);
		final List<TheoryTestAppointmentEntity> entityList = (filter.getPage() == null && filter.getPageSize() == null)
				? dynamicTypedQuery.getResultList()
				: dynamicTypedQuery.setFirstResult(filter.getPage() * filter.getPageSize())
						.setMaxResults(filter.getPageSize()).getResultList();
		return entityList == null ? new ArrayList<>() : entityList;
	}

	@Override
	public TheoryTestAppointmentEntity findOne(TheoryTestAppointementFilter filter) {
		LOGGER.info("--------------- Enter to FindByID ------------------");
		 Optional<TheoryTestAppointmentEntity> findFirst = getDynamicTypedQuery(filter).getResultList()
				 .stream().findFirst();
		System.out.println(findFirst);
		
		return findFirst.get();
	}

	@Override
	public int count(TheoryTestAppointementFilter filter) {
		return findAll(filter).size();
	}

	private TypedQuery<TheoryTestAppointmentEntity> getDynamicTypedQuery(TheoryTestAppointementFilter filter) {

		final CriteriaBuilder criteriaBuilder = this.entityManager.getCriteriaBuilder();
		final CriteriaQuery<TheoryTestAppointmentEntity> criteriaQuery = criteriaBuilder
				.createQuery(TheoryTestAppointmentEntity.class);
		final Root<TheoryTestAppointmentEntity> root = criteriaQuery.from(TheoryTestAppointmentEntity.class);

		final List<Predicate> predicates = new ArrayList<>();

		if (!CollectionUtils.isEmpty(filter.getIds())) {

			LOGGER.info("-------------- Enter to DynamicTypedQuery ------------------");
			predicates.add(root.get("qId").in(filter.getIds()));
		}

		if (!predicates.isEmpty()) {
			criteriaQuery.where(predicates.toArray(new Predicate[] {})).distinct(true);
		}

		return this.entityManager.createQuery(criteriaQuery);
	}

//	private TypedQuery<TheoryTestAppointmentEntity> getDynamicTypedQuery(Long id) {
//		// TODO Auto-generated method stub
//
//		final CriteriaBuilder criteriaBuilder = this.entityManager.getCriteriaBuilder();
//		final CriteriaQuery<TheoryTestAppointmentEntity> criteriaQuery = criteriaBuilder
//				.createQuery(TheoryTestAppointmentEntity.class).distinct(true);
//		final Root<TheoryTestAppointmentEntity> root = criteriaQuery.from(TheoryTestAppointmentEntity.class);
//
//		final List<Predicate> predicates = new ArrayList<>();
//
//		predicates.add(root.get("qId").in(id));
//
//		if (!predicates.isEmpty()) {
//			criteriaQuery.where(predicates.toArray(new Predicate[] {})).distinct(true);
//		}
//
//		return this.entityManager.createQuery(criteriaQuery);
//	}
}
