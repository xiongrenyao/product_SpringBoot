package com.xry.product.controller;


import com.xry.product.pojo.Admin;
import com.xry.product.service.AdminService;
import com.xry.product.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    @RequestMapping("test")
    public String test(){
        return "hello";
    }

    @PostMapping("login")
    public Result login(@RequestParam() String username, @RequestParam() String password){
        Admin admin = adminService.loginByName(username);
        log.error("admin" +admin);
        if (admin != null && admin.getAdminPassword().equals(password)){
            return Result.ok();
        }
        return Result.error("账号密码错误!");
    }
}
