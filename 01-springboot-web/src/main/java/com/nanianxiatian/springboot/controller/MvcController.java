package com.nanianxiatian.springboot.controller;

import com.nanianxiatian.springboot.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nanianxiatian
 */
@RestController  // @RestController= @Controller + @ResponseBody
public class MvcController {

    @RequestMapping("/test/getUser")
    public Object getUser(){
        User user = new User();
        user.setId(1);
        user.setName("小明");

        //返回的不是页面，是json
        return user;
    }

    /**
     * @GetMapping 只支持get 请求  @GetMapping = @RequestMapping +RequestMetod.GET
     * @return
     */
    @GetMapping("/test/getUser1")
    public Object getUser1(){
        User user = new User();
        user.setId(2);
        user.setName("小红");

        //返回的不是页面，是json
        return user;
    }

    /**
     * @PostMapping 只支持get 请求  @GetMapping = @RequestMapping +RequestMetod.POST
     * @return
     */
    @PostMapping("/test/getUser2")
    public Object getUser2(){
        User user = new User();
        user.setId(3);
        user.setName("小李");

        //返回的不是页面，是json
        return user;
    }
}
