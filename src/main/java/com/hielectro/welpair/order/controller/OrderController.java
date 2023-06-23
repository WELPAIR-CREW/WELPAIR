package com.hielectro.welpair.order.controller;


import com.hielectro.welpair.order.model.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/order")
public class OrderController {


    private final OrderService cartService;


    // 판매상품 정보조회
    @GetMapping("/product-detail")
    public void getProduct() {}


    @GetMapping("/cart")
    public void goCart(){ }


    // 판매상품 cart add
//    @PostMapping("/cart")
//    public String addCartItem(ProductOrderDTO productOrder){
//
//        cartService.addCartItem(productOrder);
//
//
//
//        return "/cart";
//    }



}
