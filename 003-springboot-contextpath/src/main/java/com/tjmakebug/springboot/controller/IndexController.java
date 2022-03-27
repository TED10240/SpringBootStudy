package com.tjmakebug.springboot.controller;

import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping(value = "/Say")
    @ResponseBody
    public String say(){
        return "hello,SpringBoot";
    }

    @RequestMapping(value = "/mapvalue")
    public @ResponseBody Map<String,Object> mapValue(){
        Map<String,Object> resMap = new HashMap<>();
        resMap.put("message","hello,SpringBoot");
        return resMap;
    }
}
