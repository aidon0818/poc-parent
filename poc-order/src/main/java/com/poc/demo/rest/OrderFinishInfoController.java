package com.poc.demo.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.poc.demo.biz.OrderFinishInfoBiz;
import com.poc.demo.entity.OrderFinishInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orderFinishInfo")
public class OrderFinishInfoController extends BaseController<OrderFinishInfoBiz,OrderFinishInfo> {

}