package com.sap.gmall.oms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sap.gmall.oms.mapper.CompanyAddressMapper;
import gmall.oms.entity.CompanyAddress;
import gmall.oms.service.CompanyAddressService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 公司收发货地址表 服务实现类
 * </p>
 *
 * @author oscar
 * @since 2020-01-18
 */
@Service
public class CompanyAddressServiceImpl extends ServiceImpl<CompanyAddressMapper, CompanyAddress> implements CompanyAddressService {

}
