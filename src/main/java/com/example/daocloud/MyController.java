package com.example.daocloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class MyController {
    @Autowired
    MySvc mySvc;
    @GetMapping("/")
    public String index(){
        return "hello spring";
    }
    @GetMapping("/add")
    public String add(int a, int b){
        return MySvc.add(a,b)+"";
    }
}
