package com.solo.repository;

import com.google.common.collect.Lists;
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

/**
 * Created by admin on 2018/3/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepoTest {

    @Autowired
    private ProductCategoryRepo repo;

    @Test
    public void testFindOne() {
        ProductCategory productCategory = repo.findOne(1);
        System.out.println(productCategory);
    }

    @Test
    public void testSave(){
        ProductCategory pro = new ProductCategory();
        pro.setCategoryName("手机");
        pro.setCategoryType(2);
        ProductCategory result = repo.save(pro);
        Assert.assertNotNull(result);
    }

    /**
     * @Transactional 注解加在测试方法上，会使测试结束后所有操作都回滚，即不会更改数据库
     */
    @Test
    @Transactional
    public void testUpdate(){
        ProductCategory productCategory = repo.findOne(2);
        productCategory.setCategoryType(3);
        ProductCategory result = repo.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void testFindByCategoryTypeIn(){
        List<ProductCategory> categoryList = repo.findByCategoryTypeIn(Arrays.asList(1, 10, 3));
        System.out.println(categoryList);
        Assert.assertNotEquals(0, categoryList.size());
    }

}