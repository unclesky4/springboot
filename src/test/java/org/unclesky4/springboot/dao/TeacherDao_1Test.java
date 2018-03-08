package org.unclesky4.springboot.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.unclesky4.springboot.StartSpringBootMain;
import org.unclesky4.springboot.entity.Teacher;

/**
 * 测试Mybatis的XML映射
 * @author unclesky4
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=StartSpringBootMain.class)
public class TeacherDao_1Test {

	@Autowired
	private TeacherDao_1 teacherDao_1;
	
	@Test
	public void testGetByName() {
		Teacher teacher = teacherDao_1.getByName("aaaa");
		System.out.println(teacher.getSex());
	}

}
