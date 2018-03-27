package com.solo.service.impl;

import com.solo.pojo.ProductCategory;
import com.solo.repository.ProductCategoryRepo;
import com.solo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2018/3/27.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    ProductCategoryRepo repo;

    @Override
    public ProductCategory findOne(Integer id) {
        return repo.findOne(id);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repo.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repo.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repo.save(productCategory);
    }
}
