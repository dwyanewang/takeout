package com.solo.repository;

import com.solo.pojo.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
        repo.save(pro);
    }

}