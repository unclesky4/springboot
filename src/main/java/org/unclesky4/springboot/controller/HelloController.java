package org.unclesky4.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController 相当于 @Controller + @ResponseBody
 * 此种用法适用于往前台传输数据（SpringCloud的实现核心技术），不适用MVC模式
 */
@RestController
public class HelloController {

	@RequestMapping("/get")
    public String view() {
        return "你好";
    }
	
	@RequestMapping(value="/login/{username}", method=RequestMethod.GET)
	public String login(@PathVariable("username")String username) {
		return "login successfully, welcome ： "+username;
	}
}
