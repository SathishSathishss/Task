package com.oasys.Bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.Bank.dao.BankDao;

@Service
public class BankService {
	
	@Autowired
	BankDao banDao;

	public String getIfsc(String b) {
		
		return banDao.getIfsc(b);
	}

	

}
