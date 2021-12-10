package com.validations.checking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
		//return "returning from Controller";
	}
	
	@PostMapping("/valid")
	public ITR6Validation addData(@RequestBody ITR6Validation data) {
		return validationservice.addData(data);
		
		
	}
	
	
	@GetMapping("/valid")
	public List<ITR6Validation> getData(){
		return validationservice.getData();
		
	}
		
}