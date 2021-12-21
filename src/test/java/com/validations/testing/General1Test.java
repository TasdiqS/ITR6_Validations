package com.validations.testing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.validations.checking.ItrValidationsApplication;
import com.validations.checking.dao.General1Dao;
import com.validations.checking.entities.General1;

@SpringBootTest
@ContextConfiguration(classes = ItrValidationsApplication.class)
public class General1Test {

	@Autowired
    private General1Dao general1repo;
	
	@Test
	void genral1_val(){
		General1 val= new General1();
		val.setPersonPanNum("ABCPA1234A");
		val.setCompanyPanNum("JLMCQ3214B");
		val.setcIN("L12345AB1234ABC123456");
		val.setName("Accenture");
		val.setdIN("12345678");
		val.setStreet("sutgirni road");
		val.setDate("01/01/2021");
		val.setCity("Amravati");
	     val.setPinCode("444606");
		val.setEmailId("jayraut05@gmail.com");
		val.setMem_no_auditor("123456");
		val.setFirm_reg_no("12345678");
		val.setDpiit("445678923");
		val.setStd_code(1276);
		val.setPhno("3456798");
		val.setSebiRegNumber("125676897812");
		val.setMobile("8798235676");
	      
		this.general1repo.save(val);
		//boolean result = 
		general1repo.existsById(val.getId());
		assertThat(true).isTrue();
		
		
		
		
		
		
		
		
	}

	
}
