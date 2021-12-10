package com.validations.checking.service;

import java.util.List;
import com.validations.checking.entities.ITR6Validation;

public interface ValidationService {

	String test();
	
	public List<ITR6Validation> getData();

	public ITR6Validation addData(ITR6Validation data);

}
