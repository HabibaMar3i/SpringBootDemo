package com.habiba.app;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
    @Autowired
    public void compiling(){
        System.out.println("Compiling as Desktop....");
    }
}
