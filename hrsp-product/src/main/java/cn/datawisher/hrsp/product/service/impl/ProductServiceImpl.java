package cn.datawisher.hrsp.product.service.impl;

import cn.datawisher.common.page.MybatisPageHelper;
import cn.datawisher.common.page.PageRequest;
import cn.datawisher.common.page.PageResult;
import cn.datawisher.hrsp.product.dao.ProductMapper;
import cn.datawisher.hrsp.product.domain.entity.Product;
import cn.datawisher.hrsp.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ProductServiceImpl
 * @Description 
 * @Author Jim Han
 * @Date 2020/2/23
 * @Version V1.0
 **/
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;

    @Autowired
    public ProductServiceImpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public Product findById(Integer id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Product> findAll() {
        return productMapper.selectAll();
    }

    @Override
    public PageResult findByPage(PageRequest pageRequest) {
        return MybatisPageHelper.findByPage(pageRequest, productMapper, "selectAll");
    }

    @Override
    public int addProduct(Product product) {
        return productMapper.insertSelective(product);
    }

    @Override
    public int saveProduct(Product product) {
        return productMapper.updateByPrimaryKeySelective(product);
    }

    @Override
    public int removeProductByPK(Product product) {
        return productMapper.deleteByPrimaryKey(product);
    }
}
