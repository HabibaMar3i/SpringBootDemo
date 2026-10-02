package com.habiba.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    @Autowired
    Cpu cpu;
    public void compiling(){
        cpu.processing();
    }
}
