package com.validations.testing;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
import com.validations.checking.entities.General1;

@SpringBootTest
@ContextConfiguration(classes = ItrValidationsApplication.class)
public class General1Test {


	private Validator validator;
	
	General1 val = new General1();


	@BeforeEach
	public void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	@Test
	public void testPersonPan() {

		
		val.setPersonPanNum("ABCPA1234A");
		Set<ConstraintViolation<General1>> violations = validator.validate(val);
		assertTrue(violations.isEmpty());

	}

	@Test
	public void testcompan() {

	
		val.setCompanyPanNum("ABCCA1234A");
		Set<ConstraintViolation<General1>> violations = validator.validate(val);
		assertTrue(violations.isEmpty());

	}

	@Test
	public void testcin() {

		
		val.setcIN("L12345AB1234ABC123456");
		Set<ConstraintViolation<General1>> violations = validator.validate(val);
		assertTrue(violations.isEmpty());

	}

	@Test
	public void testdIN() {
		
		val.setdIN("12345678");
		Set<ConstraintViolation<General1>> violations = validator.validate(val);
		assertTrue(violations.isEmpty());
	}

	@Test
	public void teststreet() {
		
		val.setStreet("bandra road");
		Set<ConstraintViolation<General1>> violations = validator.validate(val);
		assertTrue(violations.isEmpty());
	}

	@Test
	public void testname() {
		
		val.setName("Accenture");
		Set<ConstraintViolation<General1>> violations = validator.validate(val);
		assertTrue(violations.isEmpty());
	}

	@Test
	public void testDate() {
	
		val.setDate("01/01/2021");
		Set<ConstraintViolation<General1>> violations = validator.validate(val);
		assertTrue(violations.isEmpty());
	}

	@Test
	public void testcity() {
		
		val.setCity("AMravati");
		Set<ConstraintViolation<General1>> violations = validator.validate(val);
		assertTrue(violations.isEmpty());
	}

	@Test
	public void testpincode() {
		General1 val = new General1();
		val.setPinCode("444606");
		Set<ConstraintViolation<General1>> violations = validator.validate(val);
		assertTrue(violations.isEmpty());
	}

	@Test
	public void testemail() {
		
		val.setEmailId("jayraut05@gmail.com");
		Set<ConstraintViolation<General1>> violations = validator.validate(val);
		assertTrue(violations.isEmpty());
	}
	
	@Test
	public void testmem_no_auditor() {
	
		val.setMem_no_auditor("123456");
		Set<ConstraintViolation<General1>> violations = validator.validate(val);
		assertTrue(violations.isEmpty());
	}
	
    @Test
    public void testfirm_reg_no() {
    	  
	  val.setFirm_reg_no("12345678");
     Set<ConstraintViolation<General1>> violations = validator.validate(val);
        assertTrue(violations.isEmpty());
    }
  
   @Test
    public void testdpiit() {
	   
        val.setDpiit("12345678");
    Set<ConstraintViolation<General1>> violations = validator.validate(val);
        assertTrue(violations.isEmpty());
    }
	    @Test
       public void teststd_code() {
	    	  
	    	  val.setStd_code("24");
	        Set<ConstraintViolation<General1>> violations = validator.validate(val);
	        assertTrue(violations.isEmpty());
    }  
        @Test
	   public void testphno() {
	 
	    	val.setPhno("3456798");
	        Set<ConstraintViolation<General1>> violations = validator.validate(val);
	        assertTrue(violations.isEmpty());
	    }
	    
	    @Test
	    public void testmobile() {
	    	  
            val.setMobile("9376532567");
	        Set<ConstraintViolation<General1>> violations = validator.validate(val);
        assertTrue(violations.isEmpty());
    }    
	
	    
	    @Test
	       public void testSebiRegNo() {
		    	  
		    	  val.setSebiRegNumber("24847294233");
		        Set<ConstraintViolation<General1>> violations = validator.validate(val);
		        assertTrue(violations.isEmpty());
	    } 
	    
	    @Test
	       public void testzipcode() {
		    	  
		     val.setZipcode("1987");
		     Set<ConstraintViolation<General1>> violations = validator.validate(val);
		        assertTrue(violations.isEmpty());
	    } 
	
}
