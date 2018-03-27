package com.solo.repository;

import com.solo.pojo.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 商品类目表的数据控制层
 * Created by admin on 2018/3/26.
 */
public interface ProductCategoryRepo extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> types);
}
