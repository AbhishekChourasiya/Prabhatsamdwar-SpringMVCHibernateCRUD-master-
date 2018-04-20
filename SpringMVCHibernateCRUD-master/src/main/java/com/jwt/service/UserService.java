package com.jwt.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.UserDaoImpl;
import com.jwt.model.*;

@Service
@Transactional
public class UserService  {

	@Autowired
	private UserDaoImpl UserDao;

	@Transactional
	public void addUser(User User) {
		UserDao.addUser(User);
	}

	
	 

	 

	public User getUser(int uid) {
		return UserDao.getUser(uid);
	}

	 

	public void setUserDAO(UserDaoImpl UserDAO) {
		this.UserDao = UserDAO;
		
		
	}

}
