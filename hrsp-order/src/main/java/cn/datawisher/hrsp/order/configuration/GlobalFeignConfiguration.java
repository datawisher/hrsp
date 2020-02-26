package cn.datawisher.hrsp.order.configuration;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName GlobalFeignConfiguration
 * @Description feign的全局配置类
 * @Author Jim Han
 * @Date 2020/2/26
 * @Version V1.0
 **/
public class GlobalFeignConfiguration {

    @Bean
    public Logger.Level level() {
        return Logger.Level.FULL;
    }
}
