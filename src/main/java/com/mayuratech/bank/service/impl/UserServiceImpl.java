package com.mayuratech.bank.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayuratech.bank.bean.BankUser;
import com.mayuratech.bank.dao.UserInterface;
import com.mayuratech.bank.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserInterface userInterface;

	@Override
	public String addUser(BankUser bankUser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BankUser> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<BankUser> getUserById(int id) {

		return userInterface.getUserById(id);
	}

	@Override
	public String deleteUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BankUser update(BankUser bankUser) {
		// TODO Auto-generated method stub
		return null;
	}

}
