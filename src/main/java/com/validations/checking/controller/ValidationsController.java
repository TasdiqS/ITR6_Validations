package com.validations.checking.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
<<<<<<< HEAD
import com.validations.checking.entities.General2;
=======

import com.validations.checking.entities.General1;
import com.validations.checking.entities.General2;
import com.validations.checking.entities.IT;
>>>>>>> 5e513e9858f701168ee161ea0ad8d33d9c8e865b
import com.validations.checking.entities.ITR6Validation;
import com.validations.checking.entities.NatureOfBusiness;
import com.validations.checking.service.ValidationService;

@RestController
public class ValidationsController {
	
	@Autowired
	private ValidationService validationservice;
	
	
	@GetMapping("/testing")
	public String test()
	{
		return validationservice.test();
	}
	
	@PostMapping("/validations")
	public ITR6Validation addData(@RequestBody ITR6Validation data) {
		return validationservice.addData(data);
	}
<<<<<<< HEAD
	@GetMapping("/validations")
=======
	@GetMapping("/valid")
>>>>>>> 5e513e9858f701168ee161ea0ad8d33d9c8e865b
	public List<ITR6Validation> getData(){
		return validationservice.getData();
	}
	
<<<<<<< HEAD
=======
	@PostMapping("/it")
	public IT addData(@RequestBody IT data) {
		return validationservice.additData(data);
	}
	@GetMapping("/it")
	public List<IT> getitData(){
		return validationservice.getitData();
	}
	
	@PostMapping("/General1")
	public General1 addData(@RequestBody General1 data) {
		return validationservice.addGeneral1Data(data);
	}
	@GetMapping("/General1")
	public List<General1> getGData(){
		return validationservice.getGeneral1Data();
	}
	
>>>>>>> 5e513e9858f701168ee161ea0ad8d33d9c8e865b
	@PostMapping("/General2")
	public General2 addData(@RequestBody General2 data) {
		return validationservice.addGeneral2Data(data);
	}
	@GetMapping("/General2")
	public List<General2> getG2Data(){
		return validationservice.getGeneral2Data();
	}
	
<<<<<<< HEAD
	@PostMapping("/NatureOfBusiness")
	public NatureOfBusiness addNobData(@RequestBody NatureOfBusiness data) {
		return validationservice.addNOBData(data);
	}
	@GetMapping("/NatureOfBusiness")
	public List<NatureOfBusiness> getNOBData(){
		return validationservice.getNOBData();
	}
	
=======
>>>>>>> 5e513e9858f701168ee161ea0ad8d33d9c8e865b
}