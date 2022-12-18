package ru.springphoto.springphoto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Main {

    @GetMapping
    String getIndex(){return "index";}

    @GetMapping("/about")
    String about(){
        return "about";
    }

    @GetMapping("/photo")
    String photo(){
        return "photo";
    }

    @GetMapping("/contact")
    String contact(){return "contact";}
}
