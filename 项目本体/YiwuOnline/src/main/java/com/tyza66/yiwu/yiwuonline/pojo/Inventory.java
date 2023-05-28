package com.tyza66.yiwu.yiwuonline.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * Author: tyza66
 * Date: 2023/05/28 15:53
 * Github: https://github.com/tyza66
 **/
@Data
public class Inventory {
    @TableId
    Integer id;
    String name;
    String info;
    String from;
    String band;
    @TableField("bandpeople")
    String bandPeople;
    String phone;
    String price;
    String num;
}
