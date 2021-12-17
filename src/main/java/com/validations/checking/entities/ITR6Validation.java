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
	 
	 @Pattern(regexp="[\\d\\D]{0,125}")//chars, numbers, spaces and '&' min 1 digit max 30
	 private String name;
	 
	 @Pattern(regexp="[\\d\\D]{0,200}")//chars, numbers, '&@#)(' and space.
	 private String address;
	 
	 @Pattern(regexp="[\\d\\D]{0,50}")//chars, numbers, '&@#)(' and space.
	 private String city;

	 @Pattern(regexp="[A-Za-z]+")
	 private String country;
	 
	 @Pattern(regexp="[+]{1}[\\d]{1,4}")
	 private String countryCode;
	 
	 @Pattern(regexp="[1-9]{1}[\\d]{4}")//Should be 6 digits and not start with 0
	 private String zipCode;
	 
	 @Pattern(regexp="[1-9]{1}[\\d]{5}")//Should be 6 digits and not start with 0
	 private String pinCode;
	 
	 @Pattern(regexp = "[2-9]{1}[\\d]{11}")//must not start with 0 or 1 and should be 12 digits
	 private String adhaarId;
	 
	 @Pattern(regexp = "[A-Z]{3}[P]{1}[A-Z]{1}[\\d]{4}[A-Z]{1}")//first five char 4numbers and last 1 char
	 private String personPanNum;
	 
	 @Pattern(regexp="[A-Z]{3}[C]{1}[A-Z]{1}[\\d]{4}[A-Z]{1}")
	 private String companyPanNum;
	 
	 @Pattern(regexp = "[7-9]{1}[\\d]{9}")//start with 7,8 or 9 and 10 digits long
	 private String phNo;
	 
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
	 
	 @Pattern(regexp="[\\d]{0,14}") //no decimal only upto 14 digits
	 private String amount;

//	 @Pattern(regexp="[0-9]{1,3}") //0 to 100
//	 private String rate;
	 
	 @Pattern(regexp="[\\d\\D]{7}")//exactly 7
	 private String bsrCode;
	 
	 @Pattern(regexp="[\\d\\D]{5}")//exactly 5 digits
	 private String serialNumberOfChallan;
	 
	 @Pattern(regexp="[\\d\\D]{0,20}")//0  to 20 digits
	 private String accountNumber;
	 
	 @Pattern(regexp="[\\d\\D]{0,12}")
	 private String sebiRegNumber;

	 @Pattern(regexp="[\\d\\D]{0,16}")
	 private String articleOfDtaa;


public ITR6Validation() {
		super();
		this.c_Id = c_Id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.country = country;
		this.countryCode = countryCode;
		this.zipCode = zipCode;
		this.pinCode = pinCode;
		this.adhaarId = adhaarId;
		this.personPanNum = personPanNum;
		this.companyPanNum = companyPanNum;
		this.phNo = phNo;
		this.emailId = emailId;
		this.cIN = cIN;
		this.dIN = dIN;
		this.date = date;
		this.amount = amount;
//		this.rate = rate;
		this.bsrCode = bsrCode;
		this.serialNumberOfChallan = serialNumberOfChallan;
		this.accountNumber = accountNumber;
		this.sebiRegNumber = sebiRegNumber;
		this.articleOfDtaa = articleOfDtaa;
	}


public int getC_Id() {
	return c_Id;
}


public void setC_Id(int c_Id) {
	this.c_Id = c_Id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public String getCountry() {
	return country;
}


public void setCountry(String country) {
	this.country = country;
}


public String getCountryCode() {
	return countryCode;
}


public void setCountryCode(String countryCode) {
	this.countryCode = countryCode;
}


public String getZipCode() {
	return zipCode;
}


public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}


public String getPinCode() {
	return pinCode;
}


public void setPinCode(String pinCode) {
	this.pinCode = pinCode;
}


public String getAdhaarId() {
	return adhaarId;
}


public void setAdhaarId(String adhaarId) {
	this.adhaarId = adhaarId;
}


public String getPersonPanNum() {
	return personPanNum;
}


public void setPersonPanNum(String personPanNum) {
	this.personPanNum = personPanNum;
}


public String getCompanyPanNum() {
	return companyPanNum;
}


public void setCompanyPanNum(String companyPanNum) {
	this.companyPanNum = companyPanNum;
}


public String getPhNo() {
	return phNo;
}


public void setPhNo(String phNo) {
	this.phNo = phNo;
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


public String getdIN() {
	return dIN;
}


public void setdIN(String dIN) {
	this.dIN = dIN;
}


public String getDate() {
	return date;
}


public void setDate(String date) {
	this.date = date;
}


public String getAmount() {
	return amount;
}


public void setAmount(String amount) {
	this.amount = amount;
}


//public String getRate() {
//	return rate;
//}
//
//
//public void setRate(String rate) {
//	this.rate = rate;
//}


public String getBsrCode() {
	return bsrCode;
}


public void setBsrCode(String bsrCode) {
	this.bsrCode = bsrCode;
}


public String getSerialNumberOfChallan() {
	return serialNumberOfChallan;
}


public void setSerialNumberOfChallan(String serialNumberOfChallan) {
	this.serialNumberOfChallan = serialNumberOfChallan;
}


public String getAccountNumber() {
	return accountNumber;
}


public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}


public String getSebiRegNumber() {
	return sebiRegNumber;
}


public void setSebiRegNumber(String sebiRegNumber) {
	this.sebiRegNumber = sebiRegNumber;
}


public String getArticleOfDtaa() {
	return articleOfDtaa;
}


public void setArticleOfDtaa(String articleOfDtaa) {
	this.articleOfDtaa = articleOfDtaa;
}



}