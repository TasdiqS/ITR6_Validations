package com.validations.testing;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.validations.checking.ItrValidationsApplication;
import com.validations.checking.entities.IT;

@SpringBootTest
@ContextConfiguration(classes = ItrValidationsApplication.class)
class ITtest {
	
	
	
	private Validator validator;
	IT val=new IT();
	
	
	
	@BeforeEach
	public void setUp()
	{
	ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
	validator=factory.getValidator();
	}

	
	
	
	
	
	@Test
	public void Bsr_no() {
		val.setBsr_no("234avsd");
		Set<ConstraintViolation<IT>> violations= validator.validate(val);
		assertTrue(violations.isEmpty());
	}
	@Test
	public void Serial_no_challan() {
		val.setSerial_no_challan("23423");
		Set<ConstraintViolation<IT>> violations= validator.validate(val);
		assertTrue(violations.isEmpty());
	}
	@Test
	public void setAmount() {
		val.setAmount("98876473");
		Set<ConstraintViolation<IT>> violations= validator.validate(val);
		assertTrue(violations.isEmpty());
	}

}

