package cn.datawisher.hrsp.order.controller;

import cn.datawisher.common.http.HttpResult;
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
    public HttpResult findById(@PathVariable(name = "id") Integer id) {
        Order order = orderService.findById(id);
        return HttpResult.ok(order);
    }

    @LogCut
    @GetMapping
    public HttpResult findAll() {
        List<Order> orders = orderService.findAll();
        return HttpResult.ok(orders);
    }

    @LogCut
    @GetMapping(params = {"page", "size"})
    public HttpResult findByPage(@RequestParam final Integer page, @RequestParam final Integer size) {
        Page<Order> orders = orderService.findByPage(page, size);
        return HttpResult.ok(orders);
    }

    @LogCut
    @PostMapping
    public HttpResult addOrder(@RequestBody Order order) {
        Order newOrder = orderService.addOrder(order);
        return HttpResult.ok(newOrder);
    }

    @LogCut
    @PutMapping
    public HttpResult editOrder(@RequestBody Order order) {
        Order newOrder = orderService.editOrder(order);
        return HttpResult.ok(newOrder);
    }

    @LogCut
    @DeleteMapping
    public HttpResult remove(@RequestBody Order order) {
        orderService.removeOrder(order);
        return HttpResult.ok();
    }

    @LogCut
    @GetMapping("/staff/{id}")
    public HttpResult findStaffByOrderId(@PathVariable final Integer id) {
        StaffDTO staffDTO = orderService.findStaffByOrderId(id);
        return HttpResult.ok(staffDTO);
    }
}
