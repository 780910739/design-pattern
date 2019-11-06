package com.study.demo.controller;

import com.study.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @Author pukaiquan
 * @Date 2019-11-02 17:00
 */
@RestController
public class ConfigController {


    @Autowired
    UserService userService;


    /** 策略模式
     * @Author pukaiquan
     * @Date 2019-11-06 10:22
     * @Param [type, price]
     * @return void
     */
    @RequestMapping("/pay")
    public void pay(Integer type, BigDecimal price) {
        userService.payOrder(type, price);
    }

}
