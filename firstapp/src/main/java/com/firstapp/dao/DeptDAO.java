package com.firstapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.firstapp.model.Dept;
import com.firstapp.model.Person;

public interface DeptDAO extends CrudRepository<Dept, Long>{
	public Dept findDeptByDno(int dno);
}
