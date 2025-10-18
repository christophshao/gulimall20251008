package com.atstudy.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atstudy.common.utils.PageUtils;
import com.atstudy.gulimall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author sjf
 * @email 1921719677@qq.com
 * @date 2025-10-18 14:08:43
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

