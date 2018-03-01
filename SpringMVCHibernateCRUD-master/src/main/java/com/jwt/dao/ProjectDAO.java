package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jwt.model.Project;
@Repository(value="ProjectRepo")
public class ProjectDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void addProject(Project project) {
		sessionFactory.getCurrentSession().saveOrUpdate(project);

	}

	@SuppressWarnings("unchecked")
	public List<Project> getAllProject() {

		return sessionFactory.getCurrentSession().createQuery("from PROJECT_TBL")
				.list();
	}

	public void deleteProject(Integer pId) {
		Project project = (Project) sessionFactory.getCurrentSession().load(
				Project.class, pId);
		if (null != project) {
			this.sessionFactory.getCurrentSession().delete(project);
		}

	}

	public Project getProject(int pid) {
		return (Project) sessionFactory.getCurrentSession().get(
				Project.class, pid);
	}

	
	public Project updateProject(Project project) {
		sessionFactory.getCurrentSession().update(project);
		return project;
	}


}

