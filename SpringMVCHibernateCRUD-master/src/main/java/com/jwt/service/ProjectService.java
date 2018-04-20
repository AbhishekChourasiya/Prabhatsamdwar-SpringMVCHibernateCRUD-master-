package com.jwt.service;

import java.util.List;

import com.jwt.model.Project;

public interface ProjectService {
	
	public void addProject(Project Project);

	public List<Project> getAllProjects();

	public void deleteProject(Integer ProjectId);

	public Project getProject(int Projectid);

	public Project updateProject(Project Project);
	
}
