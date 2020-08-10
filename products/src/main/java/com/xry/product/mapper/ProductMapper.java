package com.xry.product.mapper;

import com.xry.product.pojo.Category;
import com.xry.product.pojo.Product;
import com.xry.product.pojo.Provider;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ProductMapper extends Mapper<Product> {
    List<Product> findAll();

    int add(Product product, Provider provider, Category category);

}
