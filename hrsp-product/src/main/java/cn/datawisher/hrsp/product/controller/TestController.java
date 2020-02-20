package cn.datawisher.hrsp.product.controller;

import cn.datawisher.hrsp.product.dao.ProductMapper;
import cn.datawisher.hrsp.product.domain.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName TestController
 * @Description 
 * @Author Jim Han
 * @Date 2020/2/18
 * @Version V1.0
 **/
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TestController {

    private final ProductMapper productMapper;

    @GetMapping("/echo")
    public List<Product> echo() {
        return productMapper.selectAll();
    }
}
