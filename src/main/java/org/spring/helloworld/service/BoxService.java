/**
 *This source is belong to ahmad.j2ee@gmail.com {replace by website or company name}
 */
package org.spring.helloworld.service;

import java.io.Serializable;
import java.util.Map;

import org.spring.common.dao.GenericDao;
import org.spring.helloworld.model.Attribute;
import org.spring.helloworld.model.BoxModel;


/**
 * @author ahmad.
 */
public interface BoxService extends GenericDao <BoxModel, Serializable> {

	
	public Map<String,Attribute> findFirstMatch(BoxModel boxModel);

}
