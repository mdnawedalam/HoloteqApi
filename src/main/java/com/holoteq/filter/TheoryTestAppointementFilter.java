package com.holoteq.filter;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.QueryParam;

import com.holoteq.utils.IdsFilter;
import com.holoteq.utils.Paged;

import net.karneim.pojobuilder.GeneratePojoBuilder;

@GeneratePojoBuilder(intoPackage = "*.builder")
public class TheoryTestAppointementFilter extends Paged implements IdsFilter {

	@QueryParam("filterIds")
	private List<Long> ids;

	@QueryParam("name")
	private String name;

	public TheoryTestAppointementFilter() {
		super(Paged.DEFAULT_PAGE, Paged.DEFAULT_PAGESIZE);
	}

	@Override
	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

	public List<Long> getIds() {
		if (this.ids == null) {
			this.ids = new ArrayList<>();
		}
		return this.ids;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
