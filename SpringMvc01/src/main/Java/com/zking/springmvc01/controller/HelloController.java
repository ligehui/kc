package com.zking.springmvc01.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/index")
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public String hello(){
        System.out.print("被调用了...");
        return null;
    }

    @RequestMapping(value = "/add")
    public String add(){
        System.out.print("被调用了...");
        return null;
    }

}
