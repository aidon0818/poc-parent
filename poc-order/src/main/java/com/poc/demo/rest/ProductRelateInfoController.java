package com.poc.demo.rest;

import com.alibaba.fastjson.JSONObject;
import com.github.wxiaoqi.security.common.rest.BaseController;
import com.poc.demo.biz.ProductInfoBiz;
import com.poc.demo.biz.ProductRelateInfoBiz;
import com.poc.demo.entity.ProductInfo;
import com.poc.demo.entity.ProductRelateInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("productRelateInfo")
public class ProductRelateInfoController extends BaseController<ProductRelateInfoBiz, ProductRelateInfo> {
	private static Logger logger = LoggerFactory.getLogger(ProductRelateInfoController.class);

}