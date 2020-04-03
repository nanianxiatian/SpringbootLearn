package com.nanianxiatian.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author nanianxiatian
 * @version 1.0
 * @date 2020-03-12 08:40
 */
@Controller
public class HelloController {
    @RequestMapping("/web/hello")
    public @ResponseBody String hello(){
        return "Hello Spring Boot!";
    }
}
