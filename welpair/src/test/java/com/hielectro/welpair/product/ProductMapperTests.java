package com.hielectro.welpair.product;

import com.hielectro.welpair.configuration.MybatisConfiguration;
import com.hielectro.welpair.configuration.WelpairApplication;
import com.hielectro.welpair.product.model.dao.ProductMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ContextConfiguration(classes = {MybatisConfiguration.class, WelpairApplication.class})
public class ProductMapperTests {

    @Autowired
    private ProductMapper productMapper;

    @Test
    @DisplayName("Mapper 의존성 주입 확인")
    public void dependency() {
        assertNotNull(productMapper);
    }

    @Test
    @DisplayName("모든 상품 출력 테스트")
    public void test() {
        assertNotNull(productMapper.findAllSellProduct());
        System.out.println(productMapper.findAllSellProduct());
    }
}
