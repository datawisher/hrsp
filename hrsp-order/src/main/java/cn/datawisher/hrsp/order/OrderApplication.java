package cn.datawisher.hrsp.order;

import cn.datawisher.hrsp.order.configuration.GlobalFeignConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName OrderApplication
 * @Description 
 * @Author Jim Han
 * @Date 2020/2/23
 * @Version V1.0
 **/
@EnableFeignClients(defaultConfiguration = GlobalFeignConfiguration.class)
@SpringBootApplication(scanBasePackages = {"cn.datawisher.hrsp", "cn.datawisher.common"})
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
