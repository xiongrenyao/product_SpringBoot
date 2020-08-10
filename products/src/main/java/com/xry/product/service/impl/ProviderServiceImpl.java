package com.xry.product.service.impl;

import com.xry.product.mapper.ProviderMapper;
import com.xry.product.pojo.Provider;
import com.xry.product.service.ProviderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("providerService")
public class ProviderServiceImpl implements ProviderService {

    @Resource
    private ProviderMapper providerMapper;
    @Override
    public List<Provider> findAll() {
        List<Provider> list = providerMapper.selectAll();
        return list;
    }
}
