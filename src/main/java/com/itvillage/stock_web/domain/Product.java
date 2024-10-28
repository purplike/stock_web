package com.itvillage.stock_web.domain;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Products {
    private Long product_id;
    private String product_name;
    private String product_barcode;
    private String stock_quantity;
}
