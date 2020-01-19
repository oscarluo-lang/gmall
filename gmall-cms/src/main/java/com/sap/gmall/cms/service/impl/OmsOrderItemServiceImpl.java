package com.sap.gmall.cms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sap.gmall.cms.entity.OmsOrderItem;
import com.sap.gmall.cms.mapper.OmsOrderItemMapper;
import com.sap.gmall.cms.service.OmsOrderItemService;
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
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemMapper, OmsOrderItem> implements OmsOrderItemService {

}
