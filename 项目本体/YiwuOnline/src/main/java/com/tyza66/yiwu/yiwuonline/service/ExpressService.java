package com.tyza66.yiwu.yiwuonline.service;

import com.tyza66.yiwu.yiwuonline.mapper.ExpressMapper;
import com.tyza66.yiwu.yiwuonline.pojo.Express;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author: tyza66
 * Date: 2023/05/29 15:54
 * Github: https://github.com/tyza66
 **/
@Service
public class ExpressService {
    @Resource
    ExpressMapper expressMapper;

    public boolean addOne(Express express){
        int i = expressMapper.addOneAndIdUp(express);
        if(i>=1){
            return true;
        }else {
            return false;
        }
    }

    public List<Express> getAll(){
        return expressMapper.selectList(null);
    }
}
