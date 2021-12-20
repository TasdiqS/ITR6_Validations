package com.validations.checking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.validations.checking.entities.General1;
import com.validations.checking.entities.General2;
import com.validations.checking.entities.IT;
import com.validations.checking.entities.ITR6Validation;
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
	
	@PostMapping("/valid")
	public ITR6Validation addData(@RequestBody ITR6Validation data) {
		return validationservice.addData(data);
	}
	@GetMapping("/valid")
	public List<ITR6Validation> getData(){
		return validationservice.getData();
	}
	
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
	
	@PostMapping("/General2")
	public General2 addData(@RequestBody General2 data) {
		return validationservice.addGeneral2Data(data);
	}
	@GetMapping("/General2")
	public List<General2> getG2Data(){
		return validationservice.getGeneral2Data();
	}
	
}