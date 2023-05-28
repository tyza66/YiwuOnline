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
    String id;
    @TableField("username")
    String username;
    String password;
    String ban;
    Integer topUserId;

    public User(String id, String username, String password, String ban, Integer topUserId) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.ban = ban;
        this.topUserId = topUserId;
    }
}
