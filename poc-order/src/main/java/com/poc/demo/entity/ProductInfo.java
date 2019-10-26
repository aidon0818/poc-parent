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
@Table(name = "product_info")
public class ProductInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Long rowId;
	
	    //产品所属景区ID
    @Column(name = "park_id")
    private String parkId;
	
	    //产品所属景区名称
    @Column(name = "park_name")
    private String parkName;
	
	    //产品ID
    @Column(name = "t_id")
    private String tId;
	
	    //产品编码
    @Column(name = "t_code")
    private String tCode;
	
	    //产品名称
    @Column(name = "t_name")
    private String tName;
	
	    //产品门市价
    @Column(name = "t_pdtprice")
    private BigDecimal tPdtprice;
	
	    //产品协议结算价
    @Column(name = "t_dispdtprice")
    private BigDecimal tDispdtprice;
	
	    //场地ID
    @Column(name = "t_locid")
    private String tLocid;
	
	    //场地名称
    @Column(name = "t_locname")
    private String tLocname;
	
	    //场次ID
    @Column(name = "t_showid")
    private String tShowid;
	
	    //场次开始日期
    @Column(name = "t_showsdate")
    private Date tShowsdate;
	
	    //场次结束日期
    @Column(name = "t_showedate")
    private Date tShowedate;
	
	    //演出开始时间
    @Column(name = "t_showstime")
    private String tShowstime;
	
	    //演出结束时间
    @Column(name = "t_showetime")
    private String tShowetime;
	
	    //酒店开始时间
    @Column(name = "hotel_sdate")
    private String hotelSdate;
	
	    //酒店结束时间
    @Column(name = "hotel_edate")
    private String hotelEdate;
	
	    //分配日期
    @Column(name = "d_pdate")
    private String dPdate;
	
	    //剧目id
    @Column(name = "trep_id")
    private String trepId;
	
	    //票档信息列表
    @Column(name = "tareas")
    private String tareas;
	
	    //可入园次数,默认等于门票的入园次数
    @Column(name = "verif_count")
    private Integer verifCount;
	//是否允许自助退款；0-不可以，1-可以
    @Column(name = "if_refund")
	private Integer ifRefund;
	
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
	 * 设置：产品所属景区ID
	 */
	public void setParkId(String parkId) {
		this.parkId = parkId;
	}
	/**
	 * 获取：产品所属景区ID
	 */
	public String getParkId() {
		return parkId;
	}
	/**
	 * 设置：产品所属景区名称
	 */
	public void setParkName(String parkName) {
		this.parkName = parkName;
	}
	/**
	 * 获取：产品所属景区名称
	 */
	public String getParkName() {
		return parkName;
	}
	/**
	 * 设置：产品ID
	 */
	public void setTId(String tId) {
		this.tId = tId;
	}
	/**
	 * 获取：产品ID
	 */
	public String getTId() {
		return tId;
	}
	/**
	 * 设置：产品编码
	 */
	public void setTCode(String tCode) {
		this.tCode = tCode;
	}
	/**
	 * 获取：产品编码
	 */
	public String getTCode() {
		return tCode;
	}
	/**
	 * 设置：产品名称
	 */
	public void setTName(String tName) {
		this.tName = tName;
	}
	/**
	 * 获取：产品名称
	 */
	public String getTName() {
		return tName;
	}
	/**
	 * 设置：产品门市价
	 */
	public void setTPdtprice(BigDecimal tPdtprice) {
		this.tPdtprice = tPdtprice;
	}
	/**
	 * 获取：产品门市价
	 */
	public BigDecimal getTPdtprice() {
		return tPdtprice;
	}
	/**
	 * 设置：产品协议结算价
	 */
	public void setTDispdtprice(BigDecimal tDispdtprice) {
		this.tDispdtprice = tDispdtprice;
	}
	/**
	 * 获取：产品协议结算价
	 */
	public BigDecimal getTDispdtprice() {
		return tDispdtprice;
	}
	/**
	 * 设置：场地ID
	 */
	public void setTLocid(String tLocid) {
		this.tLocid = tLocid;
	}
	/**
	 * 获取：场地ID
	 */
	public String getTLocid() {
		return tLocid;
	}
	/**
	 * 设置：场地名称
	 */
	public void setTLocname(String tLocname) {
		this.tLocname = tLocname;
	}
	/**
	 * 获取：场地名称
	 */
	public String getTLocname() {
		return tLocname;
	}
	/**
	 * 设置：场次ID
	 */
	public void setTShowid(String tShowid) {
		this.tShowid = tShowid;
	}
	/**
	 * 获取：场次ID
	 */
	public String getTShowid() {
		return tShowid;
	}
	/**
	 * 设置：场次开始日期
	 */
	public void setTShowsdate(Date tShowsdate) {
		this.tShowsdate = tShowsdate;
	}
	/**
	 * 获取：场次开始日期
	 */
	public Date getTShowsdate() {
		return tShowsdate;
	}
	/**
	 * 设置：场次结束日期
	 */
	public void setTShowedate(Date tShowedate) {
		this.tShowedate = tShowedate;
	}
	/**
	 * 获取：场次结束日期
	 */
	public Date getTShowedate() {
		return tShowedate;
	}
	/**
	 * 设置：演出开始时间
	 */
	public void setTShowstime(String tShowstime) {
		this.tShowstime = tShowstime;
	}
	/**
	 * 获取：演出开始时间
	 */
	public String getTShowstime() {
		return tShowstime;
	}
	/**
	 * 设置：演出结束时间
	 */
	public void setTShowetime(String tShowetime) {
		this.tShowetime = tShowetime;
	}
	/**
	 * 获取：演出结束时间
	 */
	public String getTShowetime() {
		return tShowetime;
	}
	/**
	 * 设置：酒店开始时间
	 */
	public void setHotelSdate(String hotelSdate) {
		this.hotelSdate = hotelSdate;
	}
	/**
	 * 获取：酒店开始时间
	 */
	public String getHotelSdate() {
		return hotelSdate;
	}
	/**
	 * 设置：酒店结束时间
	 */
	public void setHotelEdate(String hotelEdate) {
		this.hotelEdate = hotelEdate;
	}
	/**
	 * 获取：酒店结束时间
	 */
	public String getHotelEdate() {
		return hotelEdate;
	}
	/**
	 * 设置：分配日期
	 */
	public void setDPdate(String dPdate) {
		this.dPdate = dPdate;
	}
	/**
	 * 获取：分配日期
	 */
	public String getDPdate() {
		return dPdate;
	}
	/**
	 * 设置：剧目id
	 */
	public void setTrepId(String trepId) {
		this.trepId = trepId;
	}
	/**
	 * 获取：剧目id
	 */
	public String getTrepId() {
		return trepId;
	}
	/**
	 * 设置：票档信息列表
	 */
	public void setTareas(String tareas) {
		this.tareas = tareas;
	}
	/**
	 * 获取：票档信息列表
	 */
	public String getTareas() {
		return tareas;
	}
	/**
	 * 设置：可入园次数,默认等于门票的入园次数
	 */
	public void setVerifCount(Integer verifCount) {
		this.verifCount = verifCount;
	}
	/**
	 * 获取：可入园次数,默认等于门票的入园次数
	 */
	public Integer getVerifCount() {
		return verifCount;
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

	public Integer getIfRefund() {
		return ifRefund;
	}

	public void setIfRefund(Integer ifRefund) {
		this.ifRefund = ifRefund;
	}
}
