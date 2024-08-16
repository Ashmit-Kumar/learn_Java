package com.example.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Company {
    private Student student;
    @Autowired
    @Qualifier("coder")
    public void setStudent(Student student){
        this.student=student;
    }

    public void Job(){
        student.study();
        System.out.println("Hello");

    }

//When you have two beans but spring only need one you use:
//    @Primary annotation
//    but if you use two primary then it will be confused again so it's better to use
//    @Qualifier("class object")  annotation
}
