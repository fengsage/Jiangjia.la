/**
 * mbaobao.com Inc.
 * Copyright (c) 2012 All Rights Reserved.
 */
package com.peigen.web.depreciate.depreciate.dal.dataobject;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

// auto generated imports
import java.util.Date;

/**
 * A data object class directly models database table <tt>depreciate_product</tt>.
 *
 * This file is generated by <tt>depreciate-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/depreciate_product.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>depreciate-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class DepreciateProductDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	/**
	 * This property corresponds to db column <tt>id</tt>.
	 */
	private String id;

	/**
	 * This property corresponds to db column <tt>track_category</tt>.
	 */
	private String trackCategory;

	/**
	 * This property corresponds to db column <tt>product_name</tt>.
	 */
	private String productName;

	/**
	 * This property corresponds to db column <tt>product_serial_no</tt>.
	 */
	private String productSerialNo;

	/**
	 * This property corresponds to db column <tt>status</tt>.
	 */
	private String status;

	/**
	 * This property corresponds to db column <tt>product_current_price</tt>.
	 */
	private long productCurrentPrice;

	/**
	 * This property corresponds to db column <tt>product_url</tt>.
	 */
	private String productUrl;

	/**
	 * This property corresponds to db column <tt>raw_add_time</tt>.
	 */
	private Date rawAddTime;

	/**
	 * This property corresponds to db column <tt>raw_update_time</tt>.
	 */
	private Date rawUpdateTime;

    //========== getters and setters ==========

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
	public String getId() {
		return id;
	}
	
	/**
	 * Setter method for property <tt>id</tt>.
	 * 
	 * @param id value to be assigned to property id
     */
	public void setId(String id) {
		this.id = id;
	}

    /**
     * Getter method for property <tt>trackCategory</tt>.
     *
     * @return property value of trackCategory
     */
	public String getTrackCategory() {
		return trackCategory;
	}
	
	/**
	 * Setter method for property <tt>trackCategory</tt>.
	 * 
	 * @param trackCategory value to be assigned to property trackCategory
     */
	public void setTrackCategory(String trackCategory) {
		this.trackCategory = trackCategory;
	}

    /**
     * Getter method for property <tt>productName</tt>.
     *
     * @return property value of productName
     */
	public String getProductName() {
		return productName;
	}
	
	/**
	 * Setter method for property <tt>productName</tt>.
	 * 
	 * @param productName value to be assigned to property productName
     */
	public void setProductName(String productName) {
		this.productName = productName;
	}

    /**
     * Getter method for property <tt>productSerialNo</tt>.
     *
     * @return property value of productSerialNo
     */
	public String getProductSerialNo() {
		return productSerialNo;
	}
	
	/**
	 * Setter method for property <tt>productSerialNo</tt>.
	 * 
	 * @param productSerialNo value to be assigned to property productSerialNo
     */
	public void setProductSerialNo(String productSerialNo) {
		this.productSerialNo = productSerialNo;
	}

    /**
     * Getter method for property <tt>status</tt>.
     *
     * @return property value of status
     */
	public String getStatus() {
		return status;
	}
	
	/**
	 * Setter method for property <tt>status</tt>.
	 * 
	 * @param status value to be assigned to property status
     */
	public void setStatus(String status) {
		this.status = status;
	}

    /**
     * Getter method for property <tt>productCurrentPrice</tt>.
     *
     * @return property value of productCurrentPrice
     */
	public long getProductCurrentPrice() {
		return productCurrentPrice;
	}
	
	/**
	 * Setter method for property <tt>productCurrentPrice</tt>.
	 * 
	 * @param productCurrentPrice value to be assigned to property productCurrentPrice
     */
	public void setProductCurrentPrice(long productCurrentPrice) {
		this.productCurrentPrice = productCurrentPrice;
	}

    /**
     * Getter method for property <tt>productUrl</tt>.
     *
     * @return property value of productUrl
     */
	public String getProductUrl() {
		return productUrl;
	}
	
	/**
	 * Setter method for property <tt>productUrl</tt>.
	 * 
	 * @param productUrl value to be assigned to property productUrl
     */
	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

    /**
     * Getter method for property <tt>rawAddTime</tt>.
     *
     * @return property value of rawAddTime
     */
	public Date getRawAddTime() {
		return rawAddTime;
	}
	
	/**
	 * Setter method for property <tt>rawAddTime</tt>.
	 * 
	 * @param rawAddTime value to be assigned to property rawAddTime
     */
	public void setRawAddTime(Date rawAddTime) {
		this.rawAddTime = rawAddTime;
	}

    /**
     * Getter method for property <tt>rawUpdateTime</tt>.
     *
     * @return property value of rawUpdateTime
     */
	public Date getRawUpdateTime() {
		return rawUpdateTime;
	}
	
	/**
	 * Setter method for property <tt>rawUpdateTime</tt>.
	 * 
	 * @param rawUpdateTime value to be assigned to property rawUpdateTime
     */
	public void setRawUpdateTime(Date rawUpdateTime) {
		this.rawUpdateTime = rawUpdateTime;
	}


	/**
     * @return
     *
     * @see java.lang.Object#toString()
     */
	@Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
