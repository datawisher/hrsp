package cn.datawisher.hrsp.user.controller;

import cn.datawisher.hrsp.user.service.impl.StaffServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @ClassName StaffControllerTest
 * @Description 
 * @Author Jim Han
 * @Date 2020/2/21
 * @Version V1.0
 **/
//@RunWith(SpringRunner.class)
public class StaffMockTest {

    private MockMvc mvc;

    @Mock
    //要mock被测类中依赖的对象使用@Mock注解
    private StaffServiceImpl serviceImpl;

    @InjectMocks
    //被测类本身使用@InjectMocks注解
    private StaffController controller;

    @Before
    public void setup() {
        //初始化
        MockitoAnnotations.initMocks(this);
        //构建mvc环境
        mvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void testFindAll() throws Exception {

        //模拟接口调用
        this.mvc.perform(MockMvcRequestBuilders.get("/v1/staffs")
                .accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk());
    }
}

