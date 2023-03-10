package com.shop.ecommerce.converters;

import com.shop.ecommerce.domain.dto.CategoryDTO;
import com.shop.ecommerce.domain.dto.OrderDetailDTO;
import com.shop.ecommerce.domain.entity.Order;
import com.shop.ecommerce.domain.response.order.OrderResponse;
import org.springframework.stereotype.Component;

import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class OrderResponseConverter implements Function<Order, OrderResponse> {
    @Override
    public OrderResponse apply(Order order) {
        return OrderResponse.builder()
                .id(order.getId())
                .city(order.getCity())
                .country(order.getCountry())
                .shipAddress(order.getShipAddress())
                .phone(order.getPhone())
                .trackingNumber(order.getTrackingNumber())
                .totalPrice(order.getTotalPrice())
                .list( order.getOrderDetails()
                        .stream()
                        .map(orderDetails -> OrderDetailDTO
                                .builder()
                                .url(orderDetails.getProductVariant().getProduct().getUrl())
                                .name(orderDetails.getProductVariant().getProduct().getName())
                                .price(orderDetails.getProductVariant().getPrice())
                                .amount(orderDetails.getAmount())
                                .category(CategoryDTO
                                        .builder()
                                        .name(orderDetails.getProductVariant().getProduct().getProductCategory().getName())
                                        .build())
                                .build()
                        ).collect(Collectors.toList()))
                .build();
    }
}
