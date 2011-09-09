package org.spring.helloworld.service;

import java.util.Map;

import org.spring.helloworld.model.Attribute;
import org.spring.helloworld.model.BoxModel;

public interface ApplicationService {

	public Attribute getAttributeByName(String name);
	
	public void saveAttribute(Attribute attribute);
	
	public void saveBoxModel(BoxModel boxModel);
	
	public void updateBoxModel(BoxModel boxModel);

	public Map<String,Attribute> findFirstMatch(BoxModel boxModel);
}
