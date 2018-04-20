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
import com.jwt.model.Project;
import com.jwt.service.ProjectService;

@Controller(value="ProjectController")
public class ProjectController {

	private static final Logger logger = Logger
			.getLogger(ProjectController.class);

	public ProjectController() {
		System.out.println("ProjectController()");
	}

	@Autowired
	private ProjectService ProjectService;

	 
	@RequestMapping(value = "/projects")
	public ModelAndView home(ModelAndView model) throws IOException {
		List<Project> listProject = ProjectService.getAllProjects();
		model.addObject("listProject", listProject);
		model.setViewName("projects");
		return model;
	}
	
	@RequestMapping(value = "/newProject", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Project Project = new Project();
		model.addObject("Project", Project);
		model.setViewName("ProjectForm");
		return model;
	}

	@RequestMapping(value = "/saveProject", method = RequestMethod.POST)
	public ModelAndView saveProject(@ModelAttribute Project Project) {
		//if (Project.getPid() == 0) { // if Project id is 0 then creating the
			// Project other updating the Project
		
			ProjectService.addProject(Project);
//		} else {
//			ProjectService.updateProject(Project);
//		}
		return new ModelAndView("redirect:/projects");
	}

	@RequestMapping(value = "/deleteProject", method = RequestMethod.GET)
	public ModelAndView deleteProject(HttpServletRequest request) {
		int ProjectId = Integer.parseInt(request.getParameter("id"));
		ProjectService.deleteProject(ProjectId);
		return new ModelAndView("redirect:/projects");
	}

	@RequestMapping(value = "/editProject", method = RequestMethod.GET)
	public ModelAndView editProject(HttpServletRequest request) {
		int ProjectId = Integer.parseInt(request.getParameter("id"));
		Project Project = ProjectService.getProject(ProjectId);
		ModelAndView model = new ModelAndView("ProjectForm");
		model.addObject("Project", Project);

		return model;
	}

	@RequestMapping(value = "/getProject", method = RequestMethod.GET)
	public ModelAndView getProject(HttpServletRequest request) {
		String val;
		int ProjectId;
		
		System.out.println("seacrh" +request.getParameter("search"));
		if(request.getParameter("search")!=null)
		{
			ProjectId=Integer.parseInt(request.getParameter("search"));
		}else {
		ProjectId = Integer.parseInt(request.getParameter("id"));
		}
		Project Project = ProjectService.getProject(ProjectId);
		ModelAndView model;
		if(Project!=null && Project.getName()!=null) {
			  model = new ModelAndView("ProjectDetail");
			model.addObject("Project", Project);
		}else {
			  model = new ModelAndView("error");
//			model.addObject("Project", Project);
			
		}

		return model;
	}

	 
}