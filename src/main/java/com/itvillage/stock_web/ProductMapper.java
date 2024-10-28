package com.itvillage.stock_web;

import com.itvillage.stock_web.domain.Product;
import org.apache.ibatis.annotations.*;

@Mapper
public interface ProductMapper {

    @Select("SELECT * FROM products WHERE product_id = #{product_id}")
    Product getProduct(@Param("product_id") Long product_id);

    @Insert("INSERT INTO product (product_name, product_barcode, stock_quantity) values (#{product_name}, #{product_barcode}, #{stock_quantity})")
    @Options(useGeneratedKeys = true, keyProperty = "product_id")
    int insert(@Param("product") Product product);

    Product findById(Long product_id);
    void save(Product product);
}
