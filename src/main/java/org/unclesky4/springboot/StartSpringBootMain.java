package org.unclesky4.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;


/**
 * 
 * 程序类约定放在启动类的子包中，因此有@SpringBootApplication注解
 * 
 * @SpringBootApplication:
 * 			启动SpringBoot程序，包含子包扫描，相当于: @EnableAutoConfiguration + @ComponentScan() + 其他配置
 * 
 * 案例：
 * @EnableAutoConfiguration
 * @ComponentScan("org.unclesky4.springboot")
 */
@SpringBootApplication
@ServletComponentScan   //开启springboot的servlet扫描功能
@MapperScan("org.unclesky4.springboot.dao")   //mybatis采用xml映射时使用
@EnableCaching   // 开启缓存
public class StartSpringBootMain {

	public static void main(String[] args) {
		SpringApplication.run(StartSpringBootMain.class, args);
	}

}
