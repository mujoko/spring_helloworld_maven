/**
 *This source is belong to ahmad.j2ee@gmail.com {replace by website or company name}
 */
package org.spring.helloworld.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;


/**
 * @author ahmad.
 */
@Entity
@Table(name="box_model")
public class BoxModel {
	
	private static final String PROCESSING_TYPE_DEFAULT = "post";
	
	@Id
    @GeneratedValue(generator = "idGen")
    @GenericGenerator(strategy = "uuid.hex", name = "idGen")
	@Column(name = "model_id")
	private String modelId;

	@Size(min=1)
	@Column(name = "box_one")
	private String boxOne;

	@Size(min=1)
	@Column(name = "box_two")
	private String boxTwo;

	@Size(min=1)
	@Column(name = "box_three")
	private String boxThree;

	@Size(min=1)
	@Column(name = "box_four")
	private String boxFour;

	@Size(min=1)
	@Column(name = "box_five")
	private String boxFive;

	@Size(min=1)
	@Column(name = "box_area")
	private String boxArea;


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

	/** Entity Created On. */
    @Column(name = "CREATED_ON")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    
    @Column(name = "active", nullable = true, length = 1)
    private Boolean active;
    
    
    
    
    @Column(name = "type", nullable = true, length = 1)
    private String type;
    
    
    
    
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}



	
	@Transient
	private String processingType = PROCESSING_TYPE_DEFAULT;
	
	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
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

}
