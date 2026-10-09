package com.habiba.app.service;

import com.habiba.app.model.Laptop;
import com.habiba.app.repo.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    LaptopRepository repo = new LaptopRepository();
    public void addLaptop(Laptop lap){
        repo.save(lap);
    }
    public boolean isGoodForProg(Laptop lap){
        return true;
    }
}
