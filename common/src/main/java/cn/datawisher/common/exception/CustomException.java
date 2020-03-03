package cn.datawisher.common.exception;

import cn.datawisher.common.ResultCode;

/**
 * @ClassName CustomException
 * @Description 自定义异常
 * @Author Jim Han
 * @Date 2020/3/3
 * @Version V1.0
 **/
public class CustomException extends RuntimeException {

    ResultCode resultCode;

    public CustomException(ResultCode resultCode) {
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }
}
