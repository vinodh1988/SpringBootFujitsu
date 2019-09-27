package com.firstapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.firstapp.model.Person;

public interface PersonDAO extends CrudRepository<Person, Long>{

}
