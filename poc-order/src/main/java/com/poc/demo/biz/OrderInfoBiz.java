package com.poc.demo.biz;

import org.springframework.stereotype.Service;

import com.poc.demo.entity.OrderInfo;
import com.poc.demo.mapper.OrderInfoMapper;
import com.github.wxiaoqi.security.common.biz.BaseBiz;

/**
 * 
 *
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2019-10-25 19:30:16
 */
@Service
public class OrderInfoBiz extends BaseBiz<OrderInfoMapper,OrderInfo> {
}