package com.poc.demo.biz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.demo.entity.ProductRelateInfo;
import com.poc.demo.mapper.ProductRelateInfoMapper;
import com.github.wxiaoqi.security.common.biz.BaseBiz;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2019-10-25 19:30:16
 */
@Service
public class ProductRelateInfoBiz extends BaseBiz<ProductRelateInfoMapper, ProductRelateInfo> {

	@Autowired
	private ProductRelateInfoMapper productRelateInfoMapper;

	private static Logger logger = LoggerFactory.getLogger(ProductRelateInfoBiz.class);

	/**
	 * 功能描述: 根据产品id查询商品
	 *
	 * @param:
	 * @return:
	 * @auther: LiuDong
	 * @date: 11:06 2019/10/26
	 */
	public List<ProductRelateInfo> selectProductRelateInfosByproductId(String productId) {
		List<ProductRelateInfo> infos = new ArrayList<>();
		Example example = new Example(ProductRelateInfo.class);
		example.selectProperties("productId", "commodityId");
		Example.Criteria criteria = example.createCriteria();
		criteria.andEqualTo("productId", productId).andEqualTo("status",1);
		infos = productRelateInfoMapper.selectByExample(example);
		return infos;
	}
}