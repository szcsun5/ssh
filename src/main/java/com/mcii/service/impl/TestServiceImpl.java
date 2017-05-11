package com.mcii.service.impl;

import org.springframework.stereotype.Service;

import com.mcii.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	public String test() {
		
		return "test";
	}

}
