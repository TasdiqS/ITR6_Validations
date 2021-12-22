package com.validations.testing;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import com.validations.checking.ItrValidationsApplication;
import com.validations.checking.dao.ITDao;
import com.validations.checking.dao.ValidationDao;
import com.validations.checking.entities.IT;
import com.validations.checking.entities.ITR6Validation;
import com.validations.checking.entities.ITR6Validation;

@SpringBootTest
@ContextConfiguration(classes = ItrValidationsApplication.class)
 class ItrValidationsApplicationTests {
	private Validator validator;
	
	ITR6Validation val = new ITR6Validation();

	@BeforeEach
	public void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	@Test
	public void cName() {
		val.setName("Anemoi");
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		assertTrue(violations.isEmpty());
	}
	@Test
	public void Address() {
		val.setAddress("Anemoi");
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}
	@Test
	public void AdhaarId() {
		val.setAdhaarId("312345678901");
<<<<<<< HEAD
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}
	@Test
	public void City() {
		val.setCity("Anemoi");
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}
	@Test
	public void CompanyPan() {
=======
		val.setAmount("222000");
		val.setArticleOfDtaa("12345");
		//val.setBsrCode("1234567");
		val.setcIN("L12345AB1234ABC123456");
		val.setCity("Bombay");
>>>>>>> ae91ba71587d60aa338978acf2216889ea4257de
		val.setCompanyPanNum("ABCCA1234A");
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}
	@Test
	public void Date() {
		val.setDate("12/12/2021");
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}
	@Test
	public void din() {
		val.setdIN("12345678");
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}
	@Test
	public void PercentOfSharesHoldingCompany() {
		val.setPercentageOfSharesOfHoldingCompany(new BigDecimal("9.00"));
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}
	@Test
	public void PercentOfSharesOwnerShareHolder() {
		val.setPercentageOfSharesOfShareHolder(new BigDecimal("12.00"));
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}
	@Test
	public void PersonPan() {
		val.setPersonPanNum("ABCPA1234A");
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}
	@Test
	public void country() {
		val.setCountry("654321");
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}
	@Test
	public void PinCode() {
		val.setPinCode("654321");
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}@Test
	public void countrycode() {
		val.setCountryCode("654321");
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}@Test
	public void ZipCode() {
		val.setZipCode("654321");
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}@Test
	public void PhNo() {
		val.setPhNo("654321");
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}@Test
	public void EmailId() {
		val.setEmailId("654321");
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}@Test
	public void CIN() {
		val.setcIN("654321");
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}@Test
	public void amount() {
		val.setAmount("654321");
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}@Test
	public void bsrCode() {
		val.setBsrCode("654321");
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}@Test
	public void serialNumberOfChallan() {
		val.setSerialNumberOfChallan("654321");
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}@Test
	public void accountNumber() {
		val.setAccountNumber("654321");
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}@Test
	public void sebiRegNo() {
		val.setSebiRegNumber("654321");
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}@Test
	public void articleOfDtaa() {
		val.setArticleOfDtaa("654321");
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}@Test
	public void ifsc() {
		val.setIfscCode("654321");
		Set<ConstraintViolation<ITR6Validation>> violations = validator.validate(val);
		
		assertTrue(violations.isEmpty());
	}
	
}
