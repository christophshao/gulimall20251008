package com.atstudy.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atstudy.common.utils.PageUtils;
import com.atstudy.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author sjf
 * @email 1921719677@qq.com
 * @date 2025-10-18 12:44:46
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

