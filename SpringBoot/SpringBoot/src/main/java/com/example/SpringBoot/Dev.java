package com.example.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev{
// If you use @AutoWired directly with the variable then it is field injection
//    @Autowired  //field injection
    private Laptop laptop;


//    Constructor Injection
//    public Dev(Laptop laptop){
//        this.laptop=laptop;
//    }

//    Setter Method
    @Autowired
    public void setLaptop(Laptop laptop){
        this.laptop=laptop;
    }
    public  void build(){
        System.out.println("Build");
        laptop.Compile();
        laptop.debug();
    }

}

//Component=It will create a object of this class so that springboot can use it

/*we can do dependency Injection by using three ways
* 1)Constructor Injection
* 2)setter Injection
* 3)Field Injection
*
* 1)Constructor Injection: we use a constructor to inject all our dependencies
*   Autowired Annotation is not compulsory with Constructor Injection
*
* 2)setter Injection:we use a setter method to inject all our dependencies
*   Autowired Annotation is  compulsory with setter Injection
*
* 3)field Injection:we use a fields to inject all our dependencies
 *   Autowired Annotation is  compulsory with field Injection
* */