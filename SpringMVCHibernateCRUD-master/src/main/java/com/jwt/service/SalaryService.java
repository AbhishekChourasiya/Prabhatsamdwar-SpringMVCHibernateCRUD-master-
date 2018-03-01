package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.EmployeeDAO;
import com.jwt.dao.ProjectDAO;
import com.jwt.dao.SalaryDAO;
import com.jwt.model.Employee;
import com.jwt.model.Project;
import com.jwt.model.Salary;

@Service
@Transactional
public class SalaryService{

	@Autowired
	SalaryDAO salaryDAO=null;
	
	public SalaryService() {
		
	}


	@Transactional
	public void addSalary(Salary salary) {
		salaryDAO.addSalary(salary);
	}
	
	@Transactional
	public List<Salary> getAllSalary(){
		return salaryDAO.getAllSalary();
		
	}


	@Transactional
	public void deleteSalary(Integer pId) {
		salaryDAO.deleteSalary(pId);
	}
	@Transactional
	public Salary getSalary(int salaryid) {
		return salaryDAO.getSalary(salaryid);
		
	}

	@Transactional
	public Salary updateSalary(Salary salary) {
		
		return salaryDAO.updateSalary(salary); 
		
	}
	@Transactional
	public void setSalaryDAO(SalaryDAO salaryDAO) {
		this.salaryDAO = salaryDAO;
	}
	
}

