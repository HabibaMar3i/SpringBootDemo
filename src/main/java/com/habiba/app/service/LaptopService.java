package com.habiba.app.service;

import com.habiba.app.model.Laptop;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    public void addLaptop(Laptop lap){
        System.out.println("method called");
    }
    public boolean isGoodForProg(Laptop lap){
        return true;
    }
}
