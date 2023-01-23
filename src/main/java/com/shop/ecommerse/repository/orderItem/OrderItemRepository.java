package com.shop.ecommerse.repository.orderItem;

import com.shop.ecommerse.domain.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderDetail, Long> {

}
