package com.mayuratech.bank.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mayuratech.bank.bean.BankUser;
import com.mayuratech.bank.dao.UserInterface;
import com.mayuratech.bank.datasource.UserDataSource;

@Repository
public class UserDaoImpl implements UserInterface {

	@Autowired
	private UserDataSource datasource;

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
		BankUser bk = new BankUser();
		try {
			Connection connection = datasource.getSQLConnection();
			
			String query = "Select * from bankcust where id=" + id;
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery(query);

			while (resultSet.next()) {
				System.out.format("|%-10d|", resultSet.getInt("id"));
				System.out.format("%-20s|", resultSet.getString("name"));
				System.out.format("%-20s|", resultSet.getString("accountnumber"));
				System.out.format("%-30s|", resultSet.getString("password"));
				System.out.format("%-15d|", resultSet.getLong("balance"));

				bk.setId(resultSet.getInt("id"));
				bk.setName(resultSet.getString("name"));
				bk.setAccountNumber(resultSet.getString("accountnumber"));
				bk.setPassword(resultSet.getString("password"));
				bk.setBalance(resultSet.getLong("balance"));
			}
			resultSet.close();
			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return Optional.of(bk);
	}

	@Override
	public String deleteUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BankUser updateUser(BankUser bankuser) {
		// TODO Auto-generated method stub
		return null;
	}

}
