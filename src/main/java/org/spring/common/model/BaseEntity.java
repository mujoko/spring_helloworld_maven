/**
 * This source belong to ahmad.
 */
package org.spring.common.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;


/**
 *All the Model should implement this class to standarize PK for each Model.
 * @author mujoko
 *
 */
@MappedSuperclass
public class BaseEntity {


	/**
	 * Id which generated from hibernate hex.
	 */
	@Id
	@GeneratedValue(generator = "idGen")
	@GenericGenerator(strategy = "uuid.hex", name = "idGen")
	@Column(length = 32)
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


}
