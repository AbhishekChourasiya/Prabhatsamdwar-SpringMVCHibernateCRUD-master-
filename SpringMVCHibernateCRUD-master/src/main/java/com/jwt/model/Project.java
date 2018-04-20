package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity(name="PROJECT_TBL")
@Table(name = "PROJECT_TBL")
public class Project  {

	 
	public Project() {
		// TODO Auto-generated method stub

	}
	@Id
	private int pid;
	
	@Column
	private long budget;

	public long getBudget() {
		return budget;
	}

	public void setBudget(long budget) {
		this.budget = budget;
	}
	@Column
	private String MGRid;
	
	@Column
	private String name;
	
	@Column
	private String assignedOn;
	
	@Column
	private String deadline;

	public Project(int pid, String MGRid, String name, String assignedOn, String deadline, long budget) {
		super();
		this.pid = pid;
		this.MGRid = MGRid;
		this.name = name;
		this.assignedOn = assignedOn;
		this.deadline = deadline;
		this.budget= budget;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getMGRid() {
		return MGRid;
	}

	public void setMGRid(String MGRid) {
		this.MGRid = MGRid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAssignedOn() {
		return assignedOn;
	}

	public void setAssignedOn(String assignedOn) {
		this.assignedOn = assignedOn;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	
	
	
	

}
