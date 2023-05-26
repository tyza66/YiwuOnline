package com.tyza66.yiwu.yiwuonline.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Author: tyza66
 * Date: 2023/05/26 9:43
 * Github: https://github.com/tyza66
 **/
@Data
@TableName("user")
public class User {
    @TableId
    Integer id;
    @TableField("username")
    String username;
    String password;
    String ban;
    String topUserId;
}
