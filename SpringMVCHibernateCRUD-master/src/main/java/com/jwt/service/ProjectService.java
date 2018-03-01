package com.jwt.service;

import java.util.List;

import com.jwt.model.Employee;
import com.jwt.model.Project;

public interface ProjectService {

	
	public void addProject(Project project);

	public List<Project> getAllProject();

	public void deleteProject(Integer pId);

	public Project getProject(int projectid);

	public Project updateProject(Project project);
	
}
