package org.unclesky4.springboot.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.unclesky4.springboot.StartSpringBootMain;
import org.unclesky4.springboot.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=StartSpringBootMain.class)
public class UserMapperTest {
	
	@Autowired
	private UserDao userDao;

	@Test
	public void testInsert() {
		System.out.println(userDao.insert("黄志标", 23));
	}

	@Test
	public void testGetById() {
		User user = userDao.getById(1000);
		System.out.println(user.getName());
	}

}
