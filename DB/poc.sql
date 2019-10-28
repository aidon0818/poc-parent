/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.7.21-log : Database - poc
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`poc` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `poc`;

/*Table structure for table `hotel_info` */

DROP TABLE IF EXISTS `hotel_info`;

CREATE TABLE `hotel_info` (
  `row_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `hotel_id` varchar(32) DEFAULT NULL COMMENT '产品id',
  `hotel_name` varchar(128) DEFAULT NULL COMMENT '房型名称',
  `hotel_desc` varchar(128) DEFAULT NULL COMMENT '房型描述',
  `hotel_price` decimal(18,2) DEFAULT NULL COMMENT '标准价',
  `hotel_vip_price` decimal(18,2) DEFAULT NULL COMMENT '会员价',
  `hotel_begin_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '可入住开始时间',
  `hotel_end_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '可入住结束时间',
  `hotel_breakfast` varchar(128) DEFAULT NULL COMMENT '是否含早餐',
  `hotel_person_num` int(11) DEFAULT NULL COMMENT '入住人数',
  `hotel_bed_type` varchar(128) DEFAULT NULL COMMENT '床型',
  `hotel_acreage` varchar(128) DEFAULT NULL COMMENT '建筑面积',
  `hotel_floor` varchar(16) DEFAULT NULL COMMENT '楼层',
  `hotel_scenery` varchar(128) DEFAULT NULL COMMENT '景观',
  `hotel_window` varchar(128) DEFAULT NULL COMMENT '窗户',
  `hotel_if_beds` varchar(128) DEFAULT NULL COMMENT '是否加床',
  `hotel_deposit` decimal(18,2) DEFAULT NULL COMMENT '押金',
  `hotel_integral` int(11) DEFAULT NULL COMMENT '是否赠送积分',
  `hotel_remark` varchar(128) DEFAULT NULL COMMENT '备注',
  `hotel_enclosure` varchar(128) DEFAULT NULL COMMENT '附件服务/产品',
  `hotel_if_cancel` varchar(128) DEFAULT NULL COMMENT '是否可取消',
  `hotel_if_cancel_code` int(11) DEFAULT NULL COMMENT '是否可取消code',
  `hotel_stock` int(11) DEFAULT NULL COMMENT '库存',
  `hotel_pic` varchar(128) DEFAULT NULL COMMENT '图片',
  `status` int(11) DEFAULT NULL COMMENT '状态：0-无效 ，1-有效',
  `version` int(11) DEFAULT NULL COMMENT '版本',
  PRIMARY KEY (`row_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

/*Table structure for table `order_finish_info` */

DROP TABLE IF EXISTS `order_finish_info`;

CREATE TABLE `order_finish_info` (
  `row_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `item_type` varchar(2) DEFAULT NULL COMMENT '订单状态（F：已释放订单，N:未付款，S:已付款）',
  `order_id` varchar(32) DEFAULT NULL COMMENT 'id',
  `order_no` varchar(32) DEFAULT NULL COMMENT '环企订单号',
  `order_thirdparty_no` varchar(32) DEFAULT NULL COMMENT '第三方订单号',
  `item_id` varchar(32) DEFAULT NULL COMMENT '环企明细ID',
  `dorderitems_thirdpartyid` varchar(32) DEFAULT NULL COMMENT '第三方明细ID',
  `order_ownerid` varchar(32) DEFAULT NULL COMMENT '下单企业ID',
  `orderitems_amout` decimal(18,2) DEFAULT NULL COMMENT '明细金额',
  `product_name` varchar(64) DEFAULT NULL COMMENT '产品名称',
  `itemType` varchar(2) DEFAULT NULL COMMENT '明细状态（F：已释放订单，N:未付款，S:已付款）',
  `e_code` varchar(32) DEFAULT NULL COMMENT '电子串码',
  `version` int(11) DEFAULT NULL COMMENT '版本',
  PRIMARY KEY (`row_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Table structure for table `order_info` */

DROP TABLE IF EXISTS `order_info`;

CREATE TABLE `order_info` (
  `row_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `order_no` varchar(32) DEFAULT NULL COMMENT '第三方订单号',
  `item_id` varchar(32) DEFAULT NULL COMMENT '第三方订单明细ID',
  `product_id` varchar(32) DEFAULT NULL COMMENT '产品id',
  `product_code` varchar(32) DEFAULT NULL COMMENT '产品编码',
  `product_name` varchar(64) DEFAULT NULL COMMENT '产品名称',
  `product_price` decimal(18,2) DEFAULT NULL COMMENT '产品单价',
  `product_count` int(11) DEFAULT NULL COMMENT '产品数量',
  `product_sdate` varchar(32) DEFAULT NULL COMMENT '游玩日期开始',
  `product_edate` varchar(32) DEFAULT NULL COMMENT '游玩日期结束',
  `j_showid` varchar(32) DEFAULT NULL COMMENT '游客所选场次ID',
  `j_seatid` varchar(32) DEFAULT NULL COMMENT '游客所选座位ID',
  `lock_id` varchar(32) DEFAULT NULL COMMENT '锁座ID',
  `link_name` varchar(32) DEFAULT NULL COMMENT '游玩人姓名',
  `link_phone` varchar(32) DEFAULT NULL COMMENT '游玩人手机号',
  `link_ICNO` varchar(32) DEFAULT NULL COMMENT '游玩人身份证号',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建日期（年月日时分秒）',
  `order_type` int(11) DEFAULT NULL COMMENT '订单类型：0消费，1退款',
  `ota_order_no` varchar(32) DEFAULT NULL COMMENT '接口第三方订单号',
  `status` int(11) DEFAULT NULL COMMENT '状态',
  `version` int(11) DEFAULT NULL COMMENT '版本',
  PRIMARY KEY (`row_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Table structure for table `product_info` */

DROP TABLE IF EXISTS `product_info`;

CREATE TABLE `product_info` (
  `row_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `park_id` varchar(32) DEFAULT NULL COMMENT '产品所属景区ID',
  `park_name` varchar(32) DEFAULT NULL COMMENT '产品所属景区名称',
  `t_id` varchar(32) DEFAULT NULL COMMENT '产品ID',
  `t_code` varchar(32) DEFAULT NULL COMMENT '产品编码',
  `t_name` varchar(32) DEFAULT NULL COMMENT '产品名称',
  `t_pdtprice` decimal(18,2) DEFAULT NULL COMMENT '产品门市价',
  `t_dispdtprice` decimal(18,2) DEFAULT NULL COMMENT '产品协议结算价',
  `t_locid` varchar(32) DEFAULT NULL COMMENT '场地ID',
  `t_locname` varchar(32) DEFAULT NULL COMMENT '场地名称',
  `t_showid` varchar(32) DEFAULT NULL COMMENT '场次ID',
  `t_showsdate` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '场次开始日期',
  `t_showedate` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '场次结束日期',
  `t_showstime` varchar(32) DEFAULT NULL COMMENT '演出开始时间',
  `t_showetime` varchar(32) DEFAULT NULL COMMENT '演出结束时间',
  `hotel_sdate` varchar(32) DEFAULT NULL COMMENT '酒店开始时间',
  `hotel_edate` varchar(32) DEFAULT NULL COMMENT '酒店结束时间',
  `d_pdate` varchar(32) DEFAULT NULL COMMENT '分配日期',
  `trep_id` varchar(32) DEFAULT NULL COMMENT '剧目id',
  `tareas` text COMMENT '票档信息列表',
  `verif_count` int(11) DEFAULT NULL COMMENT '可入园次数,默认等于门票的入园次数',
  `if_refund` int(11) DEFAULT NULL COMMENT '是否允许自助退款；0-不可以，1-可以',
  `status` int(11) DEFAULT NULL COMMENT '状态：0-无效 ，1-有效',
  `version` int(11) DEFAULT NULL COMMENT '版本',
  PRIMARY KEY (`row_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

/*Table structure for table `product_relate_info` */

DROP TABLE IF EXISTS `product_relate_info`;

CREATE TABLE `product_relate_info` (
  `row_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_id` varchar(32) DEFAULT NULL COMMENT '产品id',
  `commodity_id` varchar(32) DEFAULT NULL COMMENT '商品id',
  `status` int(11) DEFAULT NULL COMMENT '状态：0-失效，1-有效',
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`row_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

/*Table structure for table `product_reserve_info` */

DROP TABLE IF EXISTS `product_reserve_info`;

CREATE TABLE `product_reserve_info` (
  `row_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `opera_name` varchar(64) DEFAULT NULL COMMENT '剧目名称',
  `area_name` varchar(64) DEFAULT NULL COMMENT '区域名称',
  `loc_name` varchar(64) DEFAULT NULL COMMENT '演播厅名称',
  `show_stime` varchar(16) DEFAULT NULL COMMENT '演出开始时间',
  `show_etime` varchar(16) DEFAULT NULL COMMENT '演出结束时间',
  `sea_tid` varchar(3) DEFAULT NULL COMMENT '座位编号',
  `seatrow_colnum` varchar(64) DEFAULT NULL COMMENT '座位行列名称',
  `thirdItem_id` varchar(32) DEFAULT NULL COMMENT '第三方明细号',
  `version` int(11) DEFAULT NULL COMMENT '版本',
  PRIMARY KEY (`row_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Table structure for table `ticket_info` */

DROP TABLE IF EXISTS `ticket_info`;

CREATE TABLE `ticket_info` (
  `row_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `park_id` varchar(32) DEFAULT NULL COMMENT '产品所属景区ID',
  `park_name` varchar(64) DEFAULT NULL COMMENT '产品所属景区名称',
  `t_id` varchar(32) DEFAULT NULL COMMENT '产品ID',
  `t_code` varchar(32) DEFAULT NULL COMMENT '产品编码',
  `t_name` varchar(64) DEFAULT NULL COMMENT '产品名称',
  `t_type` varchar(2) DEFAULT NULL COMMENT '产品业态00门票 04剧院票',
  `t_kind` varchar(1) DEFAULT NULL COMMENT '产品类型0:单票，1：联票（乐+乐）2：联票（乐+剧院）',
  `t_des` varchar(200) DEFAULT NULL COMMENT '产品描述（200字内）',
  `tv_type` varchar(32) DEFAULT NULL COMMENT '产品有效期类型  0有效期段、1有效期天数1对应TICKET_VDAY，如：今天4月12号，TICKET_VDAY=2，游客选择游玩日期4月12号，则：游客在4月12号和4月13号都可入园0对应TICKET_SDATE与TICKET_EDATE，如：今天4月12号，TICKET_SDATE=4月1号/ TICKET_EDATE=4月30号，游客选择游玩日期4月12号，则：游客在4月12号和4月30号范围内都可入园\r\n            ',
  `tv_day` varchar(2) DEFAULT NULL COMMENT '有效天数，游客选择游玩日期开始+有效天数的范围内都可入园',
  `ts_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '有效期区间，区间开始日期，游客选择游玩日期开始至有效区间结束日期的范围内都可入园',
  `t_price` decimal(18,2) DEFAULT NULL COMMENT '标准价',
  `t_vip_price` decimal(18,2) DEFAULT NULL COMMENT '会员价',
  `te_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '有效期区间，区间结束日期，游客选择游玩日期开始至有效区间结束日期的范围内都可入园',
  `t_notice` varchar(200) DEFAULT NULL COMMENT '产品入园须知（200字内）',
  `ts_time` varchar(16) DEFAULT NULL COMMENT '景区营业开始时间，如开园时间8：30',
  `te_time` varchar(16) DEFAULT NULL COMMENT '景区营业结束时间，如闭园时间17：30',
  `ts_minnum` varchar(3) DEFAULT NULL COMMENT '产品最小起订数/单',
  `ts_maxnum` varchar(3) DEFAULT NULL COMMENT '产品最大限定数/单',
  `tv_delay` varchar(64) DEFAULT NULL COMMENT '产品时效性说明',
  `t_isrefund` varchar(1) DEFAULT NULL COMMENT '产品是否可退  0否 1是',
  `tr_days` varchar(8) DEFAULT NULL COMMENT '提前N天可退',
  `to_refund` varchar(1) DEFAULT NULL COMMENT '产品过期是否可退  0否 1是',
  `to_days` varchar(2) DEFAULT NULL COMMENT '过期N天不可退',
  `trequire_idcard` varchar(1) DEFAULT NULL COMMENT '下单时身份证是否必填 0否 1是',
  `trep_id` varchar(32) DEFAULT NULL COMMENT '剧目ID',
  `trep_name` varchar(64) DEFAULT NULL COMMENT '剧目名称',
  `trep_content` varchar(200) DEFAULT NULL COMMENT '剧目详情介绍',
  `tarea_id` varchar(32) DEFAULT NULL COMMENT '票档ID',
  `tarea_name` varchar(64) DEFAULT NULL COMMENT '票档名称',
  `verifs` text,
  `verif_count` int(11) DEFAULT NULL COMMENT '可入人次',
  `status` int(11) DEFAULT NULL COMMENT '状态：0-无效 ，1-有效',
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`row_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
