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
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ahmad.
 */
@Controller
@RequestMapping({"/boxModel"})
public class BoxModelController {
	
	final Logger logger = LoggerFactory.getLogger(BoxModelController.class);

	@Autowired
	private BoxService boxService;
	
	@RequestMapping(method = RequestMethod.GET, params = "new")
	public String createBoxModel(Model model) {
		model.addAttribute(new BoxModel());
		return "boxModel/edit";
	}
	
	

        @RequestMapping(method = RequestMethod.GET)
        public String list(Model model, @RequestParam(value="smsNo") String  smsNo , @RequestParam(value="smsContent", required=false) String  smsContent ){
            System.out.println("============");
            System.out.println("Sending SMS with :");
            System.out.println("SMSNo :"+smsNo);
            System.out.println("SMSContent :"+smsContent);
            
            model.addAttribute("SMSNo", smsNo);
            model.addAttribute("SMSContent", smsContent);
            
            model.addAttribute(new BoxModel());
            return "boxModel/edit";
        }
	
	@RequestMapping
	public String addModelBox(@Valid BoxModel boxModel, BindingResult bindingResult, Map model) throws Exception {
		if(boxModel.getProcessingType().equals("post")){
			System.out.println("Processing request via POST ...");
		}else{
			System.out.println("Processing request via GET ...");
		}
		if(bindingResult.hasErrors()) {
			System.out.println("Returning with errors back on the form!");
			return "boxModel/edit";
		}
		
		if(boxModel.getId() != null && !boxModel.getId().equals("")){
			boxService.update(boxModel);
		}else{
			boxService.save(boxModel);
		}
		
		Map<String, Attribute> firstMatchingAttribute = boxService.findFirstMatch(boxModel);
		if(!firstMatchingAttribute.isEmpty()){
//			model.put("firstMatch", firstMatchingAttribute);
		}
		return "boxModel/edit";
	}	
}

