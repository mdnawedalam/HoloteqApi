package com.holoteq.utils;

import java.util.List;

/**
 * @author Nawed Alam
 *
 * @param <ENTITY>
 * @param <FILTER> Sep 29, 2019
 */
public interface BasicRepositoryCustom<ENTITY, FILTER> {
	
	List<ENTITY> findAll(FILTER filter);

	ENTITY findOne(FILTER filter);

	int count(FILTER filter);
}
