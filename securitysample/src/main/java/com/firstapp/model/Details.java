package com.firstapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="details")
public class Details {
	@Id
   private Integer eno;
	@Column
   private String street;
	@Column
   private String city;
	@Column
   private String mobile;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	Emp emp;
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Details(Integer eno, String street, String city, String mobile) {
		super();
		this.eno = eno;
		this.street = street;
		this.city = city;
		this.mobile = mobile;
	}
	
	
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
   
	
   
}
