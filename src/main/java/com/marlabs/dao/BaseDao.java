package com.marlabs.dao;

import java.util.Iterator;

import com.marlabs.dto.CategoryDto;
import com.marlabs.model.Category;

/**
 * 
 * This is the generic interface for mapping which can convert DtoToEntity,
 * EntityToDto
 * 
 *
 */

public interface BaseDao<S, D> {
	/**
	 * 
	 * This method will be used to convert Dto To Entity
	 * 
	 * @param dto the dto will be converted to entity
	 * @return entity
	 */
	public D mapDtoToEntity(S dto);

	/**
	 * This method will be used to convert Entity To Dto
	 * 
	 * @param entity the entity will converted to Dto
	 * @return Dto
	 */
	public S mapEntityToDto(D entity);

	CategoryDto mapEntityToDto(Iterator<Category> iterator);
}
