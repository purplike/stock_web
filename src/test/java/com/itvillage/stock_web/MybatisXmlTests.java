package com.itvillage.stock_web;

import com.itvillage.stock_web.domain.Product;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
@Log4j2
public class MybatisXmlTests {

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void test() {
        Product p = productMapper.findById(1L);
        log.info(p);
    }

    @Test
    public void save() {



        IntStream.range(3, 100).forEach(i -> {
            Product p = Product.builder()
                    .product_name("product" + i)
                    .product_barcode("barcode" + i)
                    .stock_quantity(0)
                    .build();

            productMapper.save(p);

        });
    }

    @Test
    public void saveOne() {

        Product p = Product.builder()
                .product_name("product")
                .product_barcode("barcode")
                .stock_quantity(0)
                .build();

        productMapper.save(p);


    }
}
