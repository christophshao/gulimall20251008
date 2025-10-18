package com.atstudy.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atstudy.common.utils.PageUtils;
import com.atstudy.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author sjf
 * @email 1921719677@qq.com
 * @date 2025-10-18 14:08:43
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

