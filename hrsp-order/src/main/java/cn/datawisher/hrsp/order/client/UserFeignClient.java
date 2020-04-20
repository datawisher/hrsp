package cn.datawisher.hrsp.order.client;

import cn.datawisher.common.http.HttpResult;
import cn.datawisher.hrsp.order.configuration.UserFeignConfiguration;
import cn.datawisher.hrsp.order.domain.dto.StaffDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName UserFeign
 * @Description 
 * @Author Jim Han
 * @Date 2020/2/26
 * @Version V1.0
 **/
//@FeignClient(name = "user", configuration = {UserFeignConfiguration.class})
@FeignClient(name = "user")
public interface UserFeignClient {

    @RequestMapping("/v1/staffs/{id}")
    HttpResult findStaffById(@PathVariable(name = "id") Integer id);

}
