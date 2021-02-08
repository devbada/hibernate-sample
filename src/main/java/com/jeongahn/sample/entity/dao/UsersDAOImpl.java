package com.jeongahn.sample.entity.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jeongahn.sample.entity.Users;

@Repository
public class UsersDAOImpl implements IUsersDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addUser(Users user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	@SuppressWarnings("unchecked")
	public List<Users> getUsers() {
		Session session = sessionFactory.openSession();
		return session.createQuery("from Users").list();
	}

	public void removeUser(Users userObj) {
		Users user = (Users)sessionFactory.getCurrentSession().load(Users.class, userObj.getId());
		if(null != user) {
			sessionFactory.getCurrentSession().delete(user);
		}
		
	}
	
}
