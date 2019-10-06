package com.holoteq.utils;

/**
 * @author Nawed Alam
 *
 * @param <DTO> Sep 29, 2019
 */
public interface BasicTableDtoConverter<DTO extends HasId> extends HasId {

	void updateDto(DTO dto);

	void updateEntity(DTO dto);
}
