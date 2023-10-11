package com.oasys.Bank.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.Bank.service.BankService;

@RestController
@RequestMapping(value="/bank")
public class BankController {

	@Autowired
	BankService banSer;
	
	@GetMapping(value="/getIfsc/{b}")
	public String getIfsc(@PathVariable String b) {
		return banSer.getIfsc(b);
	}
}
