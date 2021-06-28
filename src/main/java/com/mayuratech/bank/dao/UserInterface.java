package com.mayuratech.bank.dao;

import java.util.List;
import java.util.Optional;

import com.mayuratech.bank.bean.BankUser;

public interface UserInterface {

	public String addUser(BankUser bankUser);

	public List<BankUser> getAllUser();

	public Optional<BankUser> getUserById(int id);

	public String deleteUser(int id);

	public BankUser updateUser(BankUser bankuser);
}
