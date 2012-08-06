/**
 * mbaobao.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.peigen.web.depreciate.depreciate.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.peigen.web.depreciate.depreciate.dal.daointerface.DepreciateProductPicDAO;


// auto generated imports
import com.peigen.web.depreciate.depreciate.dal.dataobject.DepreciateProductPicDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.peigen.web.depreciate.depreciate.dal.daointerface.DepreciateProductPicDAO</tt>.
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
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisDepreciateProductPicDAO extends SqlMapClientDaoSupport implements DepreciateProductPicDAO {
	/**
	 *  Insert one <tt>DepreciateProductPicDO</tt> object to DB table <tt>depreciate_product_pic</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into depreciate_product_pic(id,product_id,pic_name,track_category,pic_source_url,raw_add_time) values (?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param depreciateProductPic
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(DepreciateProductPicDO depreciateProductPic) throws DataAccessException {
    	if (depreciateProductPic == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-DEPRECIATE-PRODUCT-PIC-INSERT", depreciateProductPic);

        return depreciateProductPic.getId();
    }

	/**
	 *  Query DB table <tt>depreciate_product_pic</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, product_id, pic_name, track_category, pic_source_url, raw_add_time, raw_update_time from depreciate_product_pic where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return DepreciateProductPicDO
	 *	@throws DataAccessException
	 */	 
    public DepreciateProductPicDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (DepreciateProductPicDO) getSqlMapClientTemplate().queryForObject("MS-DEPRECIATE-PRODUCT-PIC-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>depreciate_product_pic</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, product_id, pic_name, track_category, pic_source_url, raw_add_time, raw_update_time from depreciate_product_pic where ((product_id = ?) AND (pic_name = ?))</tt>
	 *
	 *	@param productId
	 *	@param picName
	 *	@return DepreciateProductPicDO
	 *	@throws DataAccessException
	 */	 
    public DepreciateProductPicDO findByProductIdAndName(String productId, String picName) throws DataAccessException {
        Map param = new HashMap();

        param.put("productId", productId);
        param.put("picName", picName);

        return (DepreciateProductPicDO) getSqlMapClientTemplate().queryForObject("MS-DEPRECIATE-PRODUCT-PIC-FIND-BY-PRODUCT-ID-AND-NAME", param);

    }

	/**
	 *  Query DB table <tt>depreciate_product_pic</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, product_id, pic_name, track_category, pic_source_url, raw_add_time, raw_update_time from depreciate_product_pic where (product_id = ?)</tt>
	 *
	 *	@param productId
	 *	@return List<DepreciateProductPicDO>
	 *	@throws DataAccessException
	 */	 
    public List<DepreciateProductPicDO> loadByProductId(String productId) throws DataAccessException {

        return getSqlMapClientTemplate().queryForList("MS-DEPRECIATE-PRODUCT-PIC-LOAD-BY-PRODUCT-ID", productId);

    }

	/**
	 *  Update DB table <tt>depreciate_product_pic</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update depreciate_product_pic set pic_name=?, track_category=?, pic_source_url=? where (id = ?)</tt>
	 *
	 *	@param depreciateProductPic
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int updateForId(DepreciateProductPicDO depreciateProductPic) throws DataAccessException {
    	if (depreciateProductPic == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-DEPRECIATE-PRODUCT-PIC-UPDATE-FOR-ID", depreciateProductPic);
    }

	/**
	 *  Delete records from DB table <tt>depreciate_product_pic</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from depreciate_product_pic where (product_id = ?)</tt>
	 *
	 *	@param productId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProductIdForTest(String productId) throws DataAccessException {

        return getSqlMapClientTemplate().delete("MS-DEPRECIATE-PRODUCT-PIC-DELETE-BY-PRODUCT-ID-FOR-TEST", productId);
    }

}