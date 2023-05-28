package com.tyza66.yiwu.yiwuonline.service;

import com.tyza66.yiwu.yiwuonline.mapper.InventoryMapper;
import com.tyza66.yiwu.yiwuonline.pojo.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author: tyza66
 * Date: 2023/05/28 16:17
 * Github: https://github.com/tyza66
 **/
@Service
public class InventoryService {
    @Resource
    InventoryMapper inventoryMapper;

    public List<Inventory> getAll(){
        return inventoryMapper.selectList(null);
    }

}
