package com.tyza66.yiwu.yiwuonline.pojo;

import lombok.Data;

/**
 * Author: tyza66
 * Date: 2023/05/26 9:43
 * Github: https://github.com/tyza66
 **/
@Data
public class User {
    Integer id;
    String username;
    String password;
    String ban;
    String topUserId;
}
