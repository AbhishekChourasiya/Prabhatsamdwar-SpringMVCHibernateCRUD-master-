package com.jwt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="SALARY_TBL")
@Table(name = "SALARY_TBL")
public class Salary {

	public Salary() {
	}
	
	
	public Salary(int id,int empid, String month, String year, String amount) {
		super();
		this.empid=empid;
		this.id = id;
		this.month = month;
		this.year = year;
		this.amount = amount;
	}


	@Id
	private int id;
	
	@Column
	private int empid;
	
	@Column
	private String month;
	
	@Column
	private String year;
	
	@Column
	private String amount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	

}
