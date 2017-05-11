package com.mcii.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcii.entity.Person;
import com.mcii.repository.impl.PersonRepositoryImpl;
import com.mcii.service.PersonService;
@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonRepositoryImpl personRepository;
	public Long savePerson() {
		  Person person = new Person();
	        person.setName("XRog");
	        person.setPhone("18381005946");
	        person.setAddress("chenDu");
	        person.setRemark("this is XRog");
	        return personRepository.save(person);
	}

}
