package com.poc.demo.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.poc.demo.biz.OrderInfoBiz;
import com.poc.demo.entity.OrderInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orderInfo")
public class OrderInfoController extends BaseController<OrderInfoBiz,OrderInfo> {

}