package com.hielectro.welpair.product;

import com.hielectro.welpair.configuration.MybatisConfiguration;
import com.hielectro.welpair.configuration.WelpairApplication;
import com.hielectro.welpair.product.model.service.ProductService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ContextConfiguration(classes = {MybatisConfiguration.class, WelpairApplication.class})
public class ProductServiceTests {
    @Autowired
    ProductService productService;

    @Test
    @DisplayName("Service 의존성 주입 확인")
    public void test() {
        assertNotNull(productService);
    }

    @Test
    @DisplayName("리턴값의 Null 여부 확인")
    public void test2() {
        assertNotNull(productService.findAllProduct());
    }
}
