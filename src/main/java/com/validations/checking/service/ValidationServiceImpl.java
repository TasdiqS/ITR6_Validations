package com.validations.checking.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.validations.checking.dao.General2Dao;
import com.validations.checking.dao.NatureOfBusinessDao;
import com.validations.checking.dao.ValidationDao;
import com.validations.checking.entities.General2;
import com.validations.checking.entities.ITR6Validation;
import com.validations.checking.entities.NatureOfBusiness;

@Service
public class ValidationServiceImpl implements ValidationService {
     	
	@Autowired
	private ValidationDao validationDao;
	@Autowired
	private General2Dao general2Dao;
	@Autowired
	private NatureOfBusinessDao natureOfBusinessDao;

	@Override
	public String test() {
		return "The configuration is done properly... this call is from service impl class";
	}

	//methods for itr6validation class
	@Override
	public List<ITR6Validation> getData() {
		return validationDao.findAll();
	}
	@Override
	public ITR6Validation addData(ITR6Validation data) {
		return validationDao.save(data);
	}

	//methods for General2 class
	@Override
	public General2 addGeneral2Data(General2 data) {
		return general2Dao.save(data);
	}
	@Override
	public List<General2> getGeneral2Data() {
		return general2Dao.findAll();
	}

	//methods for Nature of Business class
	@Override
	public NatureOfBusiness addNOBData(NatureOfBusiness data) {
		return natureOfBusinessDao.save(data);
	}
	@Override
	public List<NatureOfBusiness> getNOBData() {
		return natureOfBusinessDao.findAll();
	}
}