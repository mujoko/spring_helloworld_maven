/**
 *This source is belong to ahmad.j2ee@gmail.com {replace by website or company name}
 */
package org.spring.common.dao;

import java.io.Serializable;

/**
 * @author ahmad.
 */
public interface GenericDao<T, ID extends Serializable> {
	

    /**
     * @param domain
     *            domain model
     */
    void delete(final T domain)throws Exception;

    /**
     * Get.
     *
     * @param id
     *            to search for
     * @return Type if found
     */
    T get(final ID id) throws Exception;



    /**
     * @param domain
     *            domain model
     */
    void save(final T domain) throws Exception;



    /**
     * @param domain
     *            domain model
     */
    void update(final T domain)throws Exception;


}
