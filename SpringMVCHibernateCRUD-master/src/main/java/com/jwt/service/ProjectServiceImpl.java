
package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.ProjectDAO;
import com.jwt.model.Project;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectDAO ProjectDAO;

	@Override
	@Transactional
	public void addProject(Project Project) {
		ProjectDAO.addProject(Project);
	}

	@Override
	@Transactional
	public List<Project> getAllProjects() {
		return ProjectDAO.getAllProjects();
	}
 

	@Override
	@Transactional
	public void deleteProject(Integer ProjectId) {
		ProjectDAO.deleteProject(ProjectId);
	}

	public Project getProject(int pid) {
		return ProjectDAO.getProject(pid);
	}

	public Project updateProject(Project Project) {
		// TODO Auto-generated method stub
		return ProjectDAO.updateProject(Project);
	}

	public void setProjectDAO(ProjectDAO ProjectDAO) {
		this.ProjectDAO = ProjectDAO;
		
		
	}

}
