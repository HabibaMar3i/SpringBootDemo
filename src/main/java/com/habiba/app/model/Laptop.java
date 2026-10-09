package com.habiba.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Laptop implements Computer {
    @Autowired
    Cpu cpu;
    public void compiling(){
        System.out.println("Compiling as Laptop....");
    }
}
