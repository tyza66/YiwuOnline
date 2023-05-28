package com.tyza66.yiwu.yiwuonline.controller;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.tyza66.yiwu.yiwuonline.pojo.Inventory;
import com.tyza66.yiwu.yiwuonline.service.InventoryService;
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
 * Date: 2023/05/28 15:50
 * Github: https://github.com/tyza66
 **/
@Api(tags = "库存管理")
@SessionAttributes("currentUser")
@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    InventoryService inventoryServices;

    @ApiOperation("获取库存列表")
    @GetMapping("getAll")
    public JSON getInventory(Model model){
        JSONObject end = JSONUtil.createObj();
        if(model.getAttribute("currentUser")==null){
            end.set("code","201");
            end.set("msg","权限不足");
        }else{
            List<Inventory> all = inventoryServices.getAll();
            end.set("code","0");
            end.set("msg","");
            end.set("count",all.size());
            end.set("data",all);
        }
        return  end;
    }
}
