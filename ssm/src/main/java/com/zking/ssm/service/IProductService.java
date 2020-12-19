package com.zking.ssm.service;

import com.zking.ssm.model.Product;
import com.zking.ssm.util.PageBean;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IProductService {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    public List<Product> listProPager(PageBean pageBean);
}