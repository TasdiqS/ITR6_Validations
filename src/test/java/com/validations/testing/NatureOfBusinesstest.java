package com.validations.testing;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import com.validations.checking.ItrValidationsApplication;
import com.validations.checking.entities.NatureOfBusiness;

@SpringBootTest
@ContextConfiguration(classes = ItrValidationsApplication.class)
class NatureOfBusinesstest {

private Validator validator;
	
	NatureOfBusiness val = new NatureOfBusiness();

	@Test
	public void cName() {
		validator = Validation.buildDefaultValidatorFactory().getValidator();
		
		val.setName("Tasdiq Shaikh");
		Set<ConstraintViolation<NatureOfBusiness>> violations = validator.validate(val);
		assertTrue(violations.isEmpty());
	}
}
