package com.shop.ecommerse.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DiscountDTO{

    Integer discountPercent;
    Integer status;
}
