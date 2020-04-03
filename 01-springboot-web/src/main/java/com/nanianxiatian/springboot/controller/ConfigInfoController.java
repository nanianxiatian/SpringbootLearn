package com.nanianxiatian.springboot.controller;

import com.nanianxiatian.springboot.config.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author nanianxiatian
 */
@Controller
public class ConfigInfoController {

    @Value("${test.name}")
    private String name;

    @Value("${test.title}")
    private String title;

    @Autowired
    private ConfigInfo configInfo;

    @RequestMapping("/test/config")
    public @ResponseBody String configInfo(){
        System.out.println(name+title);
        return  name+title +"-----" +configInfo.getName()+configInfo.getTitle();
    }
}
