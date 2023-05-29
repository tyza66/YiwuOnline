package com.tyza66.yiwu.yiwuonline.service;

import com.tyza66.yiwu.yiwuonline.mapper.OutboundMapper;
import com.tyza66.yiwu.yiwuonline.pojo.Outbound;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author: tyza66
 * Date: 2023/05/29 14:41
 * Github: https://github.com/tyza66
 **/
@Service
public class OutboundService {
    @Resource
    OutboundMapper outboundMapper;

    public List<Outbound> getAll() {
        return outboundMapper.selectList(null);
    }
}
