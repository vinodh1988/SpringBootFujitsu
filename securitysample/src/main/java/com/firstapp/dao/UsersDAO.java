package com.firstapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.firstapp.model.Users;



public interface UsersDAO extends CrudRepository<Users,Long>{
  Users findUsersByUsername(String username);
}
