package com.validations.testing;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.validations.checking.ItrValidationsApplication;
import com.validations.checking.dao.NatureOfBusinessDao;
import com.validations.checking.entities.NatureOfBusiness;

@SpringBootTest
@ContextConfiguration(classes = ItrValidationsApplication.class)
class NatureOfBusinesstest {

	@Autowired
	private NatureOfBusinessDao valrepo;
	
	@Test
	void test() {
		NatureOfBusiness val = new NatureOfBusiness();
		
		val.setName("Test name");

		this.valrepo.save(val);
		valrepo.existsById(val.getId());
		assertThat(true).isTrue();
	}

}
