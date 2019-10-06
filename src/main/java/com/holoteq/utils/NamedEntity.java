package com.holoteq.utils;

public class NamedEntity implements HasId{

	public Long id;
	
	@Override
	public Long getId() {
		return this.id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

}
