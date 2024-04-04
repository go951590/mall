package com.kent.mall.service;

import com.kent.mall.dto.ProductRequest;
import com.kent.mall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
