package com.sap.gmall.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sap.gmall.ums.entity.Member;
import com.sap.gmall.ums.mapper.MemberMapper;
import com.sap.gmall.ums.service.MemberService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author oscar
 * @since 2020-01-18
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
