package com.tyza66.yiwu.yiwuonline.service;

import com.tyza66.yiwu.yiwuonline.mapper.UserMapper;
import com.tyza66.yiwu.yiwuonline.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * Author: tyza66
 * Date: 2023/05/26 9:52
 * Github: https://github.com/tyza66
 **/
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;//旧版本的的idea识别不到这个bean可以被注入报错 但是实际上可以注入

    //获取全部用户列表 当时实际生产中肯定不可能保留这样的接口 就是联系测试用一下
    public List<User> getAllUsers() {
        return userMapper.selectList(null);
    }

    //使用userid查询用户
    public List<User> testUserByName(String username, String password) {
        HashMap<String, Object> one = new HashMap<>();
        one.put("username",username);
        one.put("password",password);
        List<User> users = userMapper.selectByMap(one);
        return users;
    }

    //用户账号注册
    public boolean newUser(String username, String password) {
        User newOne = new User(username, username, password,"false",1);
        int insert = userMapper.insert(newOne);
        if (insert>=1){
            return true;
        }else{
            return false;
        }
    }
}
