package com.firstapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstapp.dao.DeptDAO;
import com.firstapp.model.Dept;

@Service
public class DeptService {
  @Autowired
     DeptDAO dao;
  
  public List<Dept> getDepts(){
	  return (List<Dept>)dao.findAll();
  }
  
  public Dept getDept(int id){
	  return dao.findDeptByDno(id);
  }
}
