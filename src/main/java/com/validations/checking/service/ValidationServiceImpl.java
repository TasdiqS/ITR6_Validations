package com.validations.checking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.validations.checking.entities.*;
import com.validations.checking.dao.*;

@Service
public class ValidationServiceImpl implements ValidationService {

	@Autowired
	private ValidationDao validationDao;

	@Autowired
	private NatureOfBusinessDao natureOfBusinessDao;

	@Autowired
	private General2Dao general2Dao;

	@Autowired
	private General1Dao general1Dao;

	@Autowired
	private ITDao itDao;

	@Autowired
	private EIDao eiDao;

	@Autowired
	private PartBDao partbDao;
	
	@Autowired
	private OSDao osDao;
	
	@Override
	public String test() {
		return "The configuration is done properly... this call is from service impl class";
	}

	// methods for itr6validation class
	@Override
	public List<ITR6Validation> getData() {
		return validationDao.findAll();
	}

	@Override
	public ITR6Validation addData(ITR6Validation data) {
		return validationDao.save(data);
	}

	// methods for General2 class
	@Override
	public General2 addGeneral2Data(General2 data) {
		return general2Dao.save(data);
	}

	@Override
	public List<General2> getGeneral2Data() {
		return general2Dao.findAll();
	}

	// methods for Nature of Business class
	@Override
	public NatureOfBusiness addNOBData(NatureOfBusiness data) {
		return natureOfBusinessDao.save(data);
	}

	@Override
	public List<NatureOfBusiness> getNOBData() {
		return natureOfBusinessDao.findAll();
	}

	@Override
	public List<General1> getGeneral1Data() {
		return general1Dao.findAll();
	}

	@Override
	public General1 addGeneral1Data(General1 data) {
		return general1Dao.save(data);
	}

	@Override
	public List<IT> getitData() {
		return itDao.findAll();
	}

	@Override
	public IT additData(IT data) {
		return itDao.save(data);
	}

	@Override
	public List<EI> getEIData() {
		return eiDao.findAll();
	}

	@Override
	public EI addEIData(EI data) {
		return eiDao.save(data);
	}

	@Override
	public List<PartB> getPartBData() {
		return partbDao.findAll();
	}

	@Override
	public PartB addPartBData(PartB data) {
		return partbDao.save(data);
	}
		
		@Override
		public List<OS> getOSData()
		{
			// TODO Auto-generated method stub
			return this.osDao.findAll() ;
		}
		
		@Override
		public OS addOSData(OS data)
		{
		// TODO Auto-generated method stub
			return osDao.save(data);
			}
		}
