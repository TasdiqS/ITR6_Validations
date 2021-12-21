package com.validations.checking.service;

import java.util.List;
<<<<<<< HEAD
import com.validations.checking.entities.General2;
=======

import com.validations.checking.entities.General1;
import com.validations.checking.entities.General2;
import com.validations.checking.entities.IT;
>>>>>>> 5e513e9858f701168ee161ea0ad8d33d9c8e865b
import com.validations.checking.entities.ITR6Validation;
import com.validations.checking.entities.NatureOfBusiness;

public interface ValidationService {

	String test();
	
	public List<ITR6Validation> getData();
	public ITR6Validation addData(ITR6Validation data);

<<<<<<< HEAD
	public General2 addGeneral2Data(General2 data);
	public List<General2> getGeneral2Data();

	NatureOfBusiness addNOBData(NatureOfBusiness data);
    List<NatureOfBusiness> getNOBData();
=======
	public IT additData(IT data);
	public List<IT> getitData();

	public List<General1> getGeneral1Data();
	public General1 addGeneral1Data(General1 data);

	public General2 addGeneral2Data(General2 data);
	public List<General2> getGeneral2Data();

>>>>>>> 5e513e9858f701168ee161ea0ad8d33d9c8e865b

}
