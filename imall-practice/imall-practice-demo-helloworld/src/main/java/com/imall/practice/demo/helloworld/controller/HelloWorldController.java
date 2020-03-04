package com.imall.practice.demo.helloworld.controller;

import cn.hutool.core.util.StrUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    /**
     * Hello，World
     *
     * @param name 参数，非必须
     * @return Hello, ${who}
     */
    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false, name = "name") String name) {
        if (StrUtil.isBlank(name)) {
            name = "World";
        }
        return StrUtil.format("Hello, {}!", name);
    }
}
