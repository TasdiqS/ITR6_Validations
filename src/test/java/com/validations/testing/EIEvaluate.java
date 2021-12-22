package com.validations.testing;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
import com.validations.checking.entities.EI;
import com.validations.checking.entities.OS;

@SpringBootTest
@ContextConfiguration(classes = ItrValidationsApplication.class)
public class EIEvaluate
	{
	public Validator validator;
	EI val= new EI();
	
	@BeforeEach
	public void setUp()
	{
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		validator=factory.getValidator();
	}
	
	@Test
	public void testAmount()
	 	{
		val.setAmount("23421653");
		Set<ConstraintViolation<EI>> violations= validator.validate(val);
		assertTrue(violations.isEmpty());
		}
	
	@Test
	public void testDistrictName()
	{
		val.setDistrictname("Pune");
		Set<ConstraintViolation<EI>> violations= validator.validate(val);
		assertTrue(violations.isEmpty());
	}
	
	@Test
	public void testPincode()
	{
		val.setPincode("412303");
		Set<ConstraintViolation<EI>> violations= validator.validate(val);
		assertTrue(violations.isEmpty());
	}
	
	@Test
	public void testLandMeasure()
	{
		val.setLandmeasure("2564576");
		Set<ConstraintViolation<EI>> violations= validator.validate(val);
		assertTrue(violations.isEmpty());
	}
	
	@Test
	public void testChargableData()
	{
		val.setChargabledtaa("324652863");
		Set<ConstraintViolation<EI>> violations= validator.validate(val);
		assertTrue(violations.isEmpty());
	}	
}