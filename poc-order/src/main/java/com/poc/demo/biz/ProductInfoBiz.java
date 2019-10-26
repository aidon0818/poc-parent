package com.poc.demo.biz;

import com.github.wxiaoqi.security.common.biz.BaseBiz;
import com.poc.demo.entity.ProductInfo;
import com.poc.demo.mapper.ProductInfoMapper;
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
public class ProductInfoBiz extends BaseBiz<ProductInfoMapper, ProductInfo> {

	@Autowired
	private ProductInfoMapper productInfoMapper;

	private static Logger logger = LoggerFactory.getLogger(ProductInfoBiz.class);

	/**
	 * 功能描述: 根据tId查询商品
	 *
	 * @param:
	 * @return:
	 * @auther: LiuDong
	 * @date: 11:06 2019/10/26
	 */
	public ProductInfo selectProductInfosByTId(String tId) {
		List<ProductInfo> infos = new ArrayList<>();
		Example example = new Example(ProductInfo.class);
		example.selectProperties("tId", "tCode", "tName", "tPdtprice", "tDispdtprice", "tShowid", "tShowsdate", "tShowedate", "tShowstime", "tShowetime", "hotelSdate", "hotelEdate", "verifCount", "status", "ifRefund");
		Example.Criteria criteria = example.createCriteria();
		criteria.andEqualTo("tId", tId).andEqualTo("status", 1);
		infos = productInfoMapper.selectByExample(example);
		if (infos.size() > 0) {
			return infos.get(0);
		} else {
			return null;
		}

	}
}