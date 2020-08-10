package com.xry.product.controller;


import com.github.pagehelper.PageInfo;
import com.xry.product.pojo.Category;
import com.xry.product.pojo.Product;
import com.xry.product.pojo.Provider;
import com.xry.product.service.ProductService;
import com.xry.product.service.ProviderService;
import com.xry.product.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("com/xry/product")
public class ProductController {

    @Resource
    private ProductService productService;

    @Resource
    private ProviderService providerService;


    @RequestMapping("list")
    public Map getAll(@RequestParam int offset, @RequestParam() int limit){
        PageInfo<Product> pageInfo = productService.getAllByPage(offset, limit);
        log.info("offset====="+offset,"limit==="+limit);
        Map map = new HashMap<>();
        map.put("total",pageInfo.getTotal());
        map.put("rows",pageInfo.getList());
        return map;
    }

    @RequestMapping("proList")
    public Result ProviderList(){
        List<Provider> list = providerService.findAll();
        return Result.ok(list);
    }

    @RequestMapping("add")
    public Result add(Product product, Provider provider, Category category){
        Result result = productService.addProduct(product, provider, category);
        return result;
    }

}
