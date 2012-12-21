/**
 * jiangjia.la Inc.
 * Copyright (c) 2012 All Rights Reserved.
 */
package com.peigen.web.depreciate.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.alibaba.fastjson.JSONObject;
import com.peigen.common.lang.util.ListUtil;
import com.peigen.common.lang.util.StringUtil;
import com.peigen.common.lang.util.money.Money;
import com.peigen.web.depreciate.controller.base.ControllerBase;
import com.peigen.web.depreciate.service.enums.DepreciateResultEnum;
import com.peigen.web.depreciate.service.order.ProductOrder;
import com.peigen.web.depreciate.service.order.ProductParaOrder;
import com.peigen.web.depreciate.service.result.ProductResult;
import com.peigen.web.depreciate.util.LoginUtil;

/**
 *                       
 * @Filename AddProductController.java
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
 *<li>Date: 2011-11-24</li>
 *<li>Version: 1.0</li>
 *<li>Content: create</li>
 *
 */
@Controller
public class ProductController extends ControllerBase {

    @RequestMapping(value = "/resolveProduct.html", method = { RequestMethod.GET })
    public ModelAndView resolve(HttpServletRequest request, ModelMap modelMap) {

        String url = getParameterTrim(request, "productUrl");
        ProductResult result = new ProductResult();

        if (StringUtil.isBlank(url)) {
            return new ModelAndView(new RedirectView(
                "/error.html?code=" + DepreciateResultEnum.INCOMPLETE_REQ_PARAM.code()));
        }

        //登录状态
        String userId = LoginUtil.getCurrentLoginId(request);
        if (StringUtil.isEmpty(userId)) {
            return new ModelAndView(new RedirectView("/error.html?code="
                                                     + DepreciateResultEnum.NOT_LOGIN.code()));
        }

        ProductOrder productOrder = new ProductOrder();
        productOrder.setUrl(url);
        productOrder.setUserId(userId);// 获取用户信息
        result = productService.addProduct(productOrder);

        modelMap.put("page_name", "产品信息");
        modelMap.put("result", result);

        return new ModelAndView("product/resolve.vm");
    }

    @RequestMapping(value = "/addProduct.html", method = { RequestMethod.GET })
    @ResponseBody
    @Deprecated
    public String add(HttpServletRequest request) {

        String url = getParameterTrim(request, "productUrl");
        ProductResult result = new ProductResult();

        if (StringUtil.isBlank(url)) {
            result.setResultCode(DepreciateResultEnum.INCOMPLETE_REQ_PARAM);
            return JSONObject.toJSONString(result);
        }

        ProductOrder productOrder = new ProductOrder();
        productOrder.setUrl(url);

        // 获取用户信息
        productOrder.setUserId(LoginUtil.getCurrentLoginId(request));

        result = productService.addProduct(productOrder);

        return JSONObject.toJSONString(result);
    }

    @RequestMapping(value = "/addByEmail.ws", method = { RequestMethod.GET })
    @ResponseBody
    public String addByEmail(HttpServletRequest request) {

        String email = getParameterTrim(request, "email");
        String url = getParameterTrim(request, "productUrl");

        if (StringUtil.isBlank(email) || StringUtil.isBlank(url)) {
            JSONObject.toJSONString("狗日，你丫是二啊!");
        }

        ProductResult result = new ProductResult();

        ProductOrder productOrder = new ProductOrder();
        productOrder.setUrl(url);
        productOrder.setUserId(getUser(email).getId());

        result = productService.addProduct(productOrder);

        return JSONObject.toJSONString(result);
    }

    @RequestMapping(value = "/addByPara.ws", method = { RequestMethod.GET })
    @ResponseBody
    public String addByPara(HttpServletRequest request) {

        String url = getParameterTrim(request, "productUrl");
        String price = getParameterTrim(request, "price");
        String serialNo = getParameterTrim(request, "serialNo");
        String imagesStr = getParameterTrim(request, "imagesStr");

        String userId = LoginUtil.getCurrentLoginId(request);

        if (StringUtil.isBlank(userId) || StringUtil.isBlank(url) || StringUtil.isBlank(price)
            || StringUtil.isBlank(serialNo)) {
            return JSONObject.toJSONString("狗日，你丫是二啊!");
        }

        ProductResult result = new ProductResult();

        ProductParaOrder productOrder = new ProductParaOrder();
        productOrder.setUrl(url);
        productOrder.setUserId(userId);
        productOrder.setPrice(new Money(price));
        productOrder.setSerialNo(serialNo);

        List<String> images = ListUtil.toList(imagesStr);
        productOrder.setImages(images);

        result = productService.addProduct(productOrder);

        return JSONObject.toJSONString(result);
    }
}
