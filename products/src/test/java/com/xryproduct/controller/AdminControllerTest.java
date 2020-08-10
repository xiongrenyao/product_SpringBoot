package com.xryproduct.controller;

import com.xry.product.pojo.Admin;
import com.xry.product.service.AdminService;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminControllerTest extends TestCase {

    @Autowired
    private AdminService adminService;

    @Test
    public void testLogin() {
        Admin admin = adminService.loginByName("admin");
        Assert.assertNotNull(admin);
        Assert.assertEquals(admin.getAdminPassword(),"1234");
    }
}