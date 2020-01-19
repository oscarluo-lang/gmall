package com.sap.gmall.cms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sap.gmall.cms.entity.Topic;
import com.sap.gmall.cms.mapper.TopicMapper;
import com.sap.gmall.cms.service.TopicService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 话题表 服务实现类
 * </p>
 *
 * @author oscar
 * @since 2020-01-18
 */
@Service
public class TopicServiceImpl extends ServiceImpl<TopicMapper, Topic> implements TopicService {

}
