package cn.datawisher.common.http;

import cn.datawisher.common.ResultCode;

import java.io.Serializable;

/**
 * @ClassName HttpResult
 * @Description HTTP结果封装
 * @Author Jim Han
 * @Date 2020/2/20
 * @Version V1.0
 **/
public class HttpResult implements Serializable {

    private static final long serialVersionUID = 7542717818322823340L;
    private int code;
    private String msg;
    private Object data;

    public HttpResult(){}

    public HttpResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public HttpResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static HttpResult error() {
        return new HttpResult(ResultCode.SERVER_ERROR.getCode(), ResultCode.SERVER_ERROR.getMsg());
    }

    public static HttpResult error(ResultCode resultCode) {
        return new HttpResult(resultCode.getCode(), resultCode.getMsg());
    }

    public static HttpResult ok() {
        return new HttpResult(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg());
    }

    public static HttpResult ok(Object data) {
        return new HttpResult(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
