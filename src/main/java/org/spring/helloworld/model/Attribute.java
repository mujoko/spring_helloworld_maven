/**
 *This source is belong to ahmad.j2ee@gmail.com {replace by website or company name}
 */
package org.spring.helloworld.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ahmad.
 */
@Entity
@Table(name="attribute")
public class Attribute {
	
	
	@Id
	@Column(name = "name")
	private String name;

	@Column(name = "value")
	private String value;

	public Attribute(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}
	
	public Attribute() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
