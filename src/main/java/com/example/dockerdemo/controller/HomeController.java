package com.example.dockerdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/{name}")
    public String home(@PathVariable String name){
        return name;
    }
}
