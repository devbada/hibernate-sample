package com.jeongahn.sample.entity.dao;

import java.util.List;

import com.jeongahn.sample.entity.Users;

public interface IUsersDAO {
	public void addUser(Users user);
	public List<Users> getUsers();
	public void removeUser(Users user);
}
