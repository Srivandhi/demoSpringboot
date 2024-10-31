package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Desktop implements Computer{

    public void compile()
    {
        System.out.println("desktop is compiling..");
    }
    public void debug()
    {
        System.out.println("desktop is debugging..");
    }

}
