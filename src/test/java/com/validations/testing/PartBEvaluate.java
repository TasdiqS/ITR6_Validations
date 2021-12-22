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

import com.validations.checking.entities.ITR6Validation;
import com.validations.checking.entities.PartB;

@SpringBootTest
@ContextConfiguration(classes = ITR6Validation.class)
public class PartBEvaluate 
	{
	public Validator validator;
	PartB val= new PartB();

	
	@BeforeEach
	public void setUp()
	{
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		validator= factory.getValidator();
	}
	
	@Test
	public void testAmount()
	{
		val.setAmount("7636576");
		Set<ConstraintViolation<PartB>> violations= validator.validate(val);
		assertTrue(violations.isEmpty());
	}
	
	@Test
	public void testIfscCode()
	{
		val.setIfsccode("MAHB0GH1234");
		Set<ConstraintViolation<PartB>> violations= validator.validate(val);
		assertTrue(violations.isEmpty());
	}
	
	@Test
	public void testAccountNo()
	{
		val.setAccountno("657489233145");
		Set<ConstraintViolation<PartB>> violations=validator.validate(val);
		assertTrue(violations.isEmpty());
	}
}