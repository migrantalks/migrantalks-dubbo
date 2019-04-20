package com.migrantalks.server.controller;

import com.migrantalks.api.enums.StatusCode;
import com.migrantalks.api.response.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 * @author migrantalks
 * @date 2019/04/19
 */
@RestController
@RequestMapping("/api")
public class BaseController {

    @GetMapping("/hello")
    public Result hello(@RequestParam String param) {

        Result result = new Result(StatusCode.Success);

        try {
            result.setData(param);
        } catch (Exception e) {
            result.setCode(StatusCode.Fail.getCode());
            result.setData(e.getLocalizedMessage());
        }

        return result;
    }
}
