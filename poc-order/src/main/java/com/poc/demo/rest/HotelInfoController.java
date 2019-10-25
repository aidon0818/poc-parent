package com.poc.demo.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.poc.demo.biz.HotelInfoBiz;
import com.poc.demo.entity.HotelInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hotelInfo")
public class HotelInfoController extends BaseController<HotelInfoBiz,HotelInfo> {

}