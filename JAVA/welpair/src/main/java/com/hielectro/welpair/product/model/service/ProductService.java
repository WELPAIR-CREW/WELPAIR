package com.hielectro.welpair.product.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hielectro.welpair.product.model.dao.ProductMapper;
import com.hielectro.welpair.product.model.dto.ProductDTO;

@Service
public class ProductService {
    private final ProductMapper productMapper;

    public ProductService(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public List<ProductDTO> findAllProduct() {
        return productMapper.findAllProduct();
    }
}
