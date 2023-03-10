package com.shop.ecommerce.service;

import com.shop.ecommerce.domain.entity.ProductVariant;
import com.shop.ecommerce.domain.response.product.ProductDetailsResponse;
import com.shop.ecommerce.domain.response.product.ProductResponse;
import com.shop.ecommerce.domain.response.product.ProductVariantResponse;

import java.util.List;

public interface ProductService {
    ProductDetailsResponse findByUrl(String url);

    List<ProductVariantResponse> getAll(Integer page, Integer size, String sort, String category, Float minPrice, Float maxPrice);

    Long getAllCount(String category, Float minPrice, Float maxPrice);

    ProductVariant findProductVariantById(Long id);

    List<ProductResponse> getRelatedProducts(String url);

    List<ProductResponse> getNewlyAddedProducts();

    List<ProductVariantResponse> getMostSelling();

    List<ProductResponse> getInterested();

    List<ProductResponse> searchProductDisplay(String keyword, Integer page, Integer size);
}
