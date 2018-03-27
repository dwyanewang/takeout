package com.solo.service;

import com.solo.pojo.ProductCategory;
import freemarker.core.InvalidReferenceException;

import java.util.List;

/**
 * Created by admin on 2018/3/27.
 * 商品类目 service
 */
public interface CategoryService {

    ProductCategory findOne(Integer id);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
