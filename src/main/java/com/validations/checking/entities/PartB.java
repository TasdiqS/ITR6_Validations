package com.validations.checking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="PartB")
@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
public class PartB
	{	
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@Id
	
	 private int c_Id; //not null
	
	@Pattern(regexp="[\\d]{1,14}") //Numeric value only non negative, no decimal upto 14 digit
	private String amount;
	
	@Pattern(regexp="[A-Z]{4}[0]{1}[A-Z0-9]{6}") //exactly 11 in length with first four alphabets , followed by zero and remaining 6 should be alphanumeric
	private String ifsccode;
	
	@Pattern(regexp ="[\\d\\D]{0,20}") //numeric value and  length varies from 9 to 18 digits
	 private String accountno;

	public PartB() 
	{
		// TODO Auto-generated constructor stub
	}

	public int getC_Id() {
		return c_Id;
	}

	public void setC_Id(int c_Id) {
		this.c_Id = c_Id;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getIfsccode() {
		return ifsccode;
	}

	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}

	public String getAccountno() {
		return accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	}

