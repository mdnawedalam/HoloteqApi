package com.holoteq.utils;

import org.springframework.hateoas.Identifiable;

/**
 * @author Nawed Alam Sep 29, 2019
 */
public interface HasId extends Identifiable {
	
	void setId(Long id);
}
