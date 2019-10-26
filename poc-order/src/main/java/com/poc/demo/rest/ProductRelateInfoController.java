package com.poc.demo.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.poc.demo.biz.ProductRelateInfoBiz;
import com.poc.demo.entity.ProductRelateInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("productRelateInfo")
public class ProductRelateInfoController extends BaseController<ProductRelateInfoBiz, ProductRelateInfo> {
	private static Logger logger = LoggerFactory.getLogger(ProductRelateInfoController.class);

}