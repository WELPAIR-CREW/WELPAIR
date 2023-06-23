package com.hielectro.welpair.product.controller;

import com.hielectro.welpair.product.model.dto.ProductDTO;
import com.hielectro.welpair.product.model.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping({"{id}"})
    public String defaultLocation(@PathVariable("id") String url) {
        return "admin/product/" + url;
    }

    @PostMapping(value = "productlist", produces = "application/json;charset=utf-8")
    @ResponseBody
    public List<ProductDTO> getProductList() {
        System.out.println("메소드 들어옴");
        List<ProductDTO> productList = productService.findAllProduct();
        return productList;
    }
}
