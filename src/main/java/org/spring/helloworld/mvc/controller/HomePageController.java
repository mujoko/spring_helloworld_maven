/**
 *This source is belong to ahmad.j2ee@gmail.com {replace by website or company name}
 */
package org.spring.helloworld.mvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author ahmad.
 */
@Controller
public class HomePageController {
	
	@RequestMapping({"/","/home"})
	public String showHomePage(Map model) {
		return "redirect:/boxModel?new";
	}
}
