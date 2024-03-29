package com.github.wxiaoqi.security.common.util;

import java.util.HashMap;
import java.util.Map;

public class MapContants {

	/**处理成功 */
    public static final  String MSG_CODE_000000 = "000000";   //处理成功
    
    /**消息数据重复 */
    public static final  String MSG_CODE_100000 = "100000";   //消息数据重复
    
    /**查询无此记录 */
    public static final  String MSG_CODE_100001 = "100001";   //查询无此记录
    
    /**缺少查询必要的条件 */
    public static final  String MSG_CODE_100002 = "100002";   //缺少查询必要的条件
    
    /**服务器异常 */
    public static final  String MSG_CODE_000001 = "000001";   //服务器异常
    /**处理超时 */
    public static final  String MSG_CODE_000002 = "000002";   //处理超时
    /**未登陆或会话超时 */
    public static final  String MSG_CODE_888888 = "888888";   //未登陆或会话超时
    /**权限不足 */
    public static final  String MSG_CODE_888999 = "888999";   //权限不足
    /**处理失败 */
    public static final  String MSG_CODE_999999 = "999999";   //处理失败
    /**处理失败 */
    public static final  String MSG_CODE_300000 = "300000";

    public static final  String MSG_CODE_110001 = "110001";
     /**已审核*/
    public static final  String MSG_CODE_110002 = "110002";   //服务不支持
    // /**已审核*/
    public static final  String MSG_CODE_110003= "110003";   //服务不支持

    public static final  String MSG_CODE_110004= "110004";   //服务不支持

    public static final  String MSG_CODE_110005= "110005";   //服务不支持
    public static final  String MSG_CODE_110006= "110006";   //服务不支持

	
    /**
	 * 系统状态Map
	 */
    public static final Map<String, String> SysStatusMap = new HashMap<String, String>();
    
    /**
	 * 处理码Map
	 */
    public static final Map<String, String> MessageCodeMap = new HashMap<String, String>();
    
    
    static{
        
    	MessageCodeMap.put(MSG_CODE_999999, "处理失败");
    	MessageCodeMap.put(MSG_CODE_000000, "处理成功");
    	MessageCodeMap.put(MSG_CODE_000001, "服务器异常");
    	MessageCodeMap.put(MSG_CODE_000002, "处理超时");
    	MessageCodeMap.put(MSG_CODE_888999, "权限不足");
    	MessageCodeMap.put(MSG_CODE_888888, "未登陆或会话超时");
    	MessageCodeMap.put(MSG_CODE_100000, "消息数据重复，已丢弃");
    	MessageCodeMap.put(MSG_CODE_300000, "不支持的服务");
    	MessageCodeMap.put(MSG_CODE_100001, "查询无此记录");
    	MessageCodeMap.put(MSG_CODE_100002, "缺少查询必要的条件");
    	MessageCodeMap.put(MSG_CODE_110001, "该手机已经注册");
    	MessageCodeMap.put(MSG_CODE_110002, "已审核");
    	MessageCodeMap.put(MSG_CODE_110003, "没有注册token");
    	MessageCodeMap.put(MSG_CODE_110004, "图片上传至微信失败");
    	MessageCodeMap.put(MSG_CODE_110005, "商户已经注册卡");
    	MessageCodeMap.put(MSG_CODE_110006, "商户注册微信token失败");

    }
    
    public static final String getMessage(String code){
    	return MessageCodeMap.get(code);
    }
    
}
