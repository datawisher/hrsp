package cn.datawisher.hrsp.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName StaffApplication
 * @Description 
 * @Author Jim Han
 * @Date 2020/2/18
 * @Version V1.0
 **/
@MapperScan("cn.datawisher.hrsp.user.dao") // 扫mapper接口，不能扫到sevice层，否则会报错
@SpringBootApplication(scanBasePackages = {"cn.datawisher.hrsp", "cn.datawisher.common"})
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
