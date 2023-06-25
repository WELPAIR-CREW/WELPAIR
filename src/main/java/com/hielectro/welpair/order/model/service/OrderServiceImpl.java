package com.hielectro.welpair.order.model.service;

import com.hielectro.welpair.order.model.dto.CartSellProductDTO;
import com.hielectro.welpair.order.model.dto.ProductOrderDTO;
import com.hielectro.welpair.order.model.dto.SellProductDTO;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {


    @Override
    public void addCartItem(ProductOrderDTO productOrder) {



    }

    @Override
    public SellProductDTO checkoutSellProductId(String sellProductId) {
        return null;
    }

    @Override
    public int addcart(String empNo) {
        return 0;
    }

    @Override
    public String selectCartNo() {
        return null;
    }

    @Override
    public int addCartSellProduct(CartSellProductDTO cartSellProduct) {
        return 0;
    }
}
