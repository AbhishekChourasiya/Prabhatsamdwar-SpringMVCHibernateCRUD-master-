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
import com.jwt.service.EmployeeService;
import com.jwt.service.ProjectService;
@Controller(value="projectController")
public class ProjectController {

	public ProjectController() {
			}


	@Autowired
	private ProjectService projectService;

	@RequestMapping(value = "/projects")
	public ModelAndView listProject(ModelAndView model) throws IOException {
		List<Project> listProject = projectService.getAllProject();
		model.addObject("listProject", listProject);
		model.setViewName("projects");
		return model;
	}

	@RequestMapping(value = "/newProject", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Project project = new Project();
		model.addObject("project", project);
		model.setViewName("ProjectForm");
		return model;
	}

	@RequestMapping(value = "/saveProject", method = RequestMethod.POST)
	public ModelAndView saveProject(@ModelAttribute Project project) {
		if (project.getPid() == 0) { 
			
			projectService.addProject(project);
		} else {
			projectService.updateProject(project);
		}
		return new ModelAndView("redirect:/projects");
	}

	@RequestMapping(value = "/deleteProject", method = RequestMethod.GET)
	public ModelAndView deleteProject(HttpServletRequest request) {
		int projectId = Integer.parseInt(request.getParameter("pid"));
		projectService.deleteProject(projectId);
		return new ModelAndView("redirect:/projects");
	}

	@RequestMapping(value = "/editProject", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int projectId = Integer.parseInt(request.getParameter("pid"));
		Project project = projectService.getProject(projectId);
		ModelAndView model = new ModelAndView("ProjectForm");
		model.addObject("project", project);

		return model;
	}

}