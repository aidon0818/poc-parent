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
@Table(name = "product_reserve_info")
public class ProductReserveInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Long rowId;
	
	    //剧目名称
    @Column(name = "opera_name")
    private String operaName;
	
	    //区域名称
    @Column(name = "area_name")
    private String areaName;
	
	    //演播厅名称
    @Column(name = "loc_name")
    private String locName;
	
	    //演出开始时间
    @Column(name = "show_stime")
    private String showStime;
	
	    //演出结束时间
    @Column(name = "show_etime")
    private String showEtime;
	
	    //座位编号
    @Column(name = "sea_tid")
    private String seaTid;
	
	    //座位行列名称
    @Column(name = "seatrow_colnum")
    private String seatrowColnum;
	
	    //第三方明细号
    @Column(name = "thirdItem_id")
    private String thirditemId;
	
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
	 * 设置：剧目名称
	 */
	public void setOperaName(String operaName) {
		this.operaName = operaName;
	}
	/**
	 * 获取：剧目名称
	 */
	public String getOperaName() {
		return operaName;
	}
	/**
	 * 设置：区域名称
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	/**
	 * 获取：区域名称
	 */
	public String getAreaName() {
		return areaName;
	}
	/**
	 * 设置：演播厅名称
	 */
	public void setLocName(String locName) {
		this.locName = locName;
	}
	/**
	 * 获取：演播厅名称
	 */
	public String getLocName() {
		return locName;
	}
	/**
	 * 设置：演出开始时间
	 */
	public void setShowStime(String showStime) {
		this.showStime = showStime;
	}
	/**
	 * 获取：演出开始时间
	 */
	public String getShowStime() {
		return showStime;
	}
	/**
	 * 设置：演出结束时间
	 */
	public void setShowEtime(String showEtime) {
		this.showEtime = showEtime;
	}
	/**
	 * 获取：演出结束时间
	 */
	public String getShowEtime() {
		return showEtime;
	}
	/**
	 * 设置：座位编号
	 */
	public void setSeaTid(String seaTid) {
		this.seaTid = seaTid;
	}
	/**
	 * 获取：座位编号
	 */
	public String getSeaTid() {
		return seaTid;
	}
	/**
	 * 设置：座位行列名称
	 */
	public void setSeatrowColnum(String seatrowColnum) {
		this.seatrowColnum = seatrowColnum;
	}
	/**
	 * 获取：座位行列名称
	 */
	public String getSeatrowColnum() {
		return seatrowColnum;
	}
	/**
	 * 设置：第三方明细号
	 */
	public void setThirditemId(String thirditemId) {
		this.thirditemId = thirditemId;
	}
	/**
	 * 获取：第三方明细号
	 */
	public String getThirditemId() {
		return thirditemId;
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
