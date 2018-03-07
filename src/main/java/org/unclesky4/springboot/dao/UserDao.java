package org.unclesky4.springboot.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.unclesky4.springboot.entity.User;

/**
 * User类数据库操作 --- 使用Mybatis注解
 * @author unclesky4
 *
 */
@Mapper
public interface UserDao {
	
	@Insert("INSERT INTO user(name, age) VALUES(#{name}, #{age})")
	int insert(@Param("name")String name, @Param("age")int age);

	@Select("SELECT * FROM user WHERE id = #{id}")
	User getById(@Param("id") int id);
}
