package com.tyza66.yiwu.yiwuonline.controller;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.tyza66.yiwu.yiwuonline.pojo.Outbound;
import com.tyza66.yiwu.yiwuonline.service.OutboundService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: tyza66
 * Date: 2023/05/29 15:25
 * Github: https://github.com/tyza66
 **/
@Api(tags = "出库管理")
@SessionAttributes("currentUser")
@RestController
@RequestMapping("/outbound")
public class OutboundController {
    @Autowired
    OutboundService outboundService;

    @ApiOperation("获得待出库列表")
    @GetMapping("/getAll")
    public JSON getAll(Model model) {
        JSONObject end = JSONUtil.createObj();
        if (model.getAttribute("currentUser") == null) {
            end.set("code", "201");
            end.set("msg", "权限不足");
        } else {
            List<Outbound> all = outboundService.getAll();
            end.set("code", "0");
            end.set("msg", "");
            end.set("count", all.size());
            end.set("data", all);
        }
        return end;
    }

    @ApiOperation("添加出库信息")
    @PostMapping("/add")
    public JSON addOne(@RequestBody Outbound outbound, Model model) {
        JSONObject end = JSONUtil.createObj();
        if (model.getAttribute("currentUser") == null) {
            end.set("code", "201");
            end.set("msg", "权限不足");
        } else {
            boolean b = outboundService.addOne(outbound);
            if (b) {
                end.set("status", "200");
                end.set("msg", "出库成功");
            } else {
                end.set("status", "201");
                end.set("msg", "出库失败");
            }
        }
        return end;
    }

    @ApiOperation("修改出库信息")
    @PostMapping("/add")
    public JSON updateOne(@RequestBody Outbound outbound, Model model) {
        JSONObject end = JSONUtil.createObj();
        if (model.getAttribute("currentUser") == null) {
            end.set("code", "201");
            end.set("msg", "权限不足");
        } else {
            boolean b = outboundService.update(outbound);
            if (b) {
                end.set("status", "200");
                end.set("msg", "修改成功");
            } else {
                end.set("status", "201");
                end.set("msg", "修改失败");
            }
        }
        return end;
    }

    @ApiOperation("删除出库信息")
    @PostMapping("/add")
    public JSON deleteOne(@RequestBody Outbound outbound, Model model) {
        JSONObject end = JSONUtil.createObj();
        if (model.getAttribute("currentUser") == null) {
            end.set("code", "201");
            end.set("msg", "权限不足");
        } else {
            boolean b = outboundService.delete(outbound);
            if (b) {
                end.set("status", "200");
                end.set("msg", "删除成功");
            } else {
                end.set("status", "201");
                end.set("msg", "删除失败");
            }
        }
        return end;
    }
}
