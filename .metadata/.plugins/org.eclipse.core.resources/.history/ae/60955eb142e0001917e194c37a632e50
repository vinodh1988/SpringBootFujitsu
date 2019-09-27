package com.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="trainer")
public class Trainer {
@Id
   private Integer trainer_id;
@Column
   private String name;

@ManyToMany(mappedBy="trainers", cascade=CascadeType.ALL)
   Set<Course> course;

public Trainer() {
	super();
}


public Trainer(Integer trainer_id, String name) {
	super();
	this.trainer_id = trainer_id;
	this.name = name;
}




public Set<Course> getCourse() {
	return course;
}


public void setCourse(Set<Course> course) {
	this.course = course;
}


public Integer getTrainer_id() {
	return trainer_id;
}


public void setTrainer_id(Integer trainer_id) {
	this.trainer_id = trainer_id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


   
}
