package com.github.wxiaoqi.security.common.util;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * @Auther: ld
 * @Date: 2019/10/28 10:03
 * @Param ${tags}
 * @Description: 生成num
 */
public class SeqUtil {
	private static final String ORDER_NO = "O";//订单
	private static final String HOTEL_NO = "H";//酒店
	private static final String TICKET_NO = "T";//门票id
	private static final String TICKET_CODE = "TC";//门票code

	public static String getHotelNo() {
		String hotelNo = "";
		String num = getSeqNo();
		hotelNo = HOTEL_NO.concat(num);
		return hotelNo;
	}

	public static String getTicketNo() {
		String ticketNo = "";
		String num = getSeqNo();
		ticketNo = TICKET_NO.concat(num);
		return ticketNo;
	}

	public static String getTicketCode() {
		String ticketCode = "";
		String num = getSeqNo();
		ticketCode = TICKET_CODE.concat(num);
		return ticketCode;
	}

	public static String getOrderNo() {
		String orderNo = "";
		String num = getSeqNo();
		orderNo = ORDER_NO.concat(num);
		return orderNo;
	}

	public static String getSeqNo() {
		StringBuilder builder = new StringBuilder();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
		String dateTime = LocalDateTime.now(ZoneOffset.of("+8")).format(formatter);
		//随机数6位
		int i = (int) ((Math.random() * 9 + 1) * 100000);
		String myStr = Integer.toString(i);
		builder.append(dateTime).append(myStr);
		return builder.toString();
	}

	public static void main(String[] args) {
		String or = getTicketCode();
		System.out.println(or);
	}
}
