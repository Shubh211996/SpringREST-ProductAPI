package com.springrest.springrestapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrestapi.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {
	

}
