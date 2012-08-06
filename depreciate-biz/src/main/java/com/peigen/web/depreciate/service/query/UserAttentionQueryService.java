/**
 * www.peigen.info Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.peigen.web.depreciate.service.query;

import com.peigen.web.depreciate.service.result.BatchUserAttentionResult;

/**
 *                       
 * @Filename UserAttentionQueryService.java
 *
 * @Description 用户关注商品查询
 *
 * @Version 1.0
 *
 * @Author yinsha
 *
 * @Email yinsha@mbaobao.com
 *       
 * @History
 *<li>Author: peigen</li>
 *<li>Date: 2011-11-23</li>
 *<li>Version: 1.0</li>
 *<li>Content: create</li>
 *
 */
public interface UserAttentionQueryService {
	
	/**
	 * 根据用户ID查询关注商品
	 * 
	 * @param userId
	 * @return
	 */
	public BatchUserAttentionResult loadUserAttentions(String userId);
	
}