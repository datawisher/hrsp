package cn.datawisher.hrsp.product.controller;

import cn.datawisher.common.http.HttpResult;
import cn.datawisher.common.logger.LogCut;
import cn.datawisher.common.page.PageRequest;
import cn.datawisher.common.page.PageResult;
import cn.datawisher.hrsp.product.domain.entity.Product;
import cn.datawisher.hrsp.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @ClassName ProductController
 * @Description 
 * @Author Jim Han
 * @Date 2020/2/23
 * @Version V1.0
 **/
@RestController
@RequestMapping("/v1/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @LogCut
    @GetMapping("{id}")
    public HttpResult findById(@PathVariable(name = "id") Integer id) {
        Product product = productService.findById(id);
        return HttpResult.ok(product);
    }

    @LogCut
    @GetMapping
    public HttpResult findAll() {
        List<Product> products = productService.findAll();
        return HttpResult.ok(products);
    }

    @LogCut
    @GetMapping(params = {"page", "size"})
    public HttpResult findByPage(@RequestParam final Integer page, @RequestParam final Integer size) {
        PageRequest pageRequest = new PageRequest(page, size);
        PageResult result = productService.findByPage(pageRequest);
        return HttpResult.ok(result);
    }

    @LogCut
    @PostMapping
    public HttpResult addProduct(@RequestBody Product product) {
        product.setCreateDate(new Date());
        productService.addProduct(product);
        return HttpResult.ok();
    }

    @LogCut
    @PutMapping
    public HttpResult editProduct(@RequestBody Product product) {
        product.setUpdateDate(new Date());
        productService.editProduct(product);
        return HttpResult.ok();
    }

    @LogCut
    @DeleteMapping
    public HttpResult removeProductByPK(@RequestBody Product product) {
        productService.removeProductByPK(product);
        return HttpResult.ok();
    }
}
