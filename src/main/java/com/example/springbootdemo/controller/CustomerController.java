package com.example.springbootdemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    public CustomerRepository customerRepository;

    @GetMapping(value = "/customers")
    public List<customer> customerList() {
        return customerRepository.findAll();
    }

    @PostMapping("/customers")
    public void AddGirl(@RequestParam("name") String name) {
        customer customer = new customer();
        customer.setName(name);
        System.out.println(customer);
        customerRepository.save(customer);

}
}
