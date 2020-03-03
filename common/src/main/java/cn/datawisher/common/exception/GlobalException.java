package cn.datawisher.common.exception;

import cn.datawisher.common.ResultCode;
import cn.datawisher.common.http.HttpResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ClassName GlobalException
 * @Description 
 * @Author Jim Han
 * @Date 2020/3/3
 * @Version V1.0
 **/
@Slf4j
@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(CustomException.class)
    public HttpResult customException(CustomException ce) {
        log.error("发生自定义异常", ce.getMessage());
        ResultCode resultCode = ce.getResultCode();
        return HttpResult.error(resultCode);
    }

    @ExceptionHandler(Exception.class)
    public HttpResult exception(Exception e) {
        log.error("发生系统异常", e.getMessage());
        return HttpResult.error();
    }
}
