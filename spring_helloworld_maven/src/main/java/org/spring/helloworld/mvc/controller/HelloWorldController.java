package org.spring.helloworld.mvc.controller;

import java.util.Map;

import javax.inject.Inject;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.helloworld.model.Attribute;
import org.spring.helloworld.model.BoxModel;
import org.spring.helloworld.service.ApplicationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/boxModel"})
public class HelloWorldController {
	
	final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

	private ApplicationService applicationService;

	@Inject
	public HelloWorldController(ApplicationService applicationService) {
		this.applicationService = applicationService;
	}
	
	@RequestMapping(method = RequestMethod.GET, params = "new")
	public String createBoxModel(Model model) {
		model.addAttribute(new BoxModel());
		return "boxModel/edit";
	}
	
	@RequestMapping
	public String addModelBox(@Valid BoxModel boxModel,	BindingResult bindingResult, Map model) {
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
			applicationService.updateBoxModel(boxModel);
		}else{
			applicationService.saveBoxModel(boxModel);
		}
		
		Map<String, Attribute> firstMatchingAttribute = applicationService.findFirstMatch(boxModel);
		if(!firstMatchingAttribute.isEmpty()){
			model.put("firstMatch", firstMatchingAttribute);
		}
		return "boxModel/edit";
	}	
}
