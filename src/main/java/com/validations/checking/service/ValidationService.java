package com.validations.checking.service;

import java.util.List;

import com.validations.checking.entities.General1;
import com.validations.checking.entities.General2;
import com.validations.checking.entities.IT;
import com.validations.checking.entities.ITR6Validation;

public interface ValidationService {

	String test();
	
	public List<ITR6Validation> getData();
	public ITR6Validation addData(ITR6Validation data);

	public IT additData(IT data);
	public List<IT> getitData();

	public List<General1> getGeneral1Data();
	public General1 addGeneral1Data(General1 data);

	public General2 addGeneral2Data(General2 data);
	public List<General2> getGeneral2Data();


}
