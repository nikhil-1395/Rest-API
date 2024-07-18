package com.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.dao.CourseDao;
import com.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;

	// List<Course> list;

	public CourseServiceImpl() {

//		list = new ArrayList<>();
//		list.add(new Course(145,"Java core course", "This courses include the java language"));
//		list.add(new Course(143,"Spring boot course", "This courses include the Springboot"));
//		list.add(new Course(125,"Python course", "This courses include the python language"));

	}

	// Get all the courses
	@Override
	public List<Course> getCourses() {
//		return list;

		return courseDao.findAll();
	}

	// Get single course
	@Override
	public Course getCourse(long courseId) {

//		Course c = null;
//		for (Course course : list) {
//			if(course.getId() == courseId) {
//				c = course;
//				break;
//			}
//		}
//		
//		return c;

		return courseDao.findById(courseId).get();
	}

	// Add new course
	@Override
	public Course addCourse(Course course) {
//		list.add(course);
//		return course;

		courseDao.save(course);
		return course;
	}

	// Update new course
	@Override
	public Course updateCourse(Course course) {
//		
//		list.forEach(e -> {
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
//		return course;

		courseDao.save(course);
		return course;
	}

	// Delete course
	@Override
	public void deleteCourse(long parseLong) {
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());

		Course entity = courseDao.getById(parseLong);
		courseDao.delete(entity);
	}

}
