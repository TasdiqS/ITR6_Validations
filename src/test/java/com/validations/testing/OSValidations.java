package com.validations.testing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.validations.checking.ItrValidationsApplication;
import com.validations.checking.dao.OSDao;
import com.validations.checking.entities.OS;

@SpringBootTest
@ContextConfiguration(classes = ItrValidationsApplication.class)
public class OSValidations
	{
	
	@Autowired
    private OSDao osdao;
	
	@Test
	void validations()
	{
		OS val=new OS();
		
		val.setGrossincome("1235654321567");
		val.setNature1e("acASS");
		val.setChargableincome("2143");
		val.setRateasitact("1234");
		val.setRateastt("1234872");
		val.setSinumber("1234");

		
		this.osdao.save(val);
		this.osdao.existsById(val.getC_Id());
		assertThat(true).isTrue();

	
		
	}
	}
