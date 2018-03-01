package com.jwt.controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.jwt.model.Employee;
import com.jwt.model.Project;
import com.jwt.model.Salary;
import com.jwt.service.EmployeeService;
import com.jwt.service.ProjectService;
import com.jwt.service.SalaryService;
@Controller(value="salaryController")
public class SalaryController {

	public SalaryController() {
			}


	@Autowired
	private SalaryService salaryService;

	@RequestMapping(value = "/salary")
	public ModelAndView listProject(ModelAndView model) throws IOException {
		List<Salary> listSalary = salaryService.getAllSalary();
		model.addObject("listSalary", listSalary);
		model.setViewName("salary");
		return model;
	}

	@RequestMapping(value = "/newSalary", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Salary salary = new Salary();
		model.addObject("salary", salary);
		model.setViewName("SalaryForm");
		return model;
	}

	@RequestMapping(value = "/saveSalary", method = RequestMethod.POST)
	public ModelAndView saveSalary(@ModelAttribute Salary salary) {
		if (salary.getId() == 0) { 
			
			salaryService.addSalary(salary);
		} else {
			salaryService.updateSalary(salary);
		}
		return new ModelAndView("redirect:/salary");
	}

	@RequestMapping(value = "/deleteSalary", method = RequestMethod.GET)
	public ModelAndView deleteProject(HttpServletRequest request) {
		int salaryId = Integer.parseInt(request.getParameter("id"));
		salaryService.deleteSalary(salaryId);
		return new ModelAndView("redirect:/salary");
	}

	@RequestMapping(value = "/editSalary", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int salaryId = Integer.parseInt(request.getParameter("id"));
		Salary salary = salaryService.getSalary(salaryId);
		ModelAndView model = new ModelAndView("SalaryForm");
		model.addObject("salary", salary);

		return model;
	}

}