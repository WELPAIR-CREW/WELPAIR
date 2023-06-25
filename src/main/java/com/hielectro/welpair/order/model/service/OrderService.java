package com.hielectro.welpair.order.model.service;


import com.hielectro.welpair.order.model.dto.CartSellProductDTO;
import com.hielectro.welpair.order.model.dto.ProductOrderDTO;
import com.hielectro.welpair.order.model.dto.SellProductDTO;

public interface OrderService {


    void addCartItem(ProductOrderDTO productOrder);

    SellProductDTO checkoutSellProductId(String sellProductId);

    int addcart(String empNo);

    String selectCartNo();

    int addCartSellProduct(CartSellProductDTO cartSellProduct);
}
