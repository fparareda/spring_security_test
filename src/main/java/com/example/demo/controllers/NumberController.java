package com.example.demo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {

    @RequestMapping("v1/public/{number}")
    public String getPublicAccountDataLinkedTo(@PathVariable final int number){
        return "Public number: " + number;
    }

    @RequestMapping("v1/private/{number}")
    public String getPrivateAccountDataLinkedTo(@PathVariable final int number){
        return "Private number: " + number;
    }

    @RequestMapping("v1/admin/{number}")
    public String getExtraAccountDataLinkedTo(@PathVariable final int number){
        return "Admin number: " + number;
    }
}
