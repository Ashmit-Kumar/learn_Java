package com.example.SpringBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Coder implements Student {
    public void study(){
        System.out.println("Learn deeply");
    }
}
