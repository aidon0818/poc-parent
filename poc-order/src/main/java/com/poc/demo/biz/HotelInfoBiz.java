package com.poc.demo.biz;

import com.github.wxiaoqi.security.common.biz.BaseBiz;
import com.poc.demo.entity.HotelInfo;
import com.poc.demo.mapper.HotelInfoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2019-10-25 19:30:16
 */
@Service
public class HotelInfoBiz extends BaseBiz<HotelInfoMapper,HotelInfo> {
	@Autowired
	private HotelInfoMapper hotelInfoMapper;

	private static Logger logger = LoggerFactory.getLogger(HotelInfoBiz.class);


	/**
	 * 功能描述: 退票时查询门票详情
	 *
	 * @param:
	 * @return:
	 * @auther: LiuDong
	 * @date: 11:20 2019/10/26
	 */
	public List<HotelInfo> selectHotelInfoByHotelId(String hotelId) {
		List<HotelInfo> infos = new ArrayList<>();
		Example example = new Example(HotelInfo.class);
		example.selectProperties("hotelId", "hotelName", "hotelPrice", "hotelVipPrice", "hotelDeposit", "hotelPersonNum", "hotelFloor");
		Example.Criteria criteria = example.createCriteria();
		criteria.andEqualTo("hotelId", hotelId).andEqualTo("status", 1);
		infos = hotelInfoMapper.selectByExample(example);
		return infos;
	}
}