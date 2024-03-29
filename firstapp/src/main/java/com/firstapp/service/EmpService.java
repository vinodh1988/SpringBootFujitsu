package com.firstapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstapp.dao.EmpDAO;
import com.firstapp.model.Emp;

@Service
public class EmpService {
	@Autowired
	  EmpDAO edao;
  public void add(Emp emp) {
	  edao.save(emp);
  }
  
  public List<Emp> getEmployees(int dno) {
	 return edao.findByDno(dno);
  }
}
