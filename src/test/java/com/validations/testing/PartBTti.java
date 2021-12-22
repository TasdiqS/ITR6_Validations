/*
 * package com.validations.testing;
 * 
 * import static org.assertj.core.api.Assertions.assertThat;
 * 
 * import org.junit.jupiter.api.Test; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.test.context.ContextConfiguration;
 * 
 * import com.validations.checking.ItrValidationsApplication; import
 * com.validations.checking.dao.PartBDao; import
 * com.validations.checking.entities.PartB;
 * 
 * 
 * @SpringBootTest
 * 
 * @ContextConfiguration(classes = ItrValidationsApplication.class) public class
 * PartBTti {
 * 
 * @Autowired private PartBDao partbDao;
 * 
 * @Test public void validations() { PartB val= new PartB();
 * 
 * val.setAmount("432516"); val.setIfsccode("MAHB067TR54");
 * val.setAccountno("98765329076");
 * 
 * this.partbDao.save(val); partbDao.existsById(val.getC_Id());
 * assertThat(true).isTrue(); }
 * 
 * 
 * }
 */