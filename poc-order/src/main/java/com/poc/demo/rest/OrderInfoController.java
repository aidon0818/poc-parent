package com.poc.demo.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.poc.demo.biz.OrderInfoBiz;
import com.poc.demo.entity.OrderInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orderInfo")
public class OrderInfoController extends BaseController<OrderInfoBiz, OrderInfo> {
	private static Logger logger = LoggerFactory.getLogger(OrderInfoController.class);
	@Autowired
	private OrderInfoBiz orderInfoBiz;

	/**
	 * 功能描述: 退订单
	 *
	 * @param:
	 * @return:
	 * @auther: LiuDong
	 * @date: 15:43 2019/10/26
	 */
	@RequestMapping(value = "/updateRetreatOrder/{oderNo}", method = RequestMethod.GET)
	public String updateRetreatOrder(@PathVariable String productId) {
		//TODO 前端判断订单可直接退款时进行调用
		return "";
	}
}