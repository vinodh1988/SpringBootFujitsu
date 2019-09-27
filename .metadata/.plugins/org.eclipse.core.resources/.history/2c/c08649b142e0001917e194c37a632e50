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
@Table(name = "course")
public class Course {
	@Id
	private Integer course_id;
	@Column
	private String name;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="course_faculty",joinColumns=@JoinColumn(name="course_id"),
	inverseJoinColumns=@JoinColumn(name="trainer_id"))
	private Set<Trainer> trainers;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(Integer course_id, String name) {
		super();
		this.course_id = course_id;
		this.name = name;
	}

	
	public Set<Trainer> getTrainers() {
		return trainers;
	}

	public void setTrainers(Set<Trainer> trainers) {
		this.trainers = trainers;
	}

	public Integer getCourse_id() {
		return course_id;
	}

	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
