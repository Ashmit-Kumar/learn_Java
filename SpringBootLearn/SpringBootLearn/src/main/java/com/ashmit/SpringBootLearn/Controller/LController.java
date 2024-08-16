package com.ashmit.SpringBootLearn.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LController {

    @RequestMapping("/Login")
    public String log(){
        return "Login Page";
    }
}
