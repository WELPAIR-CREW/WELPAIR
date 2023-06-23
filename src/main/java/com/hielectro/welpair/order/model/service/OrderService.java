package com.hielectro.welpair.order.model.service;


import com.hielectro.welpair.order.model.dto.ProductOrderDTO;

public interface OrderService {


    void addCartItem(ProductOrderDTO productOrder);
}
