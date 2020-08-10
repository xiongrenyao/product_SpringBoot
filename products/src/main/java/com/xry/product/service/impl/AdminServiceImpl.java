package com.xry.product.service.impl;

import com.xry.product.mapper.AdminMapper;
import com.xry.product.pojo.Admin;
import com.xry.product.service.AdminService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service("adminService")
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    @Override
    public Admin loginByName(String username) {
        Condition condition = new Condition(Admin.class);
        Example.Criteria criteria = condition.createCriteria();
        criteria.andEqualTo("AdminName",username);
        List<Admin> list = adminMapper.selectByExample(condition);
        return list.size() == 1 ?list.get(0) : null;
    }
}
