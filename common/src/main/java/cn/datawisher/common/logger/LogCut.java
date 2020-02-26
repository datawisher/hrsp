package cn.datawisher.common.logger;

import java.lang.annotation.*;

/**
 * @ClassName LogCut
 * @Description 日志出入参注解
 * @Author Jim Han
 * @Date 2019/12/4
 * @Version V1.0
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogCut {

    String value() default "";
}
