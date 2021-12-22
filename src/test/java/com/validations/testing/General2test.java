package com.validations.testing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
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
import com.validations.checking.entities.General2;

@SpringBootTest
@ContextConfiguration(classes=ItrValidationsApplication.class)
class General2test {
	
	private Validator validator;
	
	General2 val = new General2();

	@BeforeEach
	public void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	@Test
	public void cName() {
		val.setCname("Anemoi");
		Set<ConstraintViolation<General2>> violations = validator.validate(val);
		assertTrue(violations.isEmpty());
	}
	@Test
	public void Address() {
		val.setAddress("Anemoi");
		Set<ConstraintViolation<General2>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}
	@Test
	public void AdhaarId() {
		val.setAdhaarId("312345678901");
		Set<ConstraintViolation<General2>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}
	@Test
	public void City() {
		val.setCity("Anemoi");
		Set<ConstraintViolation<General2>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}
	@Test
	public void CompanyPan() {
		val.setCompanyPanNum("ABCCA1234A");
		Set<ConstraintViolation<General2>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}
	@Test
	public void Date() {
		val.setDate("Anemoi");
		Set<ConstraintViolation<General2>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}
	@Test
	public void din() {
		val.setdIN("12345678");
		Set<ConstraintViolation<General2>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}
	@Test
	public void PercentOfSharesHoldingCompany() {
		val.setPercentageOfSharesOfHoldingCompany(new BigDecimal("9.00"));
		Set<ConstraintViolation<General2>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}
	@Test
	public void PercentOfSharesOwnerShareHolder() {
		val.setPercentageOfSharesOfShareHolder(new BigDecimal("12.00"));
		Set<ConstraintViolation<General2>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}
	@Test
	public void PersonPan() {
		val.setPersonPanNum("ABCPA1234A");
		Set<ConstraintViolation<General2>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}
	@Test
	public void PinCode() {
		val.setPinCode("654321");
		Set<ConstraintViolation<General2>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}
}
