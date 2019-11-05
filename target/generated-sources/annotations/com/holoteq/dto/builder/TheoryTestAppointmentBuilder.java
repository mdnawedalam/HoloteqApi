package com.holoteq.dto.builder;

import javax.annotation.Generated;
import com.holoteq.dto.TheoryTestAppointment;
import java.util.Date;

/**
 * The {@link TheoryTestAppointmentBuilder} is a Builder for {@link TheoryTestAppointment} objects.
 *
 * <p>
 *     This class has been generated.
 *     Please DO NOT MODIFIY this file
 *     since it will be overwritten 
 *     by the PojoBuilder generator.
 * </p>
 */
@Generated("PojoBuilder")
public class TheoryTestAppointmentBuilder implements Cloneable {
	protected TheoryTestAppointmentBuilder self;
	protected Long value$id$java$lang$Long; 
	protected boolean isSet$id$java$lang$Long = false; 

	protected Date value$appointementDate$java$util$Date; 
	protected boolean isSet$appointementDate$java$util$Date = false; 

	protected String value$traningType$java$lang$String; 
	protected boolean isSet$traningType$java$lang$String = false; 



	/**
	 * Creates a new {@link TheoryTestAppointmentBuilder}.
	 */
	public TheoryTestAppointmentBuilder() {
		self = (TheoryTestAppointmentBuilder)this;
	}

	/**
	 * Sets the default value for the {@link TheoryTestAppointment#id} property.
	 * @param value the default value
	 * @return this builder
	 */
	public TheoryTestAppointmentBuilder withId( Long value) {
		this.value$id$java$lang$Long = value;
		this.isSet$id$java$lang$Long = true;
		return self;
	}
	/**
	 * Sets the default value for the {@link TheoryTestAppointment#appointementDate} property.
	 * @param value the default value
	 * @return this builder
	 */
	public TheoryTestAppointmentBuilder withAppointementDate( Date value) {
		this.value$appointementDate$java$util$Date = value;
		this.isSet$appointementDate$java$util$Date = true;
		return self;
	}
	/**
	 * Sets the default value for the {@link TheoryTestAppointment#traningType} property.
	 * @param value the default value
	 * @return this builder
	 */
	public TheoryTestAppointmentBuilder withTraningType( String value) {
		this.value$traningType$java$lang$String = value;
		this.isSet$traningType$java$lang$String = true;
		return self;
	}


	/**
	 * Returns a clone of this builder.
	 * @return the clone
	 */
	@Override	
	public Object clone() {
		try {
			TheoryTestAppointmentBuilder result = (TheoryTestAppointmentBuilder)super.clone();
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
	public TheoryTestAppointmentBuilder but() {
		return (TheoryTestAppointmentBuilder)clone();
	}

	/**
	 * Creates a new {@link TheoryTestAppointment} based on this builder's settings.
	 * @return the created TheoryTestAppointment
	 */
	public TheoryTestAppointment build() {
		TheoryTestAppointment result = new TheoryTestAppointment( );

		if ( this.isSet$id$java$lang$Long) {    
			result.setId( this.value$id$java$lang$Long);		
		}
		if ( this.isSet$appointementDate$java$util$Date) {    
			result.setAppointementDate( this.value$appointementDate$java$util$Date);		
		}
		if ( this.isSet$traningType$java$lang$String) {    
			result.setTraningType( this.value$traningType$java$lang$String);		
		}

		return result;
	}

}