/**
 *This source is belong to ahmad.j2ee@gmail.com {replace by website or company name}
 */
package org.spring.helloworld.mvc.controller;

import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.helloworld.model.Attribute;
import org.spring.helloworld.model.BoxModel;
import org.spring.helloworld.service.BoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ahmad.
 */
@Controller
@RequestMapping({"/boxModel"})
public class HelloWorldController {
	
	final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

	@Autowired
	private BoxService boxService;
	
	@RequestMapping(method = RequestMethod.GET, params = "new")
	public String createBoxModel(Model model) {
		model.addAttribute(new BoxModel());
		return "boxModel/edit";
	}
	
	@RequestMapping
	public String addModelBox(@Valid BoxModel boxModel,	BindingResult bindingResult, Map model) throws Exception {
		if(boxModel.getProcessingType().equals("post")){
			logger.info("Processing request via POST ...");
		}else{
			logger.info("Processing request via GET ...");
		}
		if(bindingResult.hasErrors()) {
			logger.info("Returning with errors back on the form!");
			return "boxModel/edit";
		}
		
		if(boxModel.getModelId() != null && !boxModel.getModelId().equals("")){
			boxService.update(boxModel);
		}else{
			boxService.save(boxModel);
		}
		
		Map<String, Attribute> firstMatchingAttribute = boxService.findFirstMatch(boxModel);
		if(!firstMatchingAttribute.isEmpty()){
			model.put("firstMatch", firstMatchingAttribute);
		}
		return "boxModel/edit";
	}	
}
