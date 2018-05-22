package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DueTo {
    @RequestMapping("/display.form")
    public String display(Model model,String name){
        System.out.print("name: "+name);
        return "show";
    }

}
