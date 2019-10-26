package com.poc.demo.rest;

import com.alibaba.fastjson.JSONObject;
import com.github.wxiaoqi.security.common.rest.BaseController;
import com.poc.demo.biz.HotelInfoBiz;
import com.poc.demo.biz.ProductInfoBiz;
import com.poc.demo.biz.ProductRelateInfoBiz;
import com.poc.demo.biz.TicketInfoBiz;
import com.poc.demo.entity.HotelInfo;
import com.poc.demo.entity.ProductInfo;
import com.poc.demo.entity.ProductRelateInfo;
import com.poc.demo.entity.TicketInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("productInfo")
public class ProductInfoController extends BaseController<ProductInfoBiz, ProductInfo> {
	private static Logger logger = LoggerFactory.getLogger(ProductInfoController.class);
	@Autowired
	private ProductRelateInfoBiz productRelateInfoBiz;
	@Autowired
	private ProductInfoBiz productInfoBiz;
	@Autowired
	private HotelInfoBiz hotelInfoBiz;
	@Autowired
	private TicketInfoBiz ticketInfoBiz;

	/**
	 * 功能描述:根据产品id查询所有商品
	 *
	 * @param:
	 * @return:
	 * @auther: LiuDong
	 * @date: 10:30 2019/10/26
	 */
	@RequestMapping(value = "/selectProductInfosByproductId/{productId}", method = RequestMethod.GET)
	public String selectProductInfosByproductId(@PathVariable String productId) {
		logger.info("根据产品id查询所有商品");
		String rtn = "";
		JSONObject object = new JSONObject();
		List<TicketInfo> tList = new ArrayList<>();
		List<HotelInfo> hList = new ArrayList<>();
		ProductInfo productInfo = productInfoBiz.selectProductInfosByTId(productId);
		List<ProductRelateInfo> relateInfoList = productRelateInfoBiz.selectProductRelateInfosByproductId(productInfo.getTId());
		if (null != relateInfoList) {
			for (ProductRelateInfo t : relateInfoList) {
				if (t.getCommodityId().contains("T")) {
					tList = ticketInfoBiz.selectTicketInfoByTid(t.getCommodityId());
				} else if (t.getCommodityId().contains("H")) {
					hList = hotelInfoBiz.selectHotelInfoByHotelId(t.getCommodityId());
				}
			}
		}
		object.put("productInfo", productInfo);
		object.put("tList", tList);
		object.put("hList", hList);
		rtn = object.toJSONString();
		return rtn;
	}
}