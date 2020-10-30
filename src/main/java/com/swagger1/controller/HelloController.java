package com.swagger1.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "用户controller", tags = {"用户操作接口"})
@RestController
@RequestMapping("/hello")
public class HelloController {
    @ApiOperation("Hello控制类1")
    @GetMapping("/hello1")
    public String hello1(){
        return "hello world!";
    }

    @ApiOperation("Hello控制类2")
    @GetMapping("/hello2")
    @ApiImplicitParams(
            @ApiImplicitParam(name = "name", value = "用户名", dataType = "String", required = true)
    )
    public String hello2(String name){
        return "hello" + name;
    }
}
