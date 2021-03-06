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
 * A data object class directly models database table <tt>depreciate_product_pic</tt>.
 *
 * This file is generated by <tt>depreciate-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/depreciate_product_pic.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>depreciate-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class DepreciateProductPicDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	/**
	 * This property corresponds to db column <tt>id</tt>.
	 */
	private long id;

	/**
	 * This property corresponds to db column <tt>product_id</tt>.
	 */
	private String productId;

	/**
	 * This property corresponds to db column <tt>pic_name</tt>.
	 */
	private String picName;

	/**
	 * This property corresponds to db column <tt>track_category</tt>.
	 */
	private String trackCategory;

	/**
	 * This property corresponds to db column <tt>pic_source_url</tt>.
	 */
	private String picSourceUrl;

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
	public long getId() {
		return id;
	}
	
	/**
	 * Setter method for property <tt>id</tt>.
	 * 
	 * @param id value to be assigned to property id
     */
	public void setId(long id) {
		this.id = id;
	}

    /**
     * Getter method for property <tt>productId</tt>.
     *
     * @return property value of productId
     */
	public String getProductId() {
		return productId;
	}
	
	/**
	 * Setter method for property <tt>productId</tt>.
	 * 
	 * @param productId value to be assigned to property productId
     */
	public void setProductId(String productId) {
		this.productId = productId;
	}

    /**
     * Getter method for property <tt>picName</tt>.
     *
     * @return property value of picName
     */
	public String getPicName() {
		return picName;
	}
	
	/**
	 * Setter method for property <tt>picName</tt>.
	 * 
	 * @param picName value to be assigned to property picName
     */
	public void setPicName(String picName) {
		this.picName = picName;
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
     * Getter method for property <tt>picSourceUrl</tt>.
     *
     * @return property value of picSourceUrl
     */
	public String getPicSourceUrl() {
		return picSourceUrl;
	}
	
	/**
	 * Setter method for property <tt>picSourceUrl</tt>.
	 * 
	 * @param picSourceUrl value to be assigned to property picSourceUrl
     */
	public void setPicSourceUrl(String picSourceUrl) {
		this.picSourceUrl = picSourceUrl;
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
