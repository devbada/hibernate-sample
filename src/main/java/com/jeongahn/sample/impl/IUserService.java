package com.jeongahn.sample.impl;

import java.util.List;

import com.jeongahn.sample.entity.Users;

public interface IUserService {
	public void addUser(Users user);
	public List<Users> getListUsers();
	public void removeUser(Users user);
}
