package com.atstudy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atstudy.common.utils.PageUtils;
import com.atstudy.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author sjf
 * @email 1921719677@qq.com
 * @date 2025-10-16 19:16:49
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

