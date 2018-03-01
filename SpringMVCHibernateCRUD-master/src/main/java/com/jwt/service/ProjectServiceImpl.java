package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.EmployeeDAO;
import com.jwt.dao.ProjectDAO;
import com.jwt.model.Employee;
import com.jwt.model.Project;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	ProjectDAO projectDAO=null;
	
	public ProjectServiceImpl() {
		
	}


	@Override
	@Transactional
	public void addProject(Project project) {
		projectDAO.addProject(project);
	}
	@Override
	@Transactional
	public List<Project> getAllProject(){
		return projectDAO.getAllProject();
		
	}


	@Override
	@Transactional
	public void deleteProject(Integer pId) {
		projectDAO.deleteProject(pId);
	}
	@Transactional
	public Project getProject(int projectid) {
		return projectDAO.getProject(projectid);
		
	}

	@Transactional
	public Project updateProject(Project project) {
		
		return projectDAO.updateProject(project); 
		
	}
	@Transactional
	public void setProjectDAO(ProjectDAO projectDAO) {
		this.projectDAO = projectDAO;
	}
	
}

