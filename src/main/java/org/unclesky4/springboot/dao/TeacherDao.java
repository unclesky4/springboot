package org.unclesky4.springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.unclesky4.springboot.entity.Teacher;

@Mapper
public interface TeacherDao {
	
	@Select("select * from teacher where teacher_name=#{name}") 
    @Results({
       @Result(id=true,column="teacher_id",property="tid"),    
       @Result(column="teacher_name",property="name"),
       @Result(column="teacher_sex",property="sex")
    })
	
	Teacher getByName(@Param("name")String name);
}
