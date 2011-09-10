/**
 *This source is belong to ahmad.j2ee@gmail.com {replace by website or company name}
 */
package org.spring.helloworld.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import org.spring.common.model.BaseEntity;

/**
 * @author ahmad.
 */
@Entity
@Table(name = "box_model")
public class BoxModel extends BaseEntity {

	private static final String PROCESSING_TYPE_DEFAULT = "post";


	@Transient
	private String processingType = PROCESSING_TYPE_DEFAULT;

	@Size(min = 1)
	@Column(name = "box_one")
	private String boxOne;

	@Size(min = 1)
	@Column(name = "box_two")
	private String boxTwo;

	@Size(min = 1)
	@Column(name = "box_three")
	private String boxThree;

	@Size(min = 1)
	@Column(name = "box_four")
	private String boxFour;

	@Size(min = 1)
	@Column(name = "box_five")
	private String boxFive;

	@Size(min = 1)
	@Column(name = "box_area")
	private String boxArea;

	@Column(name = "created_on")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdOn;

	@Column(name = "status",  length = 1)
	private Boolean status;

	@Column(name = "type",  length = 1)
	private String type;
	
	@Column(name = "origin")
	private String origin;

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getBoxOne() {
		return boxOne;
	}

	public void setBoxOne(String boxOne) {
		this.boxOne = boxOne;
	}

	public String getBoxTwo() {
		return boxTwo;
	}

	public void setBoxTwo(String boxTwo) {
		this.boxTwo = boxTwo;
	}

	public String getBoxThree() {
		return boxThree;
	}

	public void setBoxThree(String boxThree) {
		this.boxThree = boxThree;
	}

	public String getBoxFour() {
		return boxFour;
	}

	public void setBoxFour(String boxFour) {
		this.boxFour = boxFour;
	}

	public String getBoxFive() {
		return boxFive;
	}

	public void setBoxFive(String boxFive) {
		this.boxFive = boxFive;
	}

	public String getProcessingType() {
		return processingType;
	}

	public void setProcessingType(String processingType) {
		this.processingType = processingType;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getBoxArea() {
		return boxArea;
	}

	public void setBoxArea(String boxArea) {
		this.boxArea = boxArea;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
