package com.tyza66.yiwu.yiwuonline.service;

import com.tyza66.yiwu.yiwuonline.mapper.InventoryMapper;
import com.tyza66.yiwu.yiwuonline.pojo.Inventory;
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

    public List<Inventory> getAll() {
        return inventoryMapper.selectList(null);
    }

    public boolean addOne(Inventory inventory) {
        int i = inventoryMapper.insertOneAndIdUp(inventory);
        if (i >= 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean removeOne(Inventory inventory) {
        int i = inventoryMapper.deleteById(inventory);
        if (i >= 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean updateById(Inventory inventory) {
        int i = inventoryMapper.updateById(inventory);
        if (i >= 1) {
            return true;
        } else {
            return false;
        }
    }

}
