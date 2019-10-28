package com.poc.demo.biz;

import com.github.wxiaoqi.security.common.biz.BaseBiz;
import com.poc.demo.entity.TicketInfo;
import com.poc.demo.mapper.TicketInfoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2019-10-25 19:30:16
 */
@Service
public class TicketInfoBiz extends BaseBiz<TicketInfoMapper, TicketInfo> {
	@Autowired
	private TicketInfoMapper ticketInfoMapper;

	private static Logger logger = LoggerFactory.getLogger(TicketInfoBiz.class);

	/**
	 * 功能描述: 退票时查询门票详情
	 *
	 * @param:
	 * @return:
	 * @auther: LiuDong
	 * @date: 11:20 2019/10/26
	 */
	public List<TicketInfo> selectTicketInfoByTid(String tId) {
		List<TicketInfo> infos = new ArrayList<>();
		Example example = new Example(TicketInfo.class);
		example.selectProperties("parkName", "tCode", "tName", "tType", "tvType", "tPrice", "tVipPrice", "verifCount", "status");
		Example.Criteria criteria = example.createCriteria();
		criteria.andEqualTo("tId", tId).andEqualTo("status", 1);
		infos = ticketInfoMapper.selectByExample(example);
		return infos;
	}

}