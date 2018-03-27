package com.solo.service.impl;

import com.solo.pojo.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by admin on 2018/3/27.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    CategoryServiceImpl service;

    @Test
    public void findOne() throws Exception {
        ProductCategory pro = service.findOne(3);
        Assert.assertEquals("手机", pro.getCategoryName());
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> all = service.findAll();
        Assert.assertEquals(3, all.size());
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> list = service.findByCategoryTypeIn(Arrays.asList(2, 3, 4));
        Assert.assertEquals(2, list.size());
    }

    @Test
    @Transactional
    public void save() throws Exception {
        ProductCategory result = service.save(new ProductCategory("化妆品", 5));
        Assert.assertNotNull(result);
    }

}