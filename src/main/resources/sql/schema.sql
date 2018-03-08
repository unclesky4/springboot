--- 测试Mybatis的sql数据
CREATE DATABASE springboot;

use springboot;

CREATE TABLE user(
	`id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '用户主键',
	`name` VARCHAR(10) NOT NULL COMMENT '用户姓名',
	`age` INT NOT NULL COMMENT '用户年龄',
	PRIMARY KEY(id)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='用户信息表';

INSERT INTO 
	user(name, age) 
VALUES
	('biao', 23),
	('uncle', 10);
	
CREATE TABLE teacher(
	`teacher_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '教师主键',
	`teacher_name` VARCHAR(10) NOT NULL COMMENT '教师姓名',
	`teacher_sex` INT NOT NULL COMMENT '教师性别',
	PRIMARY KEY(teacher_id)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='教师信息表';

INSERT INTO 
	teacher(teacher_name, teacher_sex) 
VALUES
	('aaaa', 1),
	('bbbb', 0);