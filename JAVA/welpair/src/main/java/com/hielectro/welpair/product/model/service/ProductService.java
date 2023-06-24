package com.hielectro.welpair.product.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hielectro.welpair.product.model.dao.ProductMapper;
import com.hielectro.welpair.product.model.dto.SellProductDTO;

@Service
public class ProductService {
    private final ProductMapper productMapper;

    public ProductService(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    public List<SellProductDTO> findAllProduct() {
        return productMapper.findAllSellProduct();
    }
}
