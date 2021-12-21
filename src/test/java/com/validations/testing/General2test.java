package com.validations.testing;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.validations.checking.ItrValidationsApplication;
import com.validations.checking.dao.General2Dao;
import com.validations.checking.entities.General2;

@SpringBootTest
@ContextConfiguration(classes = ItrValidationsApplication.class)
class General2test {

	@Autowired
	private General2Dao valrepo;
	@Test
	void test() {

			General2 val = new General2();
			
			val.setAddress("address IFSC tes"); //
			val.setAdhaarId("312345678901"); //
			val.setCity("Pune");  //
			val.setCompanyPanNum("ABCCA1234A"); //
			val.setDate("12/10/2021"); //
			val.setdIN("12345678"); //
			val.setPersonPanNum("ABCPA1234A"); //
			val.setPinCode("654321"); //
			val.setZipCode("54321"); //
			val.setCname("Accentureeee"); //
			val.setTaxPayersRegNum("123abc"); //
			
			
			this.valrepo.save(val);
			valrepo.existsById(val.getC_Id());
			assertThat(true).isTrue();
		}

	}
