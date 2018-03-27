package com.solo.pojo;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by admin on 2018/3/26.
 * 商品类目
 * updateTime在sql语句中设置了自动更新，@DynamicUpdate注解可以使自动更新生效，不加则不生效
 * @Data 注解帮助生成get/set/toString 方法
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {

    /** 类目id*/
    @Id
    @GeneratedValue
    private int categoryId;

    /**类目名称 */
    private String categoryName;

    /**类目类型*/
    private int categoryType;

    /**创建时间 */
    private Date createTime;

    /**修改时间 */
    private Date updateTime;

    public ProductCategory(String categoryName, int categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

    public ProductCategory() {
    }
}
