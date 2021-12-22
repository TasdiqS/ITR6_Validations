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
 * com.validations.checking.dao.EIDao; import
 * com.validations.checking.entities.EI;
 * 
 * @SpringBootTest
 * 
 * @ContextConfiguration(classes = ItrValidationsApplication.class)
 * 
 * public class EiValidations {
 * 
 * @Autowired private EIDao eiDao;
 * 
 * @Test void validations() { EI val=new EI();
 * 
 * val.setAmount("231423"); val.setDistrictname("Pune");
 * val.setPincode("412303"); val.setLandmeasure("734542");
 * val.setChargabledtaa("65432");
 * 
 * this.eiDao.save(val); eiDao.existsById(val.getC_Id());
 * assertThat(true).isTrue();
 * 
 * } }
 */