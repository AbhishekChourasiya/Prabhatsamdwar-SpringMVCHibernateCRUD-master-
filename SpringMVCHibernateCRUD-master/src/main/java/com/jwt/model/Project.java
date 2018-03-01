package com.jwt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity(name="PROJECT_TBL")
@Table(name = "PROJECT_TBL")
public class Project {

	public Project() {
	
	}
	

	@Id
	private int pid;

	@Column
	private String empid;
	
	@Column
	private String name;
	
	@Column
	private String assignedOn;
	
	@Column
	private String deadline;

	public Project(int pid, String empid, String name, String assignedOn, String deadline) {
		super();
		this.pid = pid;
		this.empid = empid;
		this.name = name;
		this.assignedOn = assignedOn;
		this.deadline = deadline;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
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
