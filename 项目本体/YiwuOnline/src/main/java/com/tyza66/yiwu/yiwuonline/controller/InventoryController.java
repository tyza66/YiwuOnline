package com.tyza66.yiwu.yiwuonline.controller;

import com.tyza66.yiwu.yiwuonline.service.InventoryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

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


}
