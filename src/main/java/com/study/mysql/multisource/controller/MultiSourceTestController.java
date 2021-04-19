package com.study.mysql.multisource.controller;

import com.study.mysql.multisource.service.MultiSourceTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class MultiSourceTestController {
    @Autowired
    MultiSourceTestService multiSourceTestService;

    @GetMapping("/primary")
    public int getPrimary() {
        return multiSourceTestService.getPrimaryData();
    }

    @GetMapping("/second")
    public int getSecond() {
        return multiSourceTestService.getSecondData();
    }

    @GetMapping("/third")
    public int getThird() {
        return multiSourceTestService.getThirdData();
    }
}
