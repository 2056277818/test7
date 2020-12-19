package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.ProductMapper;
import com.zking.ssm.model.Product;
import com.zking.ssm.service.IProductService;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {


    @Autowired
    private ProductMapper productMapper;


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Product record) {
        return 0;
    }

    @Override
    public int insertSelective(Product record) {
        return 0;
    }

    @Override
    public Product selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Product record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Product record) {
        return 0;
    }

    @Override
    public List<Product> listProPager(PageBean pageBean) {
        return productMapper.listPro();
    }


}
