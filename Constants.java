package com.certus.osa.constant;

public class Constants {
    public static final String RESOURCE_SERVER_NAME = "oauth-server";
    public static final String INVALID_CLIENT_ID = "Client validate false, for client_id/client_secret.";
    public static final String INVALID_ACCESS_TOKEN = "AccessToken invalid or expired .";
    public static final String INVALID_REDIRECT_URI = "Missing callback address after successful authorization.";
    public static final String INVALID_AUTH_CODE = "Bad authorization code.";
    // 验证accessToken
    public static final String CHECK_ACCESS_CODE_URL = "http://localhost:8080/northinterface/checkAccessToken?accessToken=";
    
    public static final long TOKEN_VALID_SECONDS = 2592000; //生成的token有效期30天
    
    public static final String QUERY_RESULT_SUCCESS = "0"; //成功标志
    public static final String QUERY_RESULT_FAIL = "1"; //失败标志
    
    public static final String CMCC_SOURCE_DATA_FLAG_KEY = "cmcc_source_data_flag_key"; //请求原始数据标识：0 开启；1 停止
    public static final String CMCC_DATA_FLAG_ON = "0";
    public static final String CMCC_DATA_FLAG_OFF = "1";
    
    //错误编码
    public static final String ERROR_PARAM = "40001"; //请求参数错误
    public static final String ERROR_REQUEST_MESSAGE = "40002"; //请求报文格式错误
    public static final String ERROR_TOKEN_ILLEGAL = "40003"; //请求的Token非法
    public static final String ERROR_TOKEN_EXPIRED = "40004"; //Token过期
    public static final String ERROR_THIRD_IP = "40005"; //调用方IP无接口访问权限
    public static final String ERROR_THIRD_INTERFACE = "40006"; //调用方无该接口访问权限
    public static final String ERROR_THIRD_SERVER = "40007"; //被调用方服务器错误
    public static final String ERROR_CITYCODE = "40008"; //城市编码错误
    public static final String ERROR_MANU = "40009"; //厂商标识错误
    public static final String ERROR_OTHER = "40010"; //其它错误
    
    //1表示时报2表示日报3表示周报4表示月报
    public static final int REPORT_TYPE_HOUR = 1;
    public static final int REPORT_TYPE_DAY = 2;
}
