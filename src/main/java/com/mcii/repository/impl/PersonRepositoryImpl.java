package com.mcii.repository.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mcii.entity.Person;
import com.mcii.repository.PersonRepository;
@Repository
public class PersonRepositoryImpl implements PersonRepository {
	@Autowired
    private SessionFactory sessionFactory;
	
	 private Session getCurrentSession() {
	        return this.sessionFactory.openSession();
	    }
	
	/* 这里get和load有两个重要区别: 
	   如果未能发现符合条件的记录，get方法返回null，而load方法会抛出一个ObjectNotFoundException。 */
	public Person load(Long id) {
		return (Person)getCurrentSession().load(Person.class,id);
	}

	public Person get(Long id) {
		  return (Person)getCurrentSession().get(Person.class,id);
	}

	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void persist(Person entity) {
		 getCurrentSession().persist(entity);

	}

	public Long save(Person entity) {
		return (Long)getCurrentSession().save(entity);
	}

	public void saveOrUpdate(Person entity) {
		getCurrentSession().saveOrUpdate(entity);

	}

	public void delete(Long id) {
		  Person person = load(id);
	      getCurrentSession().delete(person);
	}

	public void flush() {
		getCurrentSession().flush();	

	}

}
