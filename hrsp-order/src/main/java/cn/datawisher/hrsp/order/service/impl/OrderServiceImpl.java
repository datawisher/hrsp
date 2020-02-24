package cn.datawisher.hrsp.order.service.impl;

import cn.datawisher.hrsp.order.domain.entity.Order;
import cn.datawisher.hrsp.order.repository.OrderRepository;
import cn.datawisher.hrsp.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName OrderServiceImpl
 * @Description 
 * @Author Jim Han
 * @Date 2020/2/23
 * @Version V1.0
 **/
@Service
@Transactional(readOnly = true, rollbackFor = Exception.class)
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order findById(Integer id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Page<Order> findByPage(Integer page, Integer size) {
        return orderRepository.findAll(PageRequest.of(page, size));
    }

    @Override
    @Transactional
    public Order addOrder(Order order) {
        order.setCode(UUID.randomUUID().toString());
        order.setCreateDate(new Date());
        return orderRepository.save(order);
    }

    @Override
    @Transactional
    public Order saveOrder(Order order) {
        Order oldOrder = orderRepository.findById(order.getId()).orElse(order);
        oldOrder.setUpdateDate(new Date());
        oldOrder.setStaffCode(order.getStaffCode());
        return oldOrder;
    }

    @Override
    @Transactional
    public void removeOrder(Order order) {
        orderRepository.delete(order);
    }

}
