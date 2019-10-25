package com.poc.demo.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.poc.demo.biz.TicketInfoBiz;
import com.poc.demo.entity.TicketInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ticketInfo")
public class TicketInfoController extends BaseController<TicketInfoBiz,TicketInfo> {

}