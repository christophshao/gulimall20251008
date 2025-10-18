package com.atstudy.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atstudy.common.utils.PageUtils;
import com.atstudy.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author sjf
 * @email 1921719677@qq.com
 * @date 2025-10-18 12:44:46
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

