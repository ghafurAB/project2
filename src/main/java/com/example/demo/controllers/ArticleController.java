package com.example.demo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {
    /*
    C- @PostMapping
    R- @GetMapping
    U- @PutmMapping
    D- @DeleteMapping
     */

    @GetMapping("/article")
    public String hello(){
        return "helleo";
    }
}
