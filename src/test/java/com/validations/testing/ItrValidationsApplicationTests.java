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
	void validation() {

		ITR6Validation val = new ITR6Validation();
		
		val.setAccountNumber("123456789");
		val.setAddress("Kondhwa");
		val.setAdhaarId("312345678901");
		val.setAmount("222000");
		val.setArticleOfDtaa("12345");
		val.setBsrCode("1234567");
		val.setcIN("L12345AB1234ABC123456");
		val.setCity("Bombay");
		val.setCompanyPanNum("ABCCA1234A");
		val.setCountry("Hindustan");
		val.setCountryCode("+91");
		val.setDate("12/17/202116");
		val.setdIN("12345678");
		val.setEmailId("akshay@gmail.com");
		val.setIfscCode(null);
		val.setName("Testing");
		val.setPersonPanNum("ABCPA1234A");
		val.setPhNo("9876543212");
		val.setPinCode("411046");
//		val.setRate("50");
		val.setSebiRegNumber("12345");
		val.setSerialNumberOfChallan("12345");
		val.setZipCode("65434");
		
		
		this.valrepo.save(val);
		//boolean result = 
		valrepo.existsById(val.getC_Id());
		assertThat(true).isTrue();

	}
}
