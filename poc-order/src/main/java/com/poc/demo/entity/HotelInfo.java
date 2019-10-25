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
@Table(name = "hotel_info")
public class HotelInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Long rowId;
	
	    //产品id
    @Column(name = "hotel_id")
    private String hotelId;
	
	    //房型名称
    @Column(name = "hotel_name")
    private String hotelName;
	
	    //房型描述
    @Column(name = "hotel_desc")
    private String hotelDesc;
	
	    //标准价
    @Column(name = "hotel_price")
    private BigDecimal hotelPrice;
	
	    //会员价
    @Column(name = "hotel_vip_price")
    private BigDecimal hotelVipPrice;
	
	    //可入住开始时间
    @Column(name = "hotel_begin_time")
    private Date hotelBeginTime;
	
	    //可入住结束时间
    @Column(name = "hotel_end_time")
    private Date hotelEndTime;
	
	    //是否含早餐
    @Column(name = "hotel_breakfast")
    private String hotelBreakfast;
	
	    //入住人数
    @Column(name = "hotel_person_num")
    private Integer hotelPersonNum;
	
	    //床型
    @Column(name = "hotel_bed_type")
    private String hotelBedType;
	
	    //建筑面积
    @Column(name = "hotel_acreage")
    private String hotelAcreage;
	
	    //楼层
    @Column(name = "hotel_floor")
    private String hotelFloor;
	
	    //景观
    @Column(name = "hotel_scenery")
    private String hotelScenery;
	
	    //窗户
    @Column(name = "hotel_window")
    private String hotelWindow;
	
	    //是否加床
    @Column(name = "hotel_if_beds")
    private String hotelIfBeds;
	
	    //押金
    @Column(name = "hotel_deposit")
    private BigDecimal hotelDeposit;
	
	    //是否赠送积分
    @Column(name = "hotel_integral")
    private Integer hotelIntegral;
	
	    //备注
    @Column(name = "hotel_remark")
    private String hotelRemark;
	
	    //附件服务/产品
    @Column(name = "hotel_enclosure")
    private String hotelEnclosure;
	
	    //是否可取消
    @Column(name = "hotel_if_cancel")
    private String hotelIfCancel;
	
	    //是否可取消code
    @Column(name = "hotel_if_cancel_code")
    private Integer hotelIfCancelCode;
	
	    //库存
    @Column(name = "hotel_stock")
    private Integer hotelStock;
	
	    //图片
    @Column(name = "hotel_pic")
    private String hotelPic;
	
	    //状态：0-无效 ，1-有效
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
	 * 设置：产品id
	 */
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	/**
	 * 获取：产品id
	 */
	public String getHotelId() {
		return hotelId;
	}
	/**
	 * 设置：房型名称
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	/**
	 * 获取：房型名称
	 */
	public String getHotelName() {
		return hotelName;
	}
	/**
	 * 设置：房型描述
	 */
	public void setHotelDesc(String hotelDesc) {
		this.hotelDesc = hotelDesc;
	}
	/**
	 * 获取：房型描述
	 */
	public String getHotelDesc() {
		return hotelDesc;
	}
	/**
	 * 设置：标准价
	 */
	public void setHotelPrice(BigDecimal hotelPrice) {
		this.hotelPrice = hotelPrice;
	}
	/**
	 * 获取：标准价
	 */
	public BigDecimal getHotelPrice() {
		return hotelPrice;
	}
	/**
	 * 设置：会员价
	 */
	public void setHotelVipPrice(BigDecimal hotelVipPrice) {
		this.hotelVipPrice = hotelVipPrice;
	}
	/**
	 * 获取：会员价
	 */
	public BigDecimal getHotelVipPrice() {
		return hotelVipPrice;
	}
	/**
	 * 设置：可入住开始时间
	 */
	public void setHotelBeginTime(Date hotelBeginTime) {
		this.hotelBeginTime = hotelBeginTime;
	}
	/**
	 * 获取：可入住开始时间
	 */
	public Date getHotelBeginTime() {
		return hotelBeginTime;
	}
	/**
	 * 设置：可入住结束时间
	 */
	public void setHotelEndTime(Date hotelEndTime) {
		this.hotelEndTime = hotelEndTime;
	}
	/**
	 * 获取：可入住结束时间
	 */
	public Date getHotelEndTime() {
		return hotelEndTime;
	}
	/**
	 * 设置：是否含早餐
	 */
	public void setHotelBreakfast(String hotelBreakfast) {
		this.hotelBreakfast = hotelBreakfast;
	}
	/**
	 * 获取：是否含早餐
	 */
	public String getHotelBreakfast() {
		return hotelBreakfast;
	}
	/**
	 * 设置：入住人数
	 */
	public void setHotelPersonNum(Integer hotelPersonNum) {
		this.hotelPersonNum = hotelPersonNum;
	}
	/**
	 * 获取：入住人数
	 */
	public Integer getHotelPersonNum() {
		return hotelPersonNum;
	}
	/**
	 * 设置：床型
	 */
	public void setHotelBedType(String hotelBedType) {
		this.hotelBedType = hotelBedType;
	}
	/**
	 * 获取：床型
	 */
	public String getHotelBedType() {
		return hotelBedType;
	}
	/**
	 * 设置：建筑面积
	 */
	public void setHotelAcreage(String hotelAcreage) {
		this.hotelAcreage = hotelAcreage;
	}
	/**
	 * 获取：建筑面积
	 */
	public String getHotelAcreage() {
		return hotelAcreage;
	}
	/**
	 * 设置：楼层
	 */
	public void setHotelFloor(String hotelFloor) {
		this.hotelFloor = hotelFloor;
	}
	/**
	 * 获取：楼层
	 */
	public String getHotelFloor() {
		return hotelFloor;
	}
	/**
	 * 设置：景观
	 */
	public void setHotelScenery(String hotelScenery) {
		this.hotelScenery = hotelScenery;
	}
	/**
	 * 获取：景观
	 */
	public String getHotelScenery() {
		return hotelScenery;
	}
	/**
	 * 设置：窗户
	 */
	public void setHotelWindow(String hotelWindow) {
		this.hotelWindow = hotelWindow;
	}
	/**
	 * 获取：窗户
	 */
	public String getHotelWindow() {
		return hotelWindow;
	}
	/**
	 * 设置：是否加床
	 */
	public void setHotelIfBeds(String hotelIfBeds) {
		this.hotelIfBeds = hotelIfBeds;
	}
	/**
	 * 获取：是否加床
	 */
	public String getHotelIfBeds() {
		return hotelIfBeds;
	}
	/**
	 * 设置：押金
	 */
	public void setHotelDeposit(BigDecimal hotelDeposit) {
		this.hotelDeposit = hotelDeposit;
	}
	/**
	 * 获取：押金
	 */
	public BigDecimal getHotelDeposit() {
		return hotelDeposit;
	}
	/**
	 * 设置：是否赠送积分
	 */
	public void setHotelIntegral(Integer hotelIntegral) {
		this.hotelIntegral = hotelIntegral;
	}
	/**
	 * 获取：是否赠送积分
	 */
	public Integer getHotelIntegral() {
		return hotelIntegral;
	}
	/**
	 * 设置：备注
	 */
	public void setHotelRemark(String hotelRemark) {
		this.hotelRemark = hotelRemark;
	}
	/**
	 * 获取：备注
	 */
	public String getHotelRemark() {
		return hotelRemark;
	}
	/**
	 * 设置：附件服务/产品
	 */
	public void setHotelEnclosure(String hotelEnclosure) {
		this.hotelEnclosure = hotelEnclosure;
	}
	/**
	 * 获取：附件服务/产品
	 */
	public String getHotelEnclosure() {
		return hotelEnclosure;
	}
	/**
	 * 设置：是否可取消
	 */
	public void setHotelIfCancel(String hotelIfCancel) {
		this.hotelIfCancel = hotelIfCancel;
	}
	/**
	 * 获取：是否可取消
	 */
	public String getHotelIfCancel() {
		return hotelIfCancel;
	}
	/**
	 * 设置：是否可取消code
	 */
	public void setHotelIfCancelCode(Integer hotelIfCancelCode) {
		this.hotelIfCancelCode = hotelIfCancelCode;
	}
	/**
	 * 获取：是否可取消code
	 */
	public Integer getHotelIfCancelCode() {
		return hotelIfCancelCode;
	}
	/**
	 * 设置：库存
	 */
	public void setHotelStock(Integer hotelStock) {
		this.hotelStock = hotelStock;
	}
	/**
	 * 获取：库存
	 */
	public Integer getHotelStock() {
		return hotelStock;
	}
	/**
	 * 设置：图片
	 */
	public void setHotelPic(String hotelPic) {
		this.hotelPic = hotelPic;
	}
	/**
	 * 获取：图片
	 */
	public String getHotelPic() {
		return hotelPic;
	}
	/**
	 * 设置：状态：0-无效 ，1-有效
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态：0-无效 ，1-有效
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
