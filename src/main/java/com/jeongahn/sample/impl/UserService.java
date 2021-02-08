package com.jeongahn.sample.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeongahn.sample.entity.Users;
import com.jeongahn.sample.entity.dao.UsersDAOImpl;

@Service
public class UserService implements IUserService {
	@Autowired private UsersDAOImpl usersDAOImpl;

	@Transactional
	public void addUser(Users user) {
		usersDAOImpl.addUser(user);
	}

	@Transactional(readOnly=true)
	public List<Users> getListUsers() {
		return usersDAOImpl.getUsers();
	}

	@Transactional
	public void removeUser(Users user) {
		usersDAOImpl.removeUser(user);
	}

}
