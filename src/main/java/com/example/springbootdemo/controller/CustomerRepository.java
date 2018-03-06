package com.example.springbootdemo.controller;


import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<customer,Integer> {

}
