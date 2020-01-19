package com.sap.gmall.oms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sap.gmall.oms.mapper.OrderSettingMapper;
import gmall.oms.entity.OrderSetting;
import gmall.oms.service.OrderSettingService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单设置表 服务实现类
 * </p>
 *
 * @author oscar
 * @since 2020-01-18
 */
@Service
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingMapper, OrderSetting> implements OrderSettingService {

}
