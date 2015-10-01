package io.pivotal.spring.gemfire.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pchandra on 10/1/15.
 */
@Controller
public class HelloWorldController {
	
	/**
	 * Default page to return
	 * 
	 * @return name of the freemarker template
	 */
	@RequestMapping("/")
	public String name() {
		return "index";
	}
}
