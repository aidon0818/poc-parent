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
@Table(name = "ticket_info")
public class TicketInfo implements Serializable {
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
	
	    //产品业态00门票 04剧院票
    @Column(name = "t_type")
    private String tType;
	
	    //产品类型0:单票，1：联票（乐+乐）2：联票（乐+剧院）
    @Column(name = "t_kind")
    private String tKind;
	
	    //产品描述（200字内）
    @Column(name = "t_des")
    private String tDes;
	
	    //产品有效期类型  0有效期段、1有效期天数1对应TICKET_VDAY，如：今天4月12号，TICKET_VDAY=2，游客选择游玩日期4月12号，则：游客在4月12号和4月13号都可入园0对应TICKET_SDATE与TICKET_EDATE，如：今天4月12号，TICKET_SDATE=4月1号/ TICKET_EDATE=4月30号，游客选择游玩日期4月12号，则：游客在4月12号和4月30号范围内都可入园
            
    @Column(name = "tv_type")
    private String tvType;
	
	    //有效天数，游客选择游玩日期开始+有效天数的范围内都可入园
    @Column(name = "tv_day")
    private String tvDay;
	
	    //有效期区间，区间开始日期，游客选择游玩日期开始至有效区间结束日期的范围内都可入园
    @Column(name = "ts_date")
    private Date tsDate;
	
	    //标准价
    @Column(name = "t_price")
    private BigDecimal tPrice;
	
	    //会员价
    @Column(name = "t_vip_price")
    private BigDecimal tVipPrice;
	
	    //有效期区间，区间结束日期，游客选择游玩日期开始至有效区间结束日期的范围内都可入园
    @Column(name = "te_date")
    private Date teDate;
	
	    //产品入园须知（200字内）
    @Column(name = "t_notice")
    private String tNotice;
	
	    //景区营业开始时间，如开园时间8：30
    @Column(name = "ts_time")
    private String tsTime;
	
	    //景区营业结束时间，如闭园时间17：30
    @Column(name = "te_time")
    private String teTime;
	
	    //产品最小起订数/单
    @Column(name = "ts_minnum")
    private String tsMinnum;
	
	    //产品最大限定数/单
    @Column(name = "ts_maxnum")
    private String tsMaxnum;
	
	    //产品时效性说明
    @Column(name = "tv_delay")
    private String tvDelay;
	
	    //产品是否可退  0否 1是
    @Column(name = "t_isrefund")
    private String tIsrefund;
	
	    //提前N天可退
    @Column(name = "tr_days")
    private String trDays;
	
	    //产品过期是否可退  0否 1是
    @Column(name = "to_refund")
    private String toRefund;
	
	    //过期N天不可退
    @Column(name = "to_days")
    private String toDays;
	
	    //下单时身份证是否必填 0否 1是
    @Column(name = "trequire_idcard")
    private String trequireIdcard;
	
	    //剧目ID
    @Column(name = "trep_id")
    private String trepId;
	
	    //剧目名称
    @Column(name = "trep_name")
    private String trepName;
	
	    //剧目详情介绍
    @Column(name = "trep_content")
    private String trepContent;
	
	    //票档ID
    @Column(name = "tarea_id")
    private String tareaId;
	
	    //票档名称
    @Column(name = "tarea_name")
    private String tareaName;
	
	    //
    @Column(name = "verifs")
    private String verifs;
	
	    //可入人次
    @Column(name = "verif_count")
    private Integer verifCount;
	
	    //状态：0-无效 ，1-有效
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
	 * 设置：产品业态00门票 04剧院票
	 */
	public void setTType(String tType) {
		this.tType = tType;
	}
	/**
	 * 获取：产品业态00门票 04剧院票
	 */
	public String getTType() {
		return tType;
	}
	/**
	 * 设置：产品类型0:单票，1：联票（乐+乐）2：联票（乐+剧院）
	 */
	public void setTKind(String tKind) {
		this.tKind = tKind;
	}
	/**
	 * 获取：产品类型0:单票，1：联票（乐+乐）2：联票（乐+剧院）
	 */
	public String getTKind() {
		return tKind;
	}
	/**
	 * 设置：产品描述（200字内）
	 */
	public void setTDes(String tDes) {
		this.tDes = tDes;
	}
	/**
	 * 获取：产品描述（200字内）
	 */
	public String getTDes() {
		return tDes;
	}
	/**
	 * 设置：产品有效期类型  0有效期段、1有效期天数1对应TICKET_VDAY，如：今天4月12号，TICKET_VDAY=2，游客选择游玩日期4月12号，则：游客在4月12号和4月13号都可入园0对应TICKET_SDATE与TICKET_EDATE，如：今天4月12号，TICKET_SDATE=4月1号/ TICKET_EDATE=4月30号，游客选择游玩日期4月12号，则：游客在4月12号和4月30号范围内都可入园
            
	 */
	public void setTvType(String tvType) {
		this.tvType = tvType;
	}
	/**
	 * 获取：产品有效期类型  0有效期段、1有效期天数1对应TICKET_VDAY，如：今天4月12号，TICKET_VDAY=2，游客选择游玩日期4月12号，则：游客在4月12号和4月13号都可入园0对应TICKET_SDATE与TICKET_EDATE，如：今天4月12号，TICKET_SDATE=4月1号/ TICKET_EDATE=4月30号，游客选择游玩日期4月12号，则：游客在4月12号和4月30号范围内都可入园
            
	 */
	public String getTvType() {
		return tvType;
	}
	/**
	 * 设置：有效天数，游客选择游玩日期开始+有效天数的范围内都可入园
	 */
	public void setTvDay(String tvDay) {
		this.tvDay = tvDay;
	}
	/**
	 * 获取：有效天数，游客选择游玩日期开始+有效天数的范围内都可入园
	 */
	public String getTvDay() {
		return tvDay;
	}
	/**
	 * 设置：有效期区间，区间开始日期，游客选择游玩日期开始至有效区间结束日期的范围内都可入园
	 */
	public void setTsDate(Date tsDate) {
		this.tsDate = tsDate;
	}
	/**
	 * 获取：有效期区间，区间开始日期，游客选择游玩日期开始至有效区间结束日期的范围内都可入园
	 */
	public Date getTsDate() {
		return tsDate;
	}
	/**
	 * 设置：标准价
	 */
	public void setTPrice(BigDecimal tPrice) {
		this.tPrice = tPrice;
	}
	/**
	 * 获取：标准价
	 */
	public BigDecimal getTPrice() {
		return tPrice;
	}
	/**
	 * 设置：会员价
	 */
	public void setTVipPrice(BigDecimal tVipPrice) {
		this.tVipPrice = tVipPrice;
	}
	/**
	 * 获取：会员价
	 */
	public BigDecimal getTVipPrice() {
		return tVipPrice;
	}
	/**
	 * 设置：有效期区间，区间结束日期，游客选择游玩日期开始至有效区间结束日期的范围内都可入园
	 */
	public void setTeDate(Date teDate) {
		this.teDate = teDate;
	}
	/**
	 * 获取：有效期区间，区间结束日期，游客选择游玩日期开始至有效区间结束日期的范围内都可入园
	 */
	public Date getTeDate() {
		return teDate;
	}
	/**
	 * 设置：产品入园须知（200字内）
	 */
	public void setTNotice(String tNotice) {
		this.tNotice = tNotice;
	}
	/**
	 * 获取：产品入园须知（200字内）
	 */
	public String getTNotice() {
		return tNotice;
	}
	/**
	 * 设置：景区营业开始时间，如开园时间8：30
	 */
	public void setTsTime(String tsTime) {
		this.tsTime = tsTime;
	}
	/**
	 * 获取：景区营业开始时间，如开园时间8：30
	 */
	public String getTsTime() {
		return tsTime;
	}
	/**
	 * 设置：景区营业结束时间，如闭园时间17：30
	 */
	public void setTeTime(String teTime) {
		this.teTime = teTime;
	}
	/**
	 * 获取：景区营业结束时间，如闭园时间17：30
	 */
	public String getTeTime() {
		return teTime;
	}
	/**
	 * 设置：产品最小起订数/单
	 */
	public void setTsMinnum(String tsMinnum) {
		this.tsMinnum = tsMinnum;
	}
	/**
	 * 获取：产品最小起订数/单
	 */
	public String getTsMinnum() {
		return tsMinnum;
	}
	/**
	 * 设置：产品最大限定数/单
	 */
	public void setTsMaxnum(String tsMaxnum) {
		this.tsMaxnum = tsMaxnum;
	}
	/**
	 * 获取：产品最大限定数/单
	 */
	public String getTsMaxnum() {
		return tsMaxnum;
	}
	/**
	 * 设置：产品时效性说明
	 */
	public void setTvDelay(String tvDelay) {
		this.tvDelay = tvDelay;
	}
	/**
	 * 获取：产品时效性说明
	 */
	public String getTvDelay() {
		return tvDelay;
	}
	/**
	 * 设置：产品是否可退  0否 1是
	 */
	public void setTIsrefund(String tIsrefund) {
		this.tIsrefund = tIsrefund;
	}
	/**
	 * 获取：产品是否可退  0否 1是
	 */
	public String getTIsrefund() {
		return tIsrefund;
	}
	/**
	 * 设置：提前N天可退
	 */
	public void setTrDays(String trDays) {
		this.trDays = trDays;
	}
	/**
	 * 获取：提前N天可退
	 */
	public String getTrDays() {
		return trDays;
	}
	/**
	 * 设置：产品过期是否可退  0否 1是
	 */
	public void setToRefund(String toRefund) {
		this.toRefund = toRefund;
	}
	/**
	 * 获取：产品过期是否可退  0否 1是
	 */
	public String getToRefund() {
		return toRefund;
	}
	/**
	 * 设置：过期N天不可退
	 */
	public void setToDays(String toDays) {
		this.toDays = toDays;
	}
	/**
	 * 获取：过期N天不可退
	 */
	public String getToDays() {
		return toDays;
	}
	/**
	 * 设置：下单时身份证是否必填 0否 1是
	 */
	public void setTrequireIdcard(String trequireIdcard) {
		this.trequireIdcard = trequireIdcard;
	}
	/**
	 * 获取：下单时身份证是否必填 0否 1是
	 */
	public String getTrequireIdcard() {
		return trequireIdcard;
	}
	/**
	 * 设置：剧目ID
	 */
	public void setTrepId(String trepId) {
		this.trepId = trepId;
	}
	/**
	 * 获取：剧目ID
	 */
	public String getTrepId() {
		return trepId;
	}
	/**
	 * 设置：剧目名称
	 */
	public void setTrepName(String trepName) {
		this.trepName = trepName;
	}
	/**
	 * 获取：剧目名称
	 */
	public String getTrepName() {
		return trepName;
	}
	/**
	 * 设置：剧目详情介绍
	 */
	public void setTrepContent(String trepContent) {
		this.trepContent = trepContent;
	}
	/**
	 * 获取：剧目详情介绍
	 */
	public String getTrepContent() {
		return trepContent;
	}
	/**
	 * 设置：票档ID
	 */
	public void setTareaId(String tareaId) {
		this.tareaId = tareaId;
	}
	/**
	 * 获取：票档ID
	 */
	public String getTareaId() {
		return tareaId;
	}
	/**
	 * 设置：票档名称
	 */
	public void setTareaName(String tareaName) {
		this.tareaName = tareaName;
	}
	/**
	 * 获取：票档名称
	 */
	public String getTareaName() {
		return tareaName;
	}
	/**
	 * 设置：
	 */
	public void setVerifs(String verifs) {
		this.verifs = verifs;
	}
	/**
	 * 获取：
	 */
	public String getVerifs() {
		return verifs;
	}
	/**
	 * 设置：可入人次
	 */
	public void setVerifCount(Integer verifCount) {
		this.verifCount = verifCount;
	}
	/**
	 * 获取：可入人次
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
