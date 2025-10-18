package com.atstudy.gulimall.product;

import com.atstudy.gulimall.product.entity.BrandEntity;
import com.atstudy.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("小米");
//        boolean save = brandService.save(brandEntity);
//        if (save) System.out.println("insert 了！！！！！！！！！！");
//        System.out.println("保存成功.....");

        QueryWrapper<BrandEntity> brandEntityQueryWrapper = new QueryWrapper<>();
        brandEntityQueryWrapper.eq("brand_id", 1L);
        List<BrandEntity> list = brandService.list(brandEntityQueryWrapper);
        list.forEach((item) -> {
            System.out.println(item);
        });


    }

}
