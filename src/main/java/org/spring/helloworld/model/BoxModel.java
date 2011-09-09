/**
 *This source is belong to ahmad.j2ee@gmail.com {replace by website or company name}
 */
package org.spring.helloworld.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;


/**
 * @author ahmad.
 */
@Entity
@Table(name="box_model")
public class BoxModel {
	
	private static final String PROCESSING_TYPE_DEFAULT = "post";


	@Transient
	private String processingType = PROCESSING_TYPE_DEFAULT;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	
//	
//	/**
//     * billingPeriod.
//     */
//    @Column(name = "BP_DATE")
//    @Temporal(TemporalType.DATE)
//    private Date bpDate;
//    
    
		
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
//
//	public void setBpDate(Date bpDate) {
//		this.bpDate = bpDate;
//	}
//
//	public Date getBpDate() {
//		return bpDate;
//	}

}
