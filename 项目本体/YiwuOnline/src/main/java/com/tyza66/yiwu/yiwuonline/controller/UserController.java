package com.tyza66.yiwu.yiwuonline.controller;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.tyza66.yiwu.yiwuonline.pojo.User;
import com.tyza66.yiwu.yiwuonline.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: tyza66
 * Date: 2023/05/26 9:54
 * Github: https://github.com/tyza66
 **/
@Api(tags = "用户信息管理")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("获得全部用户信息")
    @GetMapping("/all")
    public JSON getAllUsers() {
        JSONObject end = JSONUtil.createObj();
        end.set("status","200");
        end.set("data",userService.getAllUsers());
        return end;
    }

    @ApiOperation("用户登录")
    @PostMapping("/login")
    public JSON login(@RequestBody User user){
        List<User> users = userService.testUserByName(user.getUsername(), user.getPassword());
        JSONObject end = JSONUtil.createObj();
        //System.out.println(user.getUsername()+" "+user.getPassword());
        if(users.size() == 1){
            end.set("status","200");
            end.set("data",users.get(0));
        }else{
            end.set("status","403");
        }
        return end;
    }

    @ApiOperation("用户注册")
    @PostMapping("/sign")
    public JSON sign(@RequestBody User user){
        JSONObject end = JSONUtil.createObj();
        boolean b = userService.newUser(user.getUsername(), user.getPassword());
        if(b){
            end.set("status","200");
            end.set("message","注册成功");
        }else{
            end.set("status","500");
            end.set("message","注册失败");
        }
        return end;
    }
}
