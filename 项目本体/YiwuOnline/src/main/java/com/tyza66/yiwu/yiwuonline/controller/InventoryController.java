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
import org.springframework.web.bind.annotation.*;

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
    public JSON getInventory(Model model) {
        JSONObject end = JSONUtil.createObj();
        if (model.getAttribute("currentUser") == null) {
            end.set("code", "201");
            end.set("msg", "权限不足");
        } else {
            List<Inventory> all = inventoryServices.getAll();
            end.set("code", "0");
            end.set("msg", "");
            end.set("count", all.size());
            end.set("data", all);
        }
        return end;
    }

    @ApiOperation("添加库存")
    @PostMapping("/add")
    public JSON addInventory(@RequestBody Inventory inventory, Model model) {
        JSONObject end = JSONUtil.createObj();
        if (model.getAttribute("currentUser") != null) {
            boolean b = inventoryServices.addOne(inventory);
            if (b) {
                end.set("status", "200");
                end.set("msg", "添加成功");
            } else {
                end.set("status", "201");
                end.set("msg", "添加失败");
            }
        } else {
            end.set("status", "500");
            end.set("msg", "权限不足");
        }
        return end;
    }

    @ApiOperation("删除库存")
    @PostMapping("/delete")
    public JSON deleteInventory(@RequestBody Inventory inventory, Model model) {
        JSONObject end = JSONUtil.createObj();
        if (model.getAttribute("currentUser") != null) {
            boolean b = inventoryServices.removeOne(inventory);
            if (b) {
                end.set("status", "200");
                end.set("msg", "删除成功");
            } else {
                end.set("status", "201");
                end.set("msg", "删除失败");
            }
        } else {
            end.set("status", "500");
            end.set("msg", "权限不足");
        }
        return end;
    }

    @ApiOperation("删除多个库存")
    @PostMapping("/deleteAll")
    public JSON deleteAllInventory(@RequestBody List<Inventory> inventories, Model model) {
        JSONObject end = JSONUtil.createObj();
        if (model.getAttribute("currentUser") != null) {
            boolean b = true;
            for(Inventory one:inventories){
                if(!inventoryServices.removeOne(one)){
                    b=false;
                }
            }
            if (b) {
                end.set("status", "200");
                end.set("msg", "删除成功");
            } else {
                end.set("status", "201");
                end.set("msg", "删除失败");
            }
        } else {
            end.set("status", "500");
            end.set("msg", "权限不足");
        }
        return end;
    }

    @ApiOperation("修改库存")
    @PostMapping("/update")
    public JSON updateInventory(@RequestBody Inventory inventory, Model model) {
        JSONObject end = JSONUtil.createObj();
        if (model.getAttribute("currentUser") != null) {
            boolean b = inventoryServices.updateById(inventory);
            if (b) {
                end.set("status", "200");
                end.set("msg", "修改成功");
            } else {
                end.set("status", "201");
                end.set("msg", "修改失败");
            }
        } else {
            end.set("status", "500");
            end.set("msg", "权限不足");
        }
        return end;
    }
}
