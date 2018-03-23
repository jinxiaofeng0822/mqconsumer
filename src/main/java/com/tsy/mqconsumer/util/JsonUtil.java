package com.tsy.mqconsumer.util;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * json工具类，主要使用Gson
 * 
 * @author jinxf
 *
 */
public class JsonUtil {
	private static final Logger log = LoggerFactory.getLogger(JsonUtil.class);

	/**
	 * 对象转json字符串，日期格式化yyyy-MM-dd HH:mm:ss
	 * 
	 * @param obj
	 *            对象
	 * @return json字符串
	 */
	public static String toJsonStr(Object obj) {
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").serializeNulls().create();
		String str = gson.toJson(obj);
		log.info(str);
		return str;
	}

	/**
	 * 对象转json字符串，日期格式化
	 * 
	 * @param obj
	 *            对象
	 * @param dateFormat
	 * @return json字符串
	 */
	public static String toJsonStr(Object obj, String dateFormat) {
		Gson gson = new GsonBuilder().setDateFormat(dateFormat).serializeNulls().create();
		String str = gson.toJson(obj);
		log.info(str);
		return str;
	}

	/**
	 * 创建简单的返回码
	 * 
	 * @param errCode
	 *            错误码，0000代表成功
	 * @param errMsg
	 *            错误信息
	 * @return 返回json格式的字符串
	 */
	public static String returnErrCode(String errCode, String errMsg) {
		JsonObject err = new JsonObject();
		err.addProperty("errCode", errCode);
		err.addProperty("errMsg", errMsg);
		String str = err.toString();
		log.info("返回码" + str);
		return str;
	}

	/**
	 * 
	 * @param errCode
	 *            错误码，0000代表成功
	 * @param errMsg
	 *            错误信息
	 * @param map
	 *            返回的其他信息
	 * @return
	 */
	public static String returnErrCode(String errCode, String errMsg, Map<String, String> map) {
		JsonObject err = new JsonObject();
		err.addProperty("errCode", errCode);
		err.addProperty("errMsg", errMsg);

		for (String key : map.keySet()) {
			err.addProperty(key, map.get(key));
		}
		String str = err.toString();
		log.info("返回码" + str);
		return str;
	}

	/**
	 * 创建返回码,带有其他信息
	 * 
	 * @param errCode
	 *            错误码，0000代表成功
	 * @param errMsg
	 *            错误信息
	 * @param keyName
	 *            信息键名
	 * @param obj
	 *            具体对象信息
	 * @return 返回json格式的字符串
	 */
	public static String returnErrCode(String errCode, String errMsg, String keyName, Object obj) {
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").serializeNulls().create();

		JsonObject err = new JsonObject();
		err.addProperty("errCode", errCode);
		err.addProperty("errMsg", errMsg);
		if (obj != null) {
			String str = gson.toJson(obj);
			try {
				JsonObject info = new JsonParser().parse(str).getAsJsonObject();
				err.add(keyName, info);
			} catch (IllegalStateException e) {
				JsonArray info = new JsonParser().parse(str).getAsJsonArray();
				err.add(keyName, info);
			}
		} else {
			err.add(keyName, null);
		}
		String resultStr = err.toString();
		return resultStr;
	}

	/**
	 * 创建返回码,带有其他信息
	 * 
	 * @param errCode
	 *            错误码，0000代表成功
	 * @param errMsg
	 *            错误信息
	 * @param keyName
	 *            信息键名
	 * @param obj
	 *            具体对象信息
	 * @param dateFormat
	 *            日期格式
	 * @return 返回json格式的字符串
	 */
	public static String returnErrCode(String errCode, String errMsg, String keyName, Object obj, String dateFormat) {
		Gson gson = new GsonBuilder().setDateFormat(dateFormat).serializeNulls().create();

		JsonObject err = new JsonObject();
		err.addProperty("errCode", errCode);
		err.addProperty("errMsg", errMsg);
		if (obj != null) {
			String str = gson.toJson(obj);
			try {
				JsonObject info = new JsonParser().parse(str).getAsJsonObject();
				err.add(keyName, info);
			} catch (IllegalStateException e) {
				JsonArray info = new JsonParser().parse(str).getAsJsonArray();
				err.add(keyName, info);
			}
		} else {
			err.add(keyName, null);
		}

		String resultStr = err.toString();
		return resultStr;
	}

	/**
	 * 对象转json，日期格式yyyy-MM-dd HH:mm:ss
	 * 
	 * @param obj
	 * @return
	 */
	public static String object2Json(Object obj) {
		Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").serializeNulls().create();
		return gson.toJson(obj);
	}

	/**
	 * 对象转json，日期格式
	 * 
	 * @param obj
	 * @return
	 */
	public static String object2Json(Object obj, String dateFormat) {
		Gson gson = new GsonBuilder().setDateFormat(dateFormat).serializeNulls().create();
		return gson.toJson(obj);
	}


}
