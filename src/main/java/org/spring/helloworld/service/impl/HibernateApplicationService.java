package org.spring.helloworld.service.impl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.spring.helloworld.model.Attribute;
import org.spring.helloworld.model.BoxModel;
import org.spring.helloworld.service.ApplicationService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class HibernateApplicationService implements ApplicationService {
	
	private SessionFactory sessionFactory;

	public HibernateApplicationService(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	public HibernateApplicationService(){}
	
	/**
	 * Use this method to return an attribute that matches a given key or null if no attribute matches the given key.
	 * @param key The key that should be found in the database
	 * @return The matching attribute if any or null otherwise.
	 */
	@SuppressWarnings("unchecked")
	public Attribute getAttributeByName(String name) {
		Criteria criteria = currentSession().createCriteria(Attribute.class);
		criteria.add(Restrictions.eq("name", name));
		List<Attribute> results = (List<Attribute>)criteria.list();
		if(results.size() > 0){
			return results.get(0);
		}
		return null;
	}

	public void saveAttribute(Attribute attribute) {
		currentSession().saveOrUpdate(attribute);
	}

	public void saveBoxModel(BoxModel boxModel) {
		currentSession().save(boxModel);
	}

	public void updateBoxModel(BoxModel boxModel) {
		currentSession().update(boxModel);
	}

	public Map<String,Attribute> findFirstMatch(BoxModel boxModel) {
		
		Map<String,Attribute> result = new HashMap<String, Attribute>();
		
		Map<String, String> fieldsMap = new LinkedHashMap<String, String>();
		fieldsMap.put("box1", boxModel.getBoxOne());
		fieldsMap.put("box2", boxModel.getBoxTwo());
		fieldsMap.put("box3", boxModel.getBoxThree());
		fieldsMap.put("box4", boxModel.getBoxFour());
		fieldsMap.put("box5", boxModel.getBoxFive());
	
		for(String key : fieldsMap.keySet()){
			Attribute attr = getAttributeByName(fieldsMap.get(key));
			if(attr != null){
				result.put(key, attr);
				break;
			}
		}
		
		return result;
	}
}
