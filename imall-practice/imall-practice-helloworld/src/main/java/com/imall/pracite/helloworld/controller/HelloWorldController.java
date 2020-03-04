package com.imall.pracite.helloworld.controller;

import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("hello/{name}")
    public String hello(@PathVariable String name) {
        return "hello," + name+"。";

    }

    @GetMapping("name")
    public String getName(@RequestParam  String name) {
        return "hello," + name+".....";
    }
}
