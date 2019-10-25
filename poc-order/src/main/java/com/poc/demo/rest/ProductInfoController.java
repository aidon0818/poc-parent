package com.poc.demo.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.poc.demo.biz.ProductInfoBiz;
import com.poc.demo.entity.ProductInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("productInfo")
public class ProductInfoController extends BaseController<ProductInfoBiz,ProductInfo> {

}