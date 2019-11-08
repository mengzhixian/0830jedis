package com.atguigu.spring.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@RequestMapping(value="/test")
@Controller
public class TsetRequuestMappingHandler {
	@RequestMapping(value= {"/hello","/hello2"},method= {RequestMethod.GET})
	public String handle1() {
		System.out.println("´¦ÀíÁËÇëÇó");
		System.out.println("´¦ÀíÁËÇëÇó");
		return "scuss";
	}
}
