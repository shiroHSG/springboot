package com.study.springboot.multi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * @Controller : bean으로 등록
 * 					어떠한 기능을 수행하는 경우에 붙여줌
 *					주입되어 사용되는 경우 @Component를 붙여줌
 */
@Controller
public class MyController {
	@RequestMapping("/")	//get, post의 method를 모두 받음
	public @ResponseBody String root() {		//@ResponseBody : html이 아닌 일반 문자를 반환할때
		return "Annotation 사용하기";
	}
}
