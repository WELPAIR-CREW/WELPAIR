package com.hielectro.welpair.product.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductDTO {
    private String code;
    private String name;
    private String status;
    private int amount;
    private int price;
    private String option;
    private String nation;
    private String categoryCode;
}
