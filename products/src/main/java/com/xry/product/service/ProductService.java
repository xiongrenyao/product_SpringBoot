package com.xry.product.service;

import com.github.pagehelper.PageInfo;
import com.xry.product.pojo.Category;
import com.xry.product.pojo.Product;
import com.xry.product.pojo.Provider;
import com.xry.product.utils.Result;

public interface ProductService {
    PageInfo<Product> getAllByPage(int offset, int limit);
    Result addProduct(Product product, Provider provider, Category category);
}
