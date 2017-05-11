package com.mcii.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mcii.service.impl.PersonServiceImpl;
import com.mcii.service.impl.TestServiceImpl;

@Controller
public class MainController {
	@Autowired
	private TestServiceImpl testService;
    @Autowired
    private PersonServiceImpl personServiceImpl;
	@RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(){
		return 	testService.test();
    }
	@RequestMapping(value = "savePerson", method = RequestMethod.GET)
	public void savePerson(){
		System.out.println("===1==");
		personServiceImpl.savePerson();
	}
	
}
