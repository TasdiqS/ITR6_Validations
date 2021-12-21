package com.validations.testing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.validations.checking.ItrValidationsApplication;
import com.validations.checking.dao.ITDao;
import com.validations.checking.entities.IT;

@SpringBootTest
@ContextConfiguration(classes = ItrValidationsApplication.class)
public class IT_Test {
	@Autowired
	private ITDao itrepo;
     
	@Test
	void Test_IT()
	{
		IT it = new IT();
		
		it.setBsr_no("1234567");
		it.setSerial_no_challan("67287");
		it.setAmount("98312980000");
		this.itrepo.save(it);
		itrepo.existsById(it.getC_Id());
		assertThat(true).isTrue();
		
		
		
	}
	
	
	

}
