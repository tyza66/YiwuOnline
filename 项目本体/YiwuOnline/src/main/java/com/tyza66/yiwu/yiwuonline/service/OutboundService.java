package com.tyza66.yiwu.yiwuonline.service;

import com.tyza66.yiwu.yiwuonline.mapper.OutboundMapper;
import com.tyza66.yiwu.yiwuonline.pojo.Outbound;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public boolean addOne(Outbound outbound) {
        int i = outboundMapper.addOneAndIdUp(outbound);
        if (i >= 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean update(Outbound outbound){
        int i = outboundMapper.updateById(outbound);
        if (i >= 1) {
            return true;
        }else{
            return false;
        }
    }

    public boolean delete(Outbound outbound){
        int i = outboundMapper.deleteById(outbound);
        if (i >= 1) {
            return true;
        }else{
            return false;
        }
    }
}
