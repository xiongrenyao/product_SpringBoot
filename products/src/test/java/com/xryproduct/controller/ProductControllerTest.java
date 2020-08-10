package com.xryproduct.controller;

import com.github.pagehelper.PageInfo;
import com.xry.product.pojo.Product;
import com.xry.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductControllerTest {

    @Resource
    ProductService productService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getAll() {
        PageInfo<Product> pageInfo = productService.getAllByPage(5, 5);
        Assert.assertNotNull(pageInfo);
        log.info("pageinfo:========================"+pageInfo);
    }


}