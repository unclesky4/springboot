package org.unclesky4.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.unclesky4.springboot.dao.TeacherDao;
import org.unclesky4.springboot.entity.Teacher;

@Service
public class TeacherService {

	@Autowired
	private TeacherDao teacherDao;
	
	/**
	 * 通过姓名查询
	 * @param name
	 * @return
	 */
	@Cacheable(value="teacher",key="'teacher_'+#name")
	public Teacher getByName(String name) {
		//若找不到缓存将打印出提示语句
        System.err.println("没有走缓存！"+name);
		return teacherDao.getByName(name);
	}
}
