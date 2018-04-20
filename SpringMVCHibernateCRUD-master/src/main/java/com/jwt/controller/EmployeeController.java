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
import com.jwt.service.EmployeeService;

@Controller(value="employeeController")
public class EmployeeController {

	private static final Logger logger = Logger
			.getLogger(EmployeeController.class);

	public EmployeeController() {
		System.out.println("EmployeeController()");
	}

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping(value = "/home")
	public ModelAndView home(ModelAndView model) throws IOException {
		List<Employee> listEmployee = employeeService.getAllEmployees();
		model.addObject("listEmployee", listEmployee);
		model.setViewName("home");
		return model;
	}
	
	@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Employee employee = new Employee();
		model.addObject("employee", employee);
		model.setViewName("EmployeeForm");
		return model;
	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
		if (employee.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			employeeService.addEmployee(employee);
		} else {
			employeeService.updateEmployee(employee);
		}
		return new ModelAndView("redirect:/home");
	}

	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(HttpServletRequest request) {
		int employeeId = Integer.parseInt(request.getParameter("id"));
		employeeService.deleteEmployee(employeeId);
		return new ModelAndView("redirect:/home");
	}

	@RequestMapping(value = "/editEmployee", method = RequestMethod.GET)
	public ModelAndView editEmployee(HttpServletRequest request) {
		int employeeId = Integer.parseInt(request.getParameter("id"));
		Employee employee = employeeService.getEmployee(employeeId);
		ModelAndView model = new ModelAndView("EmployeeForm");
		model.addObject("employee", employee);

		return model;
	}

	@RequestMapping(value = "/getEmployee", method = RequestMethod.GET)
	public ModelAndView getEmployee(HttpServletRequest request) {
		String val;
		int employeeId;
		
		System.out.println("seacrh" +request.getParameter("search"));
		if(request.getParameter("search")!=null)
		{
			employeeId=Integer.parseInt(request.getParameter("search"));
		}else {
		employeeId = Integer.parseInt(request.getParameter("id"));
		}
		Employee employee = employeeService.getEmployee(employeeId);
		ModelAndView model;
		if(employee!=null && employee.getFname()!=null) {
			  model = new ModelAndView("EmployeeDetail");
			model.addObject("employee", employee);
		}else {
			  model = new ModelAndView("error");
//			model.addObject("employee", employee);
			
		}

		return model;
	}

	@RequestMapping(value = "/promoteEmployee", method = RequestMethod.GET)
	public ModelAndView promoteEmployee(HttpServletRequest request) {
		int employeeId = Integer.parseInt(request.getParameter("id"));
		int employeeSalBonus = Integer.parseInt(request.getParameter("bonus"));
		System.out.println("sal: "+employeeSalBonus+" pro: "+request.getParameter("profile"));
		Employee employee = employeeService.getEmployee(employeeId);
	
		employee.setSalary(String.valueOf((Integer.parseInt(employee.getSalary())+ employeeSalBonus)));
		employee.setProfile(request.getParameter("profile"));
		System.out.println("new sal: "+employee.getSalary()+ "new sal: "+employee.getFname());
		
		employeeService.updateEmployee(employee);
		
		ModelAndView model = new ModelAndView("EmployeeDetail");
		model.addObject("employee", employee);

		return model;
	}
}