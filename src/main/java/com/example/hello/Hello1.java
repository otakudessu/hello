package com.example.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello1{
    @RequestMapping ("/")
    public String Hello1(){
        return "malik";
    }


}