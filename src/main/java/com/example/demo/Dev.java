package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //specifies the spring to create an object for this class inside the container(IOC)
public class Dev {

    // @Autowired              //field injection
     private Laptop laptop;

    // Dev(Laptop laptop)      //constructor injection
    // {
    //     this.laptop=laptop;
    // }

    @Autowired
    public void setLaptop(Laptop laptop)
    {
        this.laptop=laptop;
    }

    public void build()
    {
        System.out.println("Welcome everyone..");
        laptop.compile();
        laptop.debug();
    }
}
