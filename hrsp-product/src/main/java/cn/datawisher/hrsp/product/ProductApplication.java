package cn.datawisher.hrsp.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ClassName ProductApplication
 * @Description 
 * @Author Jim Han
 * @Date 2020/2/18
 * @Version V1.0
 **/
@MapperScan("cn.datawisher")
@SpringBootApplication
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}
