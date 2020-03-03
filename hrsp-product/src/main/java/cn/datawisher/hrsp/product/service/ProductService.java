package cn.datawisher.hrsp.product.service;

import cn.datawisher.common.page.PageRequest;
import cn.datawisher.common.page.PageResult;
import cn.datawisher.hrsp.product.domain.entity.Product;

import java.util.List;

/**
 * @ClassName ProductService
 * @Description 
 * @Author Jim Han
 * @Date 2020/2/23
 * @Version V1.0
 **/
public interface ProductService {

    /**
     * 按id查询
     * @param id
     * @return
     */
    Product findById(Integer id);

    /**
     * 查询全部
     * @return
     */
    List<Product> findAll();

    /**
     * 分页查询
     * @param pageRequest
     * @return
     */
    PageResult findByPage(PageRequest pageRequest);

    /**
     * 增加产品
     * @param product
     * @return
     */
    int addProduct(Product product);

    /**
     * 更新产品
     * @param product
     * @return
     */
    int editProduct(Product product);

    /**
     * 删除产品
     * @param product
     * @return
     */
    int removeProductByPK(Product product);
}
