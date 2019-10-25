package com.poc.demo.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.poc.demo.biz.ProductRelateInfoBiz;
import com.poc.demo.entity.ProductRelateInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("productRelateInfo")
public class ProductRelateInfoController extends BaseController<ProductRelateInfoBiz,ProductRelateInfo> {

}