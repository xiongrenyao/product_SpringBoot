package com.xryproduct.service.impl;

import com.xry.product.pojo.Admin;
import com.xry.product.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminServiceImplTest {

    @Autowired
    private AdminService adminService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void loginByName() {
        Admin admin = adminService.loginByName("admin");
        log.error("admin="+admin);
        Assert.assertNotNull(admin);
        Assert.assertEquals(admin.getAdminPassword(),"123456");
    }
}