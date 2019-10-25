package com.poc.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2019-10-25 19:30:16
 */
@Table(name = "order_info")
public class OrderInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Long rowId;
	
	    //第三方订单号
    @Column(name = "order_no")
    private String orderNo;
	
	    //第三方订单明细ID
    @Column(name = "item_id")
    private String itemId;
	
	    //产品id
    @Column(name = "product_id")
    private String productId;
	
	    //产品编码
    @Column(name = "product_code")
    private String productCode;
	
	    //产品名称
    @Column(name = "product_name")
    private String productName;
	
	    //产品单价
    @Column(name = "product_price")
    private BigDecimal productPrice;
	
	    //产品数量
    @Column(name = "product_count")
    private Integer productCount;
	
	    //游玩日期开始
    @Column(name = "product_sdate")
    private String productSdate;
	
	    //游玩日期结束
    @Column(name = "product_edate")
    private String productEdate;
	
	    //游客所选场次ID
    @Column(name = "j_showid")
    private String jShowid;
	
	    //游客所选座位ID
    @Column(name = "j_seatid")
    private String jSeatid;
	
	    //锁座ID
    @Column(name = "lock_id")
    private String lockId;
	
	    //游玩人姓名
    @Column(name = "link_name")
    private String linkName;
	
	    //游玩人手机号
    @Column(name = "link_phone")
    private String linkPhone;
	
	    //游玩人身份证号
    @Column(name = "link_ICNO")
    private String linkIcno;
	
	    //创建日期（年月日时分秒）
    @Column(name = "create_time")
    private Date createTime;
	
	    //订单类型：0消费，1退款
    @Column(name = "order_type")
    private Integer orderType;
	
	    //状态
    @Column(name = "status")
    private Integer status;
	
	    //版本
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
	 * 设置：第三方订单号
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	/**
	 * 获取：第三方订单号
	 */
	public String getOrderNo() {
		return orderNo;
	}
	/**
	 * 设置：第三方订单明细ID
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	/**
	 * 获取：第三方订单明细ID
	 */
	public String getItemId() {
		return itemId;
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
	 * 设置：产品编码
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	/**
	 * 获取：产品编码
	 */
	public String getProductCode() {
		return productCode;
	}
	/**
	 * 设置：产品名称
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * 获取：产品名称
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * 设置：产品单价
	 */
	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}
	/**
	 * 获取：产品单价
	 */
	public BigDecimal getProductPrice() {
		return productPrice;
	}
	/**
	 * 设置：产品数量
	 */
	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}
	/**
	 * 获取：产品数量
	 */
	public Integer getProductCount() {
		return productCount;
	}
	/**
	 * 设置：游玩日期开始
	 */
	public void setProductSdate(String productSdate) {
		this.productSdate = productSdate;
	}
	/**
	 * 获取：游玩日期开始
	 */
	public String getProductSdate() {
		return productSdate;
	}
	/**
	 * 设置：游玩日期结束
	 */
	public void setProductEdate(String productEdate) {
		this.productEdate = productEdate;
	}
	/**
	 * 获取：游玩日期结束
	 */
	public String getProductEdate() {
		return productEdate;
	}
	/**
	 * 设置：游客所选场次ID
	 */
	public void setJShowid(String jShowid) {
		this.jShowid = jShowid;
	}
	/**
	 * 获取：游客所选场次ID
	 */
	public String getJShowid() {
		return jShowid;
	}
	/**
	 * 设置：游客所选座位ID
	 */
	public void setJSeatid(String jSeatid) {
		this.jSeatid = jSeatid;
	}
	/**
	 * 获取：游客所选座位ID
	 */
	public String getJSeatid() {
		return jSeatid;
	}
	/**
	 * 设置：锁座ID
	 */
	public void setLockId(String lockId) {
		this.lockId = lockId;
	}
	/**
	 * 获取：锁座ID
	 */
	public String getLockId() {
		return lockId;
	}
	/**
	 * 设置：游玩人姓名
	 */
	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}
	/**
	 * 获取：游玩人姓名
	 */
	public String getLinkName() {
		return linkName;
	}
	/**
	 * 设置：游玩人手机号
	 */
	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}
	/**
	 * 获取：游玩人手机号
	 */
	public String getLinkPhone() {
		return linkPhone;
	}
	/**
	 * 设置：游玩人身份证号
	 */
	public void setLinkIcno(String linkIcno) {
		this.linkIcno = linkIcno;
	}
	/**
	 * 获取：游玩人身份证号
	 */
	public String getLinkIcno() {
		return linkIcno;
	}
	/**
	 * 设置：创建日期（年月日时分秒）
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建日期（年月日时分秒）
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：订单类型：0消费，1退款
	 */
	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}
	/**
	 * 获取：订单类型：0消费，1退款
	 */
	public Integer getOrderType() {
		return orderType;
	}
	/**
	 * 设置：状态
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：版本
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}
	/**
	 * 获取：版本
	 */
	public Integer getVersion() {
		return version;
	}
}
