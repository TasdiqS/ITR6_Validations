package com.validations.checking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "newValid1") 
@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
public class ITR6Validation {	 
		
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@Id
	 private int c_Id; //not null
	 
	 @Pattern(regexp="[A-Z0-9& ]{1,30}")//chars, numbers, spaces and '&' min 1 digit max 30
	 private String c_name;
	 
	 @Pattern(regexp="[A-Z0-9&@#() ]{1,70}")//chars, numbers, '&@#)(' and space. min 1 max 70 digits
	 private String address;
	 
	 @Pattern(regexp = "[2-9]{1}[\\d]{11}")//must not start with 0 or 1 and should be 12 digits
	 private String AdhaarId;
	 
	 @Pattern(regexp = "[A-Z]{5}[\\d]{4}[A-Z]{1}")//first five char 4numbers and last 1 char
	 private String PanId;
	 
	 @Pattern(regexp = "[7-9]{1}[\\d]{9}")//start with 7,8 or 9 and 10 digits long
	 private String PhNo;
	 
	 @Pattern(regexp="[1-9]{1}[\\d]{5}")//Should be 6 digits and not start with 0
	 private String zipCode;
	 
	 @Pattern(regexp="[A-Za-z0-9_.]+[@][a-z]+[.][a-z]{2,3}")//The email address should contain some characters
	//before '@' then domain name in lower case then . com co or in
	 private String emailId;
	 
	 //L or U then 5 numbers 2 chars 4 numbers 3 chars 6 numbers
	 @Pattern(regexp = "^([L|U]{1})([\\d]{5})([A-Za-z]{2})([\\d]{4})([A-Za-z]{3})([\\d]{6})$")
	 private String cIN;
	 
	 @Pattern(regexp = "[\\d]{8}")
	 private String dIN;
	 	 
	 @JsonFormat(pattern = "dd/mm/yyyy")
	 private String date;
	 
	 @Pattern(regexp="[A-Za-z]+")
	 private String country;
	 
	 @Pattern(regexp="[\\d]{0,14}") //no decimal only upto 14 digits
	 private String amount;
	 
	 @Pattern(regexp="[+]{1}[\\d]{1,4}")
	 private String countryCode;
	 

	//default constructor
	public ITR6Validation() {
		super();
	}

	//constructor using fields
	

public ITR6Validation(int c_Id,
		 @Pattern(regexp = "[A-Z0-9& ]{1,30}")  String c_name,
		 @Pattern(regexp = "[A-Z0-9&@#() ]{1,70}")  String address,
		 @Pattern(regexp = "[2-9]{1}[\\d]{11}") String adhaarId,
		 @Pattern(regexp = "[A-Z]{5}[\\d]{4}[A-Z]{1}")  String panId,
		 @Pattern(regexp = "[7-9]{1}[\\d]{9}") String phNo,
		 @Pattern(regexp = "[1-9]{1}[\\d]{5}")  String zipCode,
		 @Pattern(regexp = "[A-Za-z0-9_.]+[@][a-z]+[.][a-z]{2,3}") String emailId,
		
		 @Pattern(regexp = "^([L|U]{1})([\\d]{5})([A-Za-z]{2})([\\d]{4})([A-Za-z]{3})([\\d]{6})$") String cIN,
		 @Pattern(regexp = "[\\d]{8}") String dIN,
		
		 @Pattern(regexp = "(0[1-9]|[12][0-9]|3[01])[/.-](0[1-9]|1[012])[/.-]\\d{4}") String date,
		 @Pattern(regexp = "[A-Za-z]+") String country,
		 @Pattern(regexp = "[\\d]{0,14}") String amount,
		 @Pattern(regexp = "[+]{1}[\\d]{1,4}") String countryCode) {
		super();
		this.c_Id = c_Id;
		this.c_name = c_name;
		this.address = address;
		AdhaarId = adhaarId;
		PanId = panId;
		PhNo = phNo;
		this.zipCode = zipCode;
		this.emailId = emailId;
		this.cIN = cIN;
		this.dIN = dIN;
		this.date = date;
		this.country = country;
		this.amount = amount;
		this.countryCode = countryCode;
	}


public int getC_Id() {
	return c_Id;
}

public void setC_Id(int c_Id) {
	this.c_Id = c_Id;
}

public String getC_name() {
	return c_name;
}

public void setC_name(String c_name) {
	this.c_name = c_name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getAdhaarId() {
	return AdhaarId;
}

public void setAdhaarId(String adhaarId) {
	AdhaarId = adhaarId;
}

public String getPanId() {
	return PanId;
}

public void setPanId(String panId) {
	PanId = panId;
}

public String getPhNo() {
	return PhNo;
}

public void setPhNo(String phNo) {
	PhNo = phNo;
}

public String getZipCode() {
	return zipCode;
}

public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getcIN() {
	return cIN;
}

public void setcIN(String cIN) {
	this.cIN = cIN;
}

public String getDate() {
	return date;
}

public void setDate(String string) {
	this.date = string;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getAmount() {
	return amount;
}

public void setAmount(String amount) {
	this.amount = amount;
}

public String getCountryCode() {
	return countryCode;
}

public void setCountryCode(String countryCode) {
	this.countryCode = countryCode;
}

public String getdIN() {
	return dIN;
}

public void setdIN(String dIN) {
	this.dIN = dIN;
}


}