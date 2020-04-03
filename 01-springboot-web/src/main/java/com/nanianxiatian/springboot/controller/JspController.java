package com.nanianxiatian.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author nanianxtiatian
 */
@Controller
public class JspController {

    @GetMapping("/test/index")
    public String index(Model model){
        model.addAttribute("msg","springboot 集成jsp！");

        return "index";

    }
}
