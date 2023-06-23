package com.hielectro.welpair.product.model.service;

import com.hielectro.welpair.product.model.dao.ProductMapper;
import com.hielectro.welpair.product.model.dto.ProductDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
