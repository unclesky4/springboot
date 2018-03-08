package org.unclesky4.springboot.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.unclesky4.springboot.StartSpringBootMain;
import org.unclesky4.springboot.entity.Teacher;
/**
 * 测试Mybatis的注解使用
 * @author unclesky4
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=StartSpringBootMain.class)
public class TeacherDaoTest {
	
	@Autowired
	private TeacherDao teacherDao;

	@Test
	public void testGetByName() {
		Teacher teacher = teacherDao.getByName("aaaa");
		System.out.println(teacher == null);
		System.out.println(teacher.getTid());
	}

}
