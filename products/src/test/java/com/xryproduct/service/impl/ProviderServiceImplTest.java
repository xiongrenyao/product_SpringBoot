package com.xryproduct.service.impl;

import com.xry.product.pojo.Provider;
import com.xry.product.service.ProviderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProviderServiceImplTest {


    @Autowired
    ProviderService providerService;
    @Test
    public void findAll() {
        List<Provider> list = providerService.findAll();
        log.info("list====="+list);

    }
}