package com.itvillage.stock_web;

import com.itvillage.stock_web.domain.Products;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ProductsMapper {
    @Select("SELECT * FROM products WHERE product_id = #{product_id}")
    Products getProduct(@Param("product_id") Long product_id);

    Products findById(Long product_id);
}
