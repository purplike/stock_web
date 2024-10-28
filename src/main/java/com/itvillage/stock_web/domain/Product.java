package com.itvillage.stock_web.domain;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private Long product_id;
    private String product_name;
    private String product_barcode;
    private int stock_quantity;
}
