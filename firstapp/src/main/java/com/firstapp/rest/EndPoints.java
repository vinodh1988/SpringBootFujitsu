package com.firstapp.rest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.firstapp.model.Dept;
import com.firstapp.model.Emp;
import com.firstapp.model.Person;
import com.firstapp.service.DeptService;
import com.firstapp.service.EmpService;
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
@Autowired
EmpService es;

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
	
	@RequestMapping(value="/addemp",method=RequestMethod.POST)
	public ResponseEntity<Emp> addPerson(@RequestBody Emp emp) {
		try {
			Dept d=ds.getDept(emp.getDept().getDno());
			emp.setDept(d);
			es.add(emp);
			return new ResponseEntity(emp,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}


	@RequestMapping(value="/depts")
	public List<Dept> getDepartments(){
		return ds.getDepts();
	}
	
	@RequestMapping(value="/emp/{dno}")
	public List<Emp> getEmployees(@PathVariable("dno") int dno){
		return es.getEmployees(dno);
	}
	
	 @RequestMapping(
			  value = "/images/{filename}",
			  produces = MediaType.IMAGE_JPEG_VALUE
			)
			public @ResponseBody byte[] getImageWithMediaType(@PathVariable String filename) throws IOException {
		     File f=new File("D:\\images\\"+filename);
			    FileInputStream in = new FileInputStream(f);
			    return IOUtils.toByteArray(in);
			}
	
	 @PostMapping("/uploads/pics")
	 public ResponseEntity<String> addFile(@RequestParam("file") MultipartFile file)
	 {
		 if(file.isEmpty()){
			 return new ResponseEntity<String>("File not attached",HttpStatus.BAD_REQUEST);
		 }
		
		 else{
			 String allowed[]={"jpg","jpeg","png","gif"};
			 Boolean valid=false;
			 String extension=FilenameUtils.getExtension(file.getOriginalFilename());
			 for(String x:allowed){
				 if(x.contentEquals(extension)){
					 valid=true;
					 break;
				 } 
			 }
			 if(valid){
				 try {
					 byte b[]=file.getBytes();
					 Path p=Paths.get("d:\\images\\"+file.getOriginalFilename());
					 Files.write(p,b);
				 } 
				 catch (IOException e) {
				// TODO Auto-generated catch block
					 	e.printStackTrace();
					 	return new ResponseEntity<String>("Error in Writing",HttpStatus.INTERNAL_SERVER_ERROR);
				 }
				 
				 return new ResponseEntity<String>("File uploaded successfully",HttpStatus.OK);
			 }
			 
			 return new ResponseEntity<String>("Only png,jpeg,jpg and gif allowed",HttpStatus.BAD_REQUEST); 
		 }}
		
}
