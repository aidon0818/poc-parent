package com.poc.demo.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.poc.demo.biz.ProductReserveInfoBiz;
import com.poc.demo.entity.ProductReserveInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("productReserveInfo")
public class ProductReserveInfoController extends BaseController<ProductReserveInfoBiz,ProductReserveInfo> {

}