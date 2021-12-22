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
import com.validations.checking.entities.OS;

@SpringBootTest
@ContextConfiguration(classes = ItrValidationsApplication.class)
public class OSEvaluate 
	{
	private Validator validator;
	OS val= new OS();
	
	@BeforeEach
	public void setUp()
	{
	ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
	validator=factory.getValidator();
	}
	
	@Test
	public void testGrossIncome()
	{
		val.setGrossincome("2345212");
		Set<ConstraintViolation<OS>> violations= validator.validate(val);
		assertTrue(violations.isEmpty());
	}
	
	@Test
	public void testNature1e()
	{
		val.setNature1e("acASS");
		Set<ConstraintViolation<OS>> violations= validator.validate(val);
		assertTrue(violations.isEmpty());
	}
	
	@Test
	public void testChargableIncome()
	{
		val.setChargableincome("2314");
		Set<ConstraintViolation<OS>> violations= validator.validate(val);
		assertTrue(violations.isEmpty());
	}
	
	@Test
	public void testRasteAsItAct()
	{
		val.setRateasitact("6532");
		Set<ConstraintViolation<OS>> violations= validator.validate(val);
		assertTrue(violations.isEmpty());
	}
	
	@Test
	public void testRateAsIt()
	{
		val.setRateastt("673243");
		Set<ConstraintViolation<OS>> violations= validator.validate(val);
		assertTrue(violations.isEmpty());
	}
	
	@Test
	public void testSiNumber()
	{
		val.setSinumber("5242");
		Set<ConstraintViolation<OS>> violations= validator.validate(val);
		assertTrue(violations.isEmpty());
	}
	}
