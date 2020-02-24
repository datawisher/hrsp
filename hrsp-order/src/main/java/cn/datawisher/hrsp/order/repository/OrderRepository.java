package cn.datawisher.hrsp.order.repository;

import cn.datawisher.hrsp.order.domain.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
