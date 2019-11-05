package com.holoteq.filter.builder;

import javax.annotation.Generated;
import java.util.List;
import com.holoteq.filter.TheoryTestAppointementFilter;

/**
 * The {@link TheoryTestAppointementFilterBuilder} is a Builder for {@link TheoryTestAppointementFilter} objects.
 *
 * <p>
 *     This class has been generated.
 *     Please DO NOT MODIFIY this file
 *     since it will be overwritten 
 *     by the PojoBuilder generator.
 * </p>
 */
@Generated("PojoBuilder")
public class TheoryTestAppointementFilterBuilder implements Cloneable {
	protected TheoryTestAppointementFilterBuilder self;
	protected Integer value$pageSize$java$lang$Integer; 
	protected boolean isSet$pageSize$java$lang$Integer = false; 

	protected String value$name$java$lang$String; 
	protected boolean isSet$name$java$lang$String = false; 

	protected Integer value$page$java$lang$Integer; 
	protected boolean isSet$page$java$lang$Integer = false; 

	protected List<Long> value$ids$java$util$List; 
	protected boolean isSet$ids$java$util$List = false; 



	/**
	 * Creates a new {@link TheoryTestAppointementFilterBuilder}.
	 */
	public TheoryTestAppointementFilterBuilder() {
		self = (TheoryTestAppointementFilterBuilder)this;
	}

	/**
	 * Sets the default value for the {@link TheoryTestAppointementFilter#pageSize} property.
	 * @param value the default value
	 * @return this builder
	 */
	public TheoryTestAppointementFilterBuilder withPageSize( Integer value) {
		this.value$pageSize$java$lang$Integer = value;
		this.isSet$pageSize$java$lang$Integer = true;
		return self;
	}
	/**
	 * Sets the default value for the {@link TheoryTestAppointementFilter#name} property.
	 * @param value the default value
	 * @return this builder
	 */
	public TheoryTestAppointementFilterBuilder withName( String value) {
		this.value$name$java$lang$String = value;
		this.isSet$name$java$lang$String = true;
		return self;
	}
	/**
	 * Sets the default value for the {@link TheoryTestAppointementFilter#page} property.
	 * @param value the default value
	 * @return this builder
	 */
	public TheoryTestAppointementFilterBuilder withPage( Integer value) {
		this.value$page$java$lang$Integer = value;
		this.isSet$page$java$lang$Integer = true;
		return self;
	}
	/**
	 * Sets the default value for the {@link TheoryTestAppointementFilter#ids} property.
	 * @param value the default value
	 * @return this builder
	 */
	public TheoryTestAppointementFilterBuilder withIds( List<Long> value) {
		this.value$ids$java$util$List = value;
		this.isSet$ids$java$util$List = true;
		return self;
	}


	/**
	 * Returns a clone of this builder.
	 * @return the clone
	 */
	@Override	
	public Object clone() {
		try {
			TheoryTestAppointementFilterBuilder result = (TheoryTestAppointementFilterBuilder)super.clone();
			result.self = result;
			return result;
		} catch (CloneNotSupportedException e) {
			throw new InternalError(e.getMessage());
		}        
	}

	/**
	 * Returns a clone of this builder.
	 * @return the clone
	 */
	public TheoryTestAppointementFilterBuilder but() {
		return (TheoryTestAppointementFilterBuilder)clone();
	}

	/**
	 * Creates a new {@link TheoryTestAppointementFilter} based on this builder's settings.
	 * @return the created TheoryTestAppointementFilter
	 */
	public TheoryTestAppointementFilter build() {
		TheoryTestAppointementFilter result = new TheoryTestAppointementFilter( );

		if ( this.isSet$pageSize$java$lang$Integer) {    
			result.setPageSize( this.value$pageSize$java$lang$Integer);		
		}
		if ( this.isSet$name$java$lang$String) {    
			result.setName( this.value$name$java$lang$String);		
		}
		if ( this.isSet$page$java$lang$Integer) {    
			result.setPage( this.value$page$java$lang$Integer);		
		}
		if ( this.isSet$ids$java$util$List) {    
			result.setIds( this.value$ids$java$util$List);		
		}

		return result;
	}

}