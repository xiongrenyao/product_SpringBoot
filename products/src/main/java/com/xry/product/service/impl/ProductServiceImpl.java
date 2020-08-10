package com.xry.product.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xry.product.mapper.ProductMapper;
import com.xry.product.pojo.Category;
import com.xry.product.pojo.Product;
import com.xry.product.pojo.Provider;
import com.xry.product.service.ProductService;
import com.xry.product.utils.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public PageInfo<Product> getAllByPage(int offset, int limit) {
        PageHelper.offsetPage(offset, limit);
        List<Product> list = productMapper.findAll();
        PageInfo<Product> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Result addProduct(Product product, Provider provider, Category category) {
        int i = productMapper.add(product, provider, category);
        if (i==0){
            return Result.error("添加数据异常");
        }
        return Result.ok();
    }
}
