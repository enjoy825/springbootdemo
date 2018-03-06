package com.example.springbootdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HttpAspect {
    @Before("execution(com.example.springbootdemo.controller.GirlController)")
    public void log(){

    }
}
