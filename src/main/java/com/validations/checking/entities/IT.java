package com.validations.checking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;


@Entity
@Table(name = "newValidIT") 
public class IT {

	@GeneratedValue(strategy=GenerationType.AUTO, generator="seq")
	@Id
	 private int IT_Id; //not null

	@Pattern(regexp="[0-9]{3}[A-Za-z0-9_]{4}")
	private String bsr_no;

	@Pattern(regexp="[0-9]{1}[0-9]{4}")
	private String serial_no_challan;

	@Pattern(regexp = "[1-9]{1}[0-9]{1,13}")
	private String amount;

	public String getBsr_no() {
		return bsr_no;
	}

	public void setBsr_no(String bsr_no) {
		this.bsr_no = bsr_no;
	}

	public String getSerial_no_challan() {
		return serial_no_challan;
	}

	public void setSerial_no_challan(String serial_no_challan) {
		this.serial_no_challan = serial_no_challan;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Integer getC_Id() {
		
		return IT_Id;
	}
	
	public IT(int iT_Id, @Pattern(regexp = "^[0-9]{3}[A-Za-z0-9_]{4}$") String bsr_no,
			@Pattern(regexp = "[0-9]{1}[0-9]{4}") String serial_no_challan,
			@Pattern(regexp = "[1-9]{1,14}") String amount) {
		super();
		IT_Id = iT_Id;
		this.bsr_no = bsr_no;
		this.serial_no_challan = serial_no_challan;
		this.amount = amount;
	}
	
	public IT() {
		
	}

	
	

}
