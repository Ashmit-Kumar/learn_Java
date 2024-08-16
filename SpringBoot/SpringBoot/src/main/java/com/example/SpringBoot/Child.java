package com.example.SpringBoot;

import org.springframework.stereotype.Component;

@Component
public class Child implements Student{
    public void study(){
        System.out.println("Learn your Syllabus");
    }
}
