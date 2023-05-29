package com.tyza66.yiwu.yiwuonline.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tyza66.yiwu.yiwuonline.pojo.Inventory;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Author: tyza66
 * Date: 2023/05/28 16:16
 * Github: https://github.com/tyza66
 **/
public interface InventoryMapper extends BaseMapper<Inventory> {
    @Insert("INSERT INTO `yiwu`.`inventory` (`name`, `info`, `from1`, `band`, `bandpeople`, `phone`, `price`, `num`) VALUES (#{name}, #{info}, #{from1}, #{band}, #{bandPeople}, #{phone}, #{price}, #{num})")
    public int insertOneAndIdUp(Inventory inventory);
}
