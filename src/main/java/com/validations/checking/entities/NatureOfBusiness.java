package com.validations.checking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "NatureOfBusiness")
public class NatureOfBusiness {
	//trade name
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Size(max=125)
	private String tradeNname;

	public NatureOfBusiness(int id, @Size(max = 125) String tradeNname) {
		super();
		this.id = id;
		this.tradeNname = tradeNname;
	}

	public NatureOfBusiness() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return tradeNname;
	}

	public void setName(String tradeNname) {
		this.tradeNname = tradeNname;
	}
	
	
}
