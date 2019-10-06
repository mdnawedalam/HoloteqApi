package com.holoteq.exception;

import java.text.MessageFormat;

import com.holoteq.utils.BasicTableDtoConverter;
import com.holoteq.utils.HasId;

/**
 * @author Nawed Alam
 * Sep 29, 2019
 */
public class HasOptlockException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3406178253180015466L;

	public HasOptlockException(Class<? extends HasId> dtoClass,
			@SuppressWarnings("rawtypes") Class<? extends BasicTableDtoConverter> entityClass) {
		super(MessageFormat.format(
				"dto ({0}) and entity ({1}) do not both implement HasOptlock interface, please fix either way",
				dtoClass, entityClass));
	}
}
