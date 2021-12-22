package com.validations.checking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="OS")
public class OS
	{
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id 
	private int c_Id; //not null

	
	@Pattern(regexp = "[1-9]{1,14}")
	private String grossincome;
	
	@Pattern(regexp="^[a-zA-Z]+$")
	private String nature1e;
	
	@Pattern(regexp = "[\\d]{1,14}")
	private String chargableincome;
		
	@Pattern(regexp = "[1-9]{1,100}")
	private String rateastt;
	
	@Pattern(regexp = "[1-9]{1,100}")
	private String rateasitact;
	
	@Pattern(regexp = "[1-9]{1,14}")
	private String sinumber;

	public OS() 
	{
		// TODO Auto-generated constructor stub
	}

	public int getC_Id() {
		return c_Id;
	}

	public void setC_Id(int c_Id) {
		this.c_Id = c_Id;
	}

	public String getGrossincome() {
		return grossincome;
	}

	public void setGrossincome(String grossincome) {
		this.grossincome = grossincome;
	}

	public String getNature1e() {
		return nature1e;
	}

	public void setNature1e(String nature1e) {
		this.nature1e = nature1e;
	}

	public String getChargableincome() {
		return chargableincome;
	}

	public void setChargableincome(String chargableincome) {
		this.chargableincome = chargableincome;
	}

	public String getRateastt() {
		return rateastt;
	}

	public void setRateastt(String rateastt) {
		this.rateastt = rateastt;
	}

	public String getRateasitact() {
		return rateasitact;
	}

	public void setRateasitact(String rateasitact) {
		this.rateasitact = rateasitact;
	}

	public String getSinumber() {
		return sinumber;
	}

	public void setSinumber(String sinumber) {
		this.sinumber = sinumber;
	}

	
	}
