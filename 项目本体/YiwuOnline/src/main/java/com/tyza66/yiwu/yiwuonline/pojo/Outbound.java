package com.tyza66.yiwu.yiwuonline.pojo;

import io.swagger.models.auth.In;
import lombok.Data;

/**
 * Author: tyza66
 * Date: 2023/05/29 14:22
 * Github: https://github.com/tyza66
 **/
@Data
public class Outbound {
    Integer id;
    String name;
    String location;
    String express;
    String phone;
    String destination;
    Integer num;
}
