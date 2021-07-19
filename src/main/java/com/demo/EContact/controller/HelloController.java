package com.demo.EContact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    private String country;

    @GetMapping(value = "/printHello")
    @ResponseBody
    public String printHello(){
        return "Hello World!";
    }

    @GetMapping(value = "/printParam")
    @ResponseBody
    public String printParam(@RequestParam("username") String name){
        return "Hello " + name;
    }

    @GetMapping (value = "/printPathVariable/{organization}")
    @ResponseBody
    public String printPathVariable(@PathVariable String organization){
        return "Hello " + organization;
    }


}
