package com.hielectro.welpair.order.model.dto;

import com.hielectro.welpair.product.model.dto.ProductDTO;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class SellProductDTO {


    private String sellProductId;   // 판매상품id
    private String productCode;     // 상품코드
    private float discount;         // 할인율

    private char isSell;            // 판매여부

    private ProductDTO product;     // 판매상품 dto



}
