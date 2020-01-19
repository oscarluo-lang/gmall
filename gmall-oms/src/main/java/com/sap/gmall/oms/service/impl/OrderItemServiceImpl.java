package com.sap.gmall.oms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sap.gmall.oms.mapper.OrderItemMapper;
import gmall.oms.entity.OrderItem;
import gmall.oms.service.OrderItemService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author oscar
 * @since 2020-01-18
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
