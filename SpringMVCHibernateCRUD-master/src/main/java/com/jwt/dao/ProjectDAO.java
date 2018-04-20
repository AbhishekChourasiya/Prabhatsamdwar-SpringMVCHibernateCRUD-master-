package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwt.model.Project;

@Repository
public class ProjectDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addProject(Project Project) {
		sessionFactory.getCurrentSession().saveOrUpdate(Project);

	}

	@SuppressWarnings("unchecked")
	public List<Project> getAllProjects() {

		return sessionFactory.getCurrentSession().createQuery("from PROJECT_TBL")
				.list();
	}

	
	public void deleteProject(Integer ProjectId) {
		Project Project = (Project) sessionFactory.getCurrentSession().load(
				Project.class, ProjectId);
		if (null != Project) {
			this.sessionFactory.getCurrentSession().delete(Project);
		}

	}

	public Project getProject(int pid) {
		return (Project) sessionFactory.getCurrentSession().get(
				Project.class, pid);
	}

 
	public Project updateProject(Project Project) {
		
		sessionFactory.getCurrentSession().update(Project);
		return Project;
	}

}