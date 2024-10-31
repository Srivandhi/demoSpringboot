package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void compile()
    {
        System.out.println("Laptop is compiling..");
    }
    public void debug()
    {
        System.out.println("laptop is debugging..");
    }
}
