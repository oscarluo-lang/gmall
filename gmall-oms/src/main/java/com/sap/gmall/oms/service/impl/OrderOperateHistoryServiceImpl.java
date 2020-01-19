package com.sap.gmall.oms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sap.gmall.oms.mapper.OrderOperateHistoryMapper;
import gmall.oms.entity.OrderOperateHistory;
import gmall.oms.service.OrderOperateHistoryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单操作历史记录 服务实现类
 * </p>
 *
 * @author oscar
 * @since 2020-01-18
 */
@Service
public class OrderOperateHistoryServiceImpl extends ServiceImpl<OrderOperateHistoryMapper, OrderOperateHistory> implements OrderOperateHistoryService {

}
