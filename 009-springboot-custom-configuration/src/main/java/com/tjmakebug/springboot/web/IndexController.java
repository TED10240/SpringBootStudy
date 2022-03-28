package com.tjmakebug.springboot.web;

import com.tjmakebug.springboot.config.Cba;
import com.tjmakebug.springboot.config.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    private School school;

    @Autowired
    private Cba cba;


    @RequestMapping(value = "/say")
    public @ResponseBody String say(){
        return "school:" +school.getName() +"cba:"+cba.getName();
    }
}
