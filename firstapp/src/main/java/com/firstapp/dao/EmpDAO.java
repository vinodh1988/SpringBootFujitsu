package com.firstapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.firstapp.model.Emp;

public interface EmpDAO extends CrudRepository<Emp,Long>{
	@Query("from Emp where dno=:dno")
	public List<Emp> findByDno(@Param("dno")int dno);
}
