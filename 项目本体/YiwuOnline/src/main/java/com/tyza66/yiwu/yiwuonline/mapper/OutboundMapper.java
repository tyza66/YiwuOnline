package com.tyza66.yiwu.yiwuonline.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tyza66.yiwu.yiwuonline.pojo.Outbound;
import org.apache.ibatis.annotations.Insert;

/**
 * Author: tyza66
 * Date: 2023/05/29 14:41
 * Github: https://github.com/tyza66
 **/
public interface OutboundMapper extends BaseMapper<Outbound> {
    @Insert("INSERT INTO `yiwu`.`outbound` (`name`, `location`, `express`, `phone`, `destination`,`num`) VALUES (#{name}, #{location}, #{express}, #{phone}, #{destination},#{num})")
    public int addOneAndIdUp(Outbound outbound);
}
