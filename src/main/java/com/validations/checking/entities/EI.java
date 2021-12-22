package com.validations.checking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="EI")
@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
public class EI 
	{
	
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@Id
	
	 private int c_Id; //not null

	@Pattern(regexp="[\\d]{1,14}") //Numeric value only non negative, no decimal upto 14 digit
	private String amount;

	@Pattern(regexp="[a-zA-Z ]{1,125}") //Only characters  upto 125 limit
	private String districtname;
	
	@Pattern(regexp="[1-9]{1}[0-9]{5}|[1-9]{1}[0-9]{3}[0-9]{3}") //Should be 6 digit and start with zero
	private String pincode;
	
	@Pattern(regexp="[\\d]{1,14}") //Numeric value only non negative, no decimal upto 14 digit
	private String landmeasure;
	
	@Pattern(regexp="[\\d]{1,14}") //Numeric value only non negative, no decimal upto 14 digit
	private String chargabledtaa;
	
	public EI() 
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

	public String getDistrictname() {
		return districtname;
	}

	public void setDistrictname(String districtname) {
		this.districtname = districtname;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getLandmeasure() {
		return landmeasure;
	}

	public void setLandmeasure(String landmeasure) {
		this.landmeasure = landmeasure;
	}

	public String getChargabledtaa() {
		return chargabledtaa;
	}

	public void setChargabledtaa(String chargabledtaa) {
		this.chargabledtaa = chargabledtaa;
	}
	}