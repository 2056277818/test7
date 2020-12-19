package com.zking.ssm.controller;

import com.zking.ssm.model.Product;
import com.zking.ssm.model.User;
import com.zking.ssm.service.IProductService;
import com.zking.ssm.util.JsonData;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private IProductService productService;


    @ResponseBody
    @RequestMapping("/listProPager")
    public Object list(HttpServletRequest request,String name){
        PageBean pageBean =new PageBean();
        pageBean.setRequest(request);
        JsonData jsonData = new JsonData();

        List<Product> products = productService.listProPager(pageBean);

        jsonData.setCode(0);
        jsonData.setMessage("房间信息查询成功");
        jsonData.setResult(products);
        jsonData.setPage(pageBean.getPage());
        jsonData.setRows(pageBean.getRows());
        jsonData.setTotal(pageBean.getTotal());
        //去数据库查数据
        return jsonData;
    }




}
