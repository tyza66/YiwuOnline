package com.tyza66.yiwu.yiwuonline.controller;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.tyza66.yiwu.yiwuonline.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: tyza66
 * Date: 2023/05/26 9:54
 * Github: https://github.com/tyza66
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public JSON getAllUsers() {
        return JSONUtil.parse(userService.getAllUsers());
    }
}
