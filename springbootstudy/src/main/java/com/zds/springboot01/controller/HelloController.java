package com.zds.springboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping(value = "/sayHello")
    @ResponseBody
    public String sayHello() {
        return "Hello World";
    }
}
