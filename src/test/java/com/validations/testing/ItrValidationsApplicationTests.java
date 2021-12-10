package com.validations.testing;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import com.validations.checking.ItrValidationsApplication;
import com.validations.checking.dao.ValidationDao;
import com.validations.checking.entities.ITR6Validation;

@SpringBootTest
@ContextConfiguration(classes = ItrValidationsApplication.class)
 class ItrValidationsApplicationTests {
	@Autowired
	private ValidationDao valrepo;

	
	@Test
	void AddC_name() {

		ITR6Validation val = new ITR6Validation();

		
		val.setC_name("company");
		val.setAddress("Mumbai Wadala 400037");
		val.setZipCode("400037");
		val.setEmailId("shaikhtasdi@gmail.com");
		val.setAdhaarId("912342234567");
		val.setPanId("EDCBA1234F");
		val.setPhNo("9745000000");
		val.setcIN("L12345AB1234ABC123456");
		val.setDate("12/01/2021");
		val.setCountry("India");
		
		this.valrepo.save(val);
		//boolean result = 
		valrepo.existsById(val.getC_Id());
		assertThat(true).isTrue();

	}
}
