package com.firstapp.service;

import java.util.List;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstapp.dao.PersonDAO;
import com.firstapp.model.Person;

@Service
public class PersonService implements InitializingBean{

	@Autowired
	   PersonDAO pdao;
	
	
	
	
	public List<Person> getPeople(){
		return (List<Person>) pdao.findAll();
	}

    public void add(Person p) {
    	pdao.save(p);
    }


	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(pdao.getClass());
	}
}
