package com.sap.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sap.gmall.pms.mapper.BaseAttrValueMapper;
import gmall.pms.entity.BaseAttrValue;
import gmall.pms.service.BaseAttrValueService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 属性值表 服务实现类
 * </p>
 *
 * @author oscar
 * @since 2020-01-18
 */
@Service
@Component
public class BaseAttrValueServiceImpl extends ServiceImpl<BaseAttrValueMapper, BaseAttrValue> implements BaseAttrValueService {

}
