package cn.datawisher.hrsp.product.controller;

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
    public Product findById(@PathVariable(name = "id") Integer id) {
        return productService.findById(id);
    }

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping(params = {"page", "size"})
    public PageResult findByPage(@RequestParam final Integer page, @RequestParam final Integer size) {
        PageRequest pageRequest = new PageRequest(page, size);
        return productService.findByPage(pageRequest);
    }

    @PostMapping
    public int addProduct(@RequestBody Product product) {
        product.setCreateDate(new Date());
        return productService.addProduct(product);
    }

    @PutMapping
    public int saveProduct(@RequestBody Product product) {
        product.setUpdateDate(new Date());
        return productService.saveProduct(product);
    }

    @DeleteMapping
    public int removeProductByPK(@RequestBody Product product) {
        return productService.removeProductByPK(product);
    }
}
