package com.poc.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;

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
@Table(name = "order_finish_info")
public class OrderFinishInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Long rowId;
	
	    //订单状态（F：已释放订单，N:未付款，S:已付款）
    @Column(name = "item_type")
    private String itemType;
	
	    //id
    @Column(name = "order_id")
    private String orderId;
	
	    //环企订单号
    @Column(name = "order_no")
    private String orderNo;
	
	    //第三方订单号
    @Column(name = "order_thirdparty_no")
    private String orderThirdpartyNo;
	
	    //环企明细ID
    @Column(name = "item_id")
    private String itemId;
	
	    //第三方明细ID
    @Column(name = "dorderitems_thirdpartyid")
    private String dorderitemsThirdpartyid;
	
	    //下单企业ID
    @Column(name = "order_ownerid")
    private String orderOwnerid;
	
	    //明细金额
    @Column(name = "orderitems_amout")
    private BigDecimal orderitemsAmout;
	
	    //产品名称
    @Column(name = "product_name")
    private String productName;
	
	    //明细状态（F：已释放订单，N:未付款，S:已付款）
    @Column(name = "itemType")
    private String itemtype;
	
	    //电子串码
    @Column(name = "e_code")
    private String eCode;
	
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
	 * 设置：订单状态（F：已释放订单，N:未付款，S:已付款）
	 */
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	/**
	 * 获取：订单状态（F：已释放订单，N:未付款，S:已付款）
	 */
	public String getItemType() {
		return itemType;
	}
	/**
	 * 设置：id
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	/**
	 * 获取：id
	 */
	public String getOrderId() {
		return orderId;
	}
	/**
	 * 设置：环企订单号
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	/**
	 * 获取：环企订单号
	 */
	public String getOrderNo() {
		return orderNo;
	}
	/**
	 * 设置：第三方订单号
	 */
	public void setOrderThirdpartyNo(String orderThirdpartyNo) {
		this.orderThirdpartyNo = orderThirdpartyNo;
	}
	/**
	 * 获取：第三方订单号
	 */
	public String getOrderThirdpartyNo() {
		return orderThirdpartyNo;
	}
	/**
	 * 设置：环企明细ID
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	/**
	 * 获取：环企明细ID
	 */
	public String getItemId() {
		return itemId;
	}
	/**
	 * 设置：第三方明细ID
	 */
	public void setDorderitemsThirdpartyid(String dorderitemsThirdpartyid) {
		this.dorderitemsThirdpartyid = dorderitemsThirdpartyid;
	}
	/**
	 * 获取：第三方明细ID
	 */
	public String getDorderitemsThirdpartyid() {
		return dorderitemsThirdpartyid;
	}
	/**
	 * 设置：下单企业ID
	 */
	public void setOrderOwnerid(String orderOwnerid) {
		this.orderOwnerid = orderOwnerid;
	}
	/**
	 * 获取：下单企业ID
	 */
	public String getOrderOwnerid() {
		return orderOwnerid;
	}
	/**
	 * 设置：明细金额
	 */
	public void setOrderitemsAmout(BigDecimal orderitemsAmout) {
		this.orderitemsAmout = orderitemsAmout;
	}
	/**
	 * 获取：明细金额
	 */
	public BigDecimal getOrderitemsAmout() {
		return orderitemsAmout;
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
	 * 设置：明细状态（F：已释放订单，N:未付款，S:已付款）
	 */
	public void setItemtype(String itemtype) {
		this.itemtype = itemtype;
	}
	/**
	 * 获取：明细状态（F：已释放订单，N:未付款，S:已付款）
	 */
	public String getItemtype() {
		return itemtype;
	}
	/**
	 * 设置：电子串码
	 */
	public void setECode(String eCode) {
		this.eCode = eCode;
	}
	/**
	 * 获取：电子串码
	 */
	public String getECode() {
		return eCode;
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
