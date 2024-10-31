package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //specifies the spring to create an object for this class inside the container(IOC)
public class Dev {

     @Autowired      
     @Qualifier("laptop")        //field injection
     private Computer com;

    // Dev(Laptop laptop)      //constructor injection
    // {
    //     this.laptop=laptop;
    // }

    // @Autowired               //setter injection
    // public void setLaptop(Laptop laptop)
    // {
    //     this.laptop=laptop;
    // }

    public void build()
    {
        System.out.println("Welcome everyone..");
        com.compile();
        com.debug();
    }
}
