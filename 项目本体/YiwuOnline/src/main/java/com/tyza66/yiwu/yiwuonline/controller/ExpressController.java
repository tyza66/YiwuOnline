package com.tyza66.yiwu.yiwuonline.controller;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.tyza66.yiwu.yiwuonline.pojo.Express;
import com.tyza66.yiwu.yiwuonline.pojo.Outbound;
import com.tyza66.yiwu.yiwuonline.service.ExpressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

/**
 * Author: tyza66
 * Date: 2023/05/29 15:59
 * Github: https://github.com/tyza66
 **/
@Api(tags = "快递管理")
@SessionAttributes("currentUser")
@RestController
@RequestMapping("/express")
public class ExpressController {
    @Autowired
    ExpressService expressService;

    @ApiOperation("获得全部快递")
    @GetMapping("/all")
    public JSON getAll(Model model){
        JSONObject end = JSONUtil.createObj();
        if (model.getAttribute("currentUser") == null) {
            end.set("code", "201");
            end.set("msg", "权限不足");
        } else {
            List<Express> all = expressService.getAll();
            end.set("code", "0");
            end.set("msg", "");
            end.set("count", all.size());
            end.set("data", all);
        }
        return end;
    }
}
