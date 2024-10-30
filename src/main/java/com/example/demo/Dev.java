package com.example.demo;

import org.springframework.stereotype.Component;

@Component //specifies the spring to create an object for this class inside the container(IOC)
public class Dev {

    public void build()
    {
        System.out.println("Welcome everyone..");
    }
}
