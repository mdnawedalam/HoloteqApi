package com.holoteq.utils;

/**
 * @author Nawed Alam
 *
 * @param <DTO>
 * @param <FETCHOPTIONS> Sep 29, 2019
 */
public interface FetchTableDtoConverter <DTO extends HasId, FETCHOPTIONS> extends BasicTableDtoConverter<DTO>{

	 void updateDto(DTO dto, FETCHOPTIONS fetchOptions);
}
