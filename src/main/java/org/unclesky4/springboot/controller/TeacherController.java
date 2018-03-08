package org.unclesky4.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unclesky4.springboot.entity.Teacher;
import org.unclesky4.springboot.service.TeacherService;

@RestController
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;

	@RequestMapping("teacher/find/{name}")
	public Teacher getTeacher(@PathVariable("name")String name) {
		return teacherService.getByName(name);
	}
}
