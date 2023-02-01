package com.shop.ecommerse.service;

import com.shop.ecommerse.converters.ProductCategoryResponseConverter;
import com.shop.ecommerse.domain.entity.ProductCategory;
import com.shop.ecommerse.domain.response.product.ProductCategoryResponse;
import com.shop.ecommerse.handler.exceptions.ResourceNotFoundException;
import com.shop.ecommerse.service.cache.ProductCategoryCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{

    private final ProductCategoryCacheService service;
    private final ProductCategoryResponseConverter converter;

    @Autowired
    public ProductCategoryServiceImpl(ProductCategoryCacheService service, ProductCategoryResponseConverter converter) {
        this.service = service;
        this.converter = converter;
    }

    @Override
    public List<ProductCategoryResponse> findAllByOrderByName() {
        List<ProductCategory> categories = service.findAllByOrderByName();
        if(categories.isEmpty())
            throw new ResourceNotFoundException("Could not find product categories");

        return categories.stream().map(converter).collect(Collectors.toList());
    }

}
