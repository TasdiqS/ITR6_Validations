package com.validations.checking.service;

import java.util.List;
import com.validations.checking.entities.General2;
import com.validations.checking.entities.ITR6Validation;
import com.validations.checking.entities.NatureOfBusiness;

public interface ValidationService {

	String test();
	
	public List<ITR6Validation> getData();
	public ITR6Validation addData(ITR6Validation data);

	public General2 addGeneral2Data(General2 data);
	public List<General2> getGeneral2Data();

	NatureOfBusiness addNOBData(NatureOfBusiness data);
    List<NatureOfBusiness> getNOBData();

}
