package com.oasys.Bank.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.Bank.repository.BankRepository;

@Repository
public class BankDao {
	@Autowired
	
	BankRepository banRepo;

	public String getIfsc(String b) {
		
		return banRepo.getIfsc(b);
	}

	
}
