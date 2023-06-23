package com.hielectro.welpair.product.model.dao;

import com.hielectro.welpair.product.model.dto.ProductDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<ProductDTO> findAllProduct();
}
