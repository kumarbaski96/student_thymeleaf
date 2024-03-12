package com.student.ms.demoController;

import com.student.ms.demoService.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoController {
    private VegPizza vegPizza;
    public DemoController(VegPizza vegPizza){
        this.vegPizza=vegPizza;
    }
    public String getPizza(){
        return vegPizza.getPizza();
    }
}
