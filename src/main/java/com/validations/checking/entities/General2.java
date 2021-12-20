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
@Table(name = "General2") 
@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
public class General2 {
	//pincode, company pan, person pan, date, company name, address, city
	//adhaar number, din number, taxpayers reg number, ZIP Code
	 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@Id
	 private int c_Id; //not null
	
	@Pattern(regexp="[1-9]{1}[\\d]{5}")//Should be 6 digits and not start with 0
	 private String pinCode;
	
	@Pattern(regexp = "[A-Z]{3}[P]{1}[A-Z]{1}[\\d]{4}[A-Z]{1}")//5 char 4 number and last 1 char 4th should be 'P'
	 private String personPanNum;
	 
	 @Pattern(regexp="[A-Z]{3}[C]{1}[A-Z]{1}[\\d]{4}[A-Z]{1}")
	 private String companyPanNum;
	 
	 @JsonFormat(pattern = "dd/mm/yyyy")
	 private String date;
	 
	 @Pattern(regexp="[\\d\\D]+{0,125}")//min 0 max 125
	 private String cname;
	 
	 @Pattern(regexp="[\\d\\D]{0,200}")//min 0 max 200.
	 private String address;
	 
	 @Pattern(regexp="[\\d\\D]{0,50}")//chars, numbers, '&@#)(' and space.
	 private String city;

	 @Pattern(regexp = "[2-9]{1}[\\d]{11}")//must not start with 0 or 1 and should be 12 digits
	 private String adhaarId;
	 
	 @Pattern(regexp = "[\\d]{8}")
	 private String dIN;
	 
	 @Pattern(regexp="[\\d\\D]+{0,125}")//min 0 max 125
	 private String taxPayersRegNum;
	 
	 @Pattern(regexp="[1-9]{1}[\\d]{4}")//Should be 5 digits and not start with 0
	 private String zipCode;

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
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

	public String getAdhaarId() {
		return adhaarId;
	}

	public void setAdhaarId(String adhaarId) {
		this.adhaarId = adhaarId;
	}

	public String getdIN() {
		return dIN;
	}

	public void setdIN(String dIN) {
		this.dIN = dIN;
	}

	public String getTaxPayersRegNum() {
		return taxPayersRegNum;
	}

	public void setTaxPayersRegNum(String taxPayersRegNum) {
		this.taxPayersRegNum = taxPayersRegNum;
	}

	public String getZipCode() {
		return zipCode;
	}

	public int getC_Id() {
		return c_Id;
	}

	public void setC_Id(int c_Id) {
		this.c_Id = c_Id;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	
	public General2() {
		super();
	}

	public General2(int c_Id, @Pattern(regexp = "[1-9]{1}[\\d]{5}") String pinCode,
			@Pattern(regexp = "[A-Z]{3}[P]{1}[A-Z]{1}[\\d]{4}[A-Z]{1}") String personPanNum,
			@Pattern(regexp = "[A-Z]{3}[C]{1}[A-Z]{1}[\\d]{4}[A-Z]{1}") String companyPanNum, String date,
			@Pattern(regexp = "[\\d\\D]+{0,125}") String cname, @Pattern(regexp = "[\\d\\D]{0,200}") String address,
			@Pattern(regexp = "[\\d\\D]{0,50}") String city, @Pattern(regexp = "[2-9]{1}[\\d]{11}") String adhaarId,
			@Pattern(regexp = "[\\d]{8}") String dIN, @Pattern(regexp = "[\\d\\D]+{0,125}") String taxPayersRegNum,
			@Pattern(regexp = "[1-9]{1}[\\d]{4}") String zipCode) {
		super();
		this.c_Id = c_Id;
		this.pinCode = pinCode;
		this.personPanNum = personPanNum;
		this.companyPanNum = companyPanNum;
		this.date = date;
		this.cname = cname;
		this.address = address;
		this.city = city;
		this.adhaarId = adhaarId;
		this.dIN = dIN;
		this.taxPayersRegNum = taxPayersRegNum;
		this.zipCode = zipCode;
	}

	 
}
