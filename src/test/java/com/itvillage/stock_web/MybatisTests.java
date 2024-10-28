package com.itvillage.stock_web;

import com.itvillage.stock_web.domain.Product;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
@Log4j2
public class MybatisTests {

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void getProduct() {
        Product p = productMapper.getProduct(1L);
        log.info(p);
//Products(product_id=1, product_name=product name 1, product_barcode=0001, stock_quantity=15)
    }

    @Test
    public void insert() {
        IntStream.range(0, 10).forEach(i -> {
            Product p = Product.builder()
                    .product_name("product" + i)
                    .product_barcode("barcode" + i)
                    .build();
        });
    }
}
