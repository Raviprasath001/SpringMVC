package com.mayuratech.bank.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mayuratech.bank.bean.BankUser;
import com.mayuratech.bank.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/demo")
public class BankController {

	@Autowired
	UserService userService;

	// method for getting details of all customers
	@RequestMapping(value = "/emplById/{id}", method = RequestMethod.GET)
	public Optional<BankUser> getEmployeeById(@PathVariable int id) {
		log.info("successfully getted the employees");
		return userService.getUserById(id);
	}
}
