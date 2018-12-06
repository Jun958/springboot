package com.itheima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Quick2Controller {
    @Value("${name}")
    private String name;

    @Value("${person.addr}")
    private String addr;
    @RequestMapping("/quick2")
    @ResponseBody
    public String quick2() {
        //获得配置文件信息
        System.out.println(name);
        return "name:"+name+",addr:"+addr;
    }
}
