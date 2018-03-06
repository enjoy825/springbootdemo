package com.example.springbootdemo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HelloController {
    @Autowired
    public person person;

    @RequestMapping(value = {"/hello","hi"})
    public String hello() {

        return "index";
    }
}
