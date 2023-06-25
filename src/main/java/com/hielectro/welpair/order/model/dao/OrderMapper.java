package com.hielectro.welpair.order.model.dao;


import com.hielectro.welpair.order.model.dto.CartSellProductDTO;
import com.hielectro.welpair.order.model.dto.SellProductDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {


//    public void addCartItem(ProductOrderDTO productOrder);

    public SellProductDTO checkoutSellProductId(String sellProductId);

    public String selectCartNo();

    public int addCartSellProduct(CartSellProductDTO cartSellProduct);

    int addCart(String empNo);
}
