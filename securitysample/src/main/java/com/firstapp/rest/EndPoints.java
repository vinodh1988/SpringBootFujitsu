package com.firstapp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.firstapp.model.Dept;
import com.firstapp.model.Person;
import com.firstapp.service.DeptService;
import com.firstapp.service.FirstService;
import com.firstapp.service.PersonService;

@RestController
@RequestMapping("/rest-api")
public class EndPoints {
@Autowired	
FirstService fs;
@Autowired
PersonService ps;
@Autowired
DeptService ds;

	@RequestMapping("/greet")
	public String greet() {
		return "Spring boot is working";
	}
	
	@RequestMapping("/people")
	
	public String[] people() {
		return fs.getStrings();
	}
	
	@RequestMapping("/peopledata")
	public List<Person> getData()
	{
		return ps.getPeople();
	}
	
	@RequestMapping(value="/addperson",method=RequestMethod.POST)
	public ResponseEntity<Person> addPerson(@RequestBody Person person) {
		try {
			ps.add(person);
			return new ResponseEntity(person,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

	@RequestMapping(value="/depts")
	public List<Dept> getDepartments(){
		return ds.getDepts();
	}
}
