package cn.datawisher.hrsp.order.controller;

import cn.datawisher.common.logger.LogCut;
import cn.datawisher.hrsp.order.domain.dto.StaffDTO;
import cn.datawisher.hrsp.order.domain.entity.Order;
import cn.datawisher.hrsp.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName OrderController
 * @Description 
 * @Author Jim Han
 * @Date 2020/2/23
 * @Version V1.0
 **/
@RestController
@RequestMapping("/v1/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @LogCut
    @GetMapping("{id}")
    public Order findById(@PathVariable(name = "id") Integer id) {
        return orderService.findById(id);
    }

    @LogCut
    @GetMapping
    public List<Order> findAll() {
        return orderService.findAll();
    }

    @LogCut
    @GetMapping(params = {"page", "size"})
    public Page<Order> findByPage(@RequestParam final Integer page, @RequestParam final Integer size) {
        return orderService.findByPage(page, size);
    }

    @LogCut
    @PostMapping
    public Order addOrder(@RequestBody Order order) {
        return orderService.addOrder(order);
    }

    @LogCut
    @PutMapping
    public Order saveOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    @LogCut
    @DeleteMapping
    public void remove(@RequestBody Order order) {
        orderService.removeOrder(order);
    }

    @LogCut
    @GetMapping("/staff/{id}")
    public StaffDTO findStaffByOrderId(@PathVariable final Integer id) {
        return orderService.findStaffByOrderId(id);
    }
}
