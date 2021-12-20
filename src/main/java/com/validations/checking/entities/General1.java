package com.validations.checking.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "General1_val")
public class General1 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	 @NotNull
	 @Pattern(regexp = "[A-Z]{3}[P]{1}[A-Z]{1}[\\d]{4}[A-Z]{1}")//first five char 4numbers and last 1 char
	 private String personPanNum;
	 @NotNull
	 @Pattern(regexp="[A-Z]{3}[C]{1}[A-Z]{1}[\\d]{4}[A-Z]{1}")
	 @NotNull
    private String companyPanNum;
	 @Pattern(regexp = "^([L|U]{1})([\\d]{5})([A-Za-z]{2})([\\d]{4})([A-Za-z]{3})([\\d]{6})$")
	 @NotNull
	 private String cIN;
	 @NotNull
	 @Pattern(regexp = "[\\d]{8}")
	 private String dIN;
	 @NotNull
	 @Size(max = 50)
	private String street;
	 @NotNull
	@Size(max=125)
	private String name;
	 @NotNull
   @Pattern(regexp = "[0-9]{1,2}(/)[0-9]{1,2}(/)[0-9]{4}")
	private String date ;
	 @NotNull
	@Size(max = 50)
	private String city ;
	 @NotNull
    @Pattern(regexp="[1-9]{1}[\\d]{5}")//Should be 6 digits and not start with 0
    private String pinCode;
	 @NotNull
    @Pattern(regexp="[A-Za-z0-9_.]+[@][a-z]+[.][a-z]{2,3}")
    private String emailId;
	 @NotNull
    @Pattern(regexp = "[0-9]{6}")
	private String mem_no_auditor  ;
	 @NotNull
    @Pattern(regexp ="[\\w]{8}" )
	private String firm_reg_no ;
    @NotNull
	private String dpiit;
    @Min(2)
    @NotNull
	private int std_code ;
	
    @NotNull
	private String phno ;
    @NotNull
	 @Pattern(regexp="[\\d\\D]{0,12}")
	 private String sebiRegNumber;
     
    @NotNull
	 @Pattern(regexp = "[\\d]{10}")
	 private String mobile;

	 
	 //getters and setters
	 
	 
	public String getSebiRegNumber() {
		return sebiRegNumber;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setSebiRegNumber(String sebiRegNumber) {
		this.sebiRegNumber = sebiRegNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate( String date) {
		this.date = date;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMem_no_auditor() {
		return mem_no_auditor;
	}
	public void setMem_no_auditor(String mem_no_auditor) {
		this.mem_no_auditor = mem_no_auditor;
	}
	public String getFirm_reg_no() {
		return firm_reg_no;
	}
	public void setFirm_reg_no(String firm_reg_no) {
		this.firm_reg_no = firm_reg_no;
	}
	public String getDpiit() {
		return dpiit;
	}
	public void setDpiit(String dpiit) {
		this.dpiit = dpiit;
	}
	public  int getStd_code() {
		return std_code;
	}
	public void setStd_code( int std_code) {
		this.std_code = std_code;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public General1(int id, @Pattern(regexp = "[A-Z]{3}[P]{1}[A-Z]{1}[\\d]{4}[A-Z]{1}") String personPanNum,
			@Pattern(regexp = "[A-Z]{3}[C]{1}[A-Z]{1}[\\d]{4}[A-Z]{1}") String companyPanNum,
			@Pattern(regexp = "^([L|U]{1})([\\d]{5})([A-Za-z]{2})([\\d]{4})([A-Za-z]{3})([\\d]{6})$") String cIN,
			@Pattern(regexp = "[\\d]{8}") String dIN, @Size(max = 50) String street, String name, String date,
			@Size(max = 50) String city, @Pattern(regexp = "[1-9]{1}[\\d]{5}") String pinCode,
			@Pattern(regexp = "[A-Za-z0-9_.]+[@][a-z]+[.][a-z]{2,3}") String emailId,
			@Pattern(regexp = "[0-9]{6}") String mem_no_auditor, @Pattern(regexp = "[\\w]{8}") String firm_reg_no,
			String dpiit,  int std_code, @NotNull String phno,
			@Pattern(regexp = "[\\d\\D]{0,12}") String sebiRegNumber,
			@Pattern(regexp = "^\\\\d{10}$\"") String mobile) {
		super();
		this.id = id;
		this.personPanNum = personPanNum;
		this.companyPanNum = companyPanNum;
		this.cIN = cIN;
		this.dIN = dIN;
		this.street = street;
		this.name = name;
		this.date = date;
		this.city = city;
		this.pinCode = pinCode;
		this.emailId = emailId;
		this.mem_no_auditor = mem_no_auditor;
		this.firm_reg_no = firm_reg_no;
		this.dpiit = dpiit;
		this.std_code = std_code;
		this.phno = phno;
		this.sebiRegNumber = sebiRegNumber;
		this.mobile = mobile;
	}
	public General1() {
		super();
	}
}
