package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Project;
import com.jwt.model.Salary;
@Repository(value="SalRepo")
public class SalaryDAO {

	public SalaryDAO() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private SessionFactory sessionFactory;

	public void addSalary(Salary salary) {
		sessionFactory.getCurrentSession().saveOrUpdate(salary);

	}

	@SuppressWarnings("unchecked")
	public List<Salary> getAllSalary() {

		return sessionFactory.getCurrentSession().createQuery("from SALARY_TBL")
				.list();
	}

	public void deleteSalary(Integer Id) {
		Salary salary = (Salary) sessionFactory.getCurrentSession().load(
				Salary.class, Id);
		if (null != salary) {
			this.sessionFactory.getCurrentSession().delete(salary);
		}

	}

	public Salary getSalary(int id) {
		return (Salary) sessionFactory.getCurrentSession().get(
				Salary.class, id);
	}

	
	public Salary updateSalary(Salary salary) {
		sessionFactory.getCurrentSession().update(salary);
		return salary;
	}
 

}

