package com.poc.demo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2019-10-25 19:30:16
 */
@Table(name = "product_relate_info")
public class ProductRelateInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Long rowId;
	
	    //产品id
    @Column(name = "product_id")
    private String productId;
	
	    //商品id
    @Column(name = "commodity_id")
    private String commodityId;
	
	    //状态：0-失效，1-有效
    @Column(name = "status")
    private Integer status;
	
	    //
    @Column(name = "version")
    private Integer version;
	

	/**
	 * 设置：
	 */
	public void setRowId(Long rowId) {
		this.rowId = rowId;
	}
	/**
	 * 获取：
	 */
	public Long getRowId() {
		return rowId;
	}
	/**
	 * 设置：产品id
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}
	/**
	 * 获取：产品id
	 */
	public String getProductId() {
		return productId;
	}
	/**
	 * 设置：商品id
	 */
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	/**
	 * 获取：商品id
	 */
	public String getCommodityId() {
		return commodityId;
	}
	/**
	 * 设置：状态：0-失效，1-有效
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态：0-失效，1-有效
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}
	/**
	 * 获取：
	 */
	public Integer getVersion() {
		return version;
	}
}
