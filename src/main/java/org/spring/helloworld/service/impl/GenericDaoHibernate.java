/**
 *This source is belong to ahmad.j2ee@gmail.com {replace by website or company name}
 */

package org.spring.helloworld.service.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ahmad.
 */
public class GenericDaoHibernate<T, ID extends Serializable> extends
		HibernateDaoSupport {
	
	

	/** domain class. */
	private Class domainClass;

	/** class constructor. */
	public GenericDaoHibernate() {
		this.setDomainClass((Class) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0]);
	}

	/**
	 * @param aClass
	 *            the domainClass to set
	 */
	public final void setDomainClass(final Class aClass) {
		this.domainClass = aClass;
	}

	/**
	 * Save method. DO NOT CHANGE TO FINAL MODIFIER.
	 * 
	 * @param domain
	 *            domain model.
	 */
	@Transactional
	public void save(final T domain) throws Exception {
		getHibernateTemplate().save(domain);
	}
	

    /**
     * Update method.
     * 
     * @param domain
     *            domain model.
     */
    @Transactional(readOnly = false)
    public final void update(final T domain) throws Exception {
    	getHibernateTemplate().merge(domain);
    }
    
    /**
     * Delete method.
     * 
     * @param domain
     *            domain model.
     */
    @Transactional(readOnly = false)
    public final void delete(final T domain) throws Exception {
    	getHibernateTemplate().delete(domain);

    }

    /**
     * @param id
     *            primary key
     * @return parameterQuery
     */
    @SuppressWarnings("unchecked")
    @Transactional(readOnly = true)
    public T get(final Serializable id) throws Exception {
    	return (T) getHibernateTemplate().get(domainClass, id);
    }

}