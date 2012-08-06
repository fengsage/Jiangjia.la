/**
 * www.jiangjia.la Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.peigen.web.depreciate.test.service.api;

import com.peigen.web.depreciate.service.order.ProductOrder;
import com.peigen.web.depreciate.service.result.ProductResult;
import com.peigen.web.depreciate.test.annotation.DepreciateTestAnnotated;
import com.peigen.web.depreciate.test.base.DepreciateServiceTestBase;

/**
 *                       
 * @Filename ProductServiceTest.java
 *
 * @Description 
 *
 * @Version 1.0
 *
 * @Author peigen
 *
 * @Email peigen123@gmail.com
 *       
 * @History
 *<li>Author: peigen</li>
 *<li>Date: 2011-11-19</li>
 *<li>Version: 1.0</li>
 *<li>Content: create</li>
 *
 */
public class ProductServiceTest extends DepreciateServiceTestBase {
	
	@DepreciateTestAnnotated(description = "添加商品测试用例---成功用例")
	public void testAddProduct() {
		
		cleanProduct();
		
		// 麦包包
		ProductOrder mbaobaoOrder = genProductOrder();
		ProductResult result = productService.addProduct(mbaobaoOrder);
		
		assertResult(result);
		
		// 麦考林
		ProductOrder m18Order = genProductOrder();
		m18Order.setUrl("http://product.m18.com/p-7112705.htm");
		result = productService.addProduct(m18Order);
		
		assertResult(result);
		
		// 当当
		ProductOrder dangdangOrder = genProductOrder();
		dangdangOrder
			.setUrl("http://product.dangdang.com/Product.aspx?product_id=1260888102#ref=www-0-D");
		result = productService.addProduct(dangdangOrder);
		
		assertResult(result);
		
	}
}