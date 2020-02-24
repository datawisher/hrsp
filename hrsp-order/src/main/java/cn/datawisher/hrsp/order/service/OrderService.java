package cn.datawisher.hrsp.order.service;

import cn.datawisher.hrsp.order.domain.entity.Order;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @ClassName OrderService
 * @Description 
 * @Author Jim Han
 * @Date 2020/2/23
 * @Version V1.0
 **/
public interface OrderService {

    Order findById(Integer id);

    List<Order> findAll();

    Page<Order> findByPage(Integer page, Integer size);

    Order addOrder(Order order);

    Order saveOrder(Order order);

    void removeOrder(Order order);
}