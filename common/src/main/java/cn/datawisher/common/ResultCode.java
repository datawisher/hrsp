package cn.datawisher.common;

/**
 * @ClassName ResultCode
 * @Description 
 * @Author Jim Han
 * @Date 2020/3/3
 * @Version V1.0
 **/
public enum ResultCode {

    SUCCESS(true, 10000, "操作成功"),
    FAIL(false, 19999, "操作失败"),
    SERVER_ERROR(false, 99999,"系统繁忙，请稍后重试");

    boolean success;
    int code;
    String msg;

    ResultCode(boolean success, int code, String msg) {
        this.success = success;
        this.code = code;
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
