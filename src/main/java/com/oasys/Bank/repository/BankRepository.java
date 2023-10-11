package com.oasys.Bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.oasys.Bank.entity.Bank;


public interface BankRepository extends JpaRepository<Bank,String>{
	
	
    @Query(value="select ifsc from Bank where branch=?",nativeQuery = true)
	public String getIfsc(String b);
	

	
}
