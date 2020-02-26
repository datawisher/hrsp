package cn.datawisher.common.logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @ClassName LogAspect
 * @Description 日志切面
 * @Author Jim Han
 * @Date 2019/12/4
 * @Version V1.0
 **/
@Aspect
@Component
@Slf4j
public class LogAspect {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Around("within(cn.datawisher..*) && @annotation(logCut)")
    public Object around(ProceedingJoinPoint joinPoint, LogCut logCut) throws Throwable {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = StringUtils.isEmpty(logCut.value()) ? joinPoint.getSignature().getName() : logCut.value();
        long startTime = System.currentTimeMillis();
        log.info("{} 方法开始, 入参: {} ", className + "::" + methodName, objectMapper.writeValueAsString(joinPoint.getArgs()));
        Object result = joinPoint.proceed();
        long costTime = System.currentTimeMillis() - startTime;
        log.info("{} 方法结束, 出参: {} , 耗时：{}ms", className + "::" + methodName, objectMapper.writeValueAsString(result), costTime);
        return result;
    }

    @AfterThrowing(pointcut = "within(cn.datawisher..*) && @annotation(logCut)", throwing = "ex")
    public void addAfterThrowingLogger(JoinPoint joinPoint, LogCut logCut, Exception ex) {
        if (log.isInfoEnabled()) {
            String className = joinPoint.getTarget().getClass().getSimpleName();
            String methodName = StringUtils.isEmpty(logCut.value()) ? joinPoint.getSignature().getName() : logCut.value();
            log.error("{} 方法异常", className + "::" + methodName, ex);
        }
    }
}
