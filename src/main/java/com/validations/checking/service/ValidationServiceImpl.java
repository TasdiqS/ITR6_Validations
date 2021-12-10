package com.validations.checking.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.validations.checking.dao.ValidationDao;
import com.validations.checking.entities.ITR6Validation;

@Service
public class ValidationServiceImpl implements ValidationService {
     	
	@Autowired
	private ValidationDao validationDao;
	
	@Override
	public String test() {
		return "The configuration is done properly... this call is from service impl class";
	}

	@Override
	public List<ITR6Validation> getData() {
		// TODO Auto-generated method stub
		return validationDao.findAll();
	}

	@Override
	public ITR6Validation addData(ITR6Validation data) {
		// TODO Auto-generated method stub
		return validationDao.save(data);
	}
	
	

}
