package com.tyza66.yiwu.yiwuonline.controller;

import com.tyza66.yiwu.yiwuonline.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: tyza66
 * Date: 2023/05/28 15:50
 * Github: https://github.com/tyza66
 **/
@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    InventoryService inventoryServices;
}
