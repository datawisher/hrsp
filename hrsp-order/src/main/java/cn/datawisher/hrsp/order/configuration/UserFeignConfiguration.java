package cn.datawisher.hrsp.order.configuration;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName UserConfiguration
 * @Description feign的配置类
 * @Author Jim Han
 * @Date 2020/2/26
 * @Version V1.0
 **/
public class UserFeignConfiguration {

    @Bean
    public Logger.Level level() {
        return Logger.Level.FULL;
    }
}
