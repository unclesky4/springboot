package org.unclesky4.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.unclesky4.springboot.entity.Teacher;

public interface TeacherDao_1 {

	Teacher getByName(@Param("name")String name);
}
