package com.ashmit.SpringBootLearn.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class HomeController {
////Instead of @RestController we can use @ResponseBody                                               0289-
//    @RequestMapping("/")
//    public String greet(){
//        return "Welcome to Hell";
//    }
//
//    @RequestMapping("/about")
//    public String about(){
//        return "This is about page";
//    }
//}
@RestController
public class HomeController{

    @GetMapping("/")
    public String greet(){
        return "Hello";
    }

    @RequestMapping("/about")
    public String About(){
        return "About us page";
    }
}
