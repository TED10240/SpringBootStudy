package com.tjmakebug.springboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Value("${school.name}")
    private String schoolName;

    @Value("${webSit}")
    private String webSit;

    @RequestMapping(value = "/say")
    @ResponseBody
    public String say(){
        return "say-springboot" +schoolName +webSit;
    }
}
