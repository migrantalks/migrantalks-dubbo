package com.migrantalks.client.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.migrantalks.api.response.Result;
import com.migrantalks.api.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * dubbo client 测试
 * @author migrantalks
 * @date 2019/04/19
 */
@RestController
@RequestMapping("/")
public class ConsumerController {

    @Reference(version = "1.0")
    IUserService userService;

    @GetMapping("user")
    public Result findUser() {
        return userService.findUser();
    }
}
