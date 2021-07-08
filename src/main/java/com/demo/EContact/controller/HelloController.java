package com.demo.EContact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

<<<<<<< HEAD
    @GetMapping(value = "/printHello")
=======
    @GetMapping (value = "/printHello")
>>>>>>> FM: First commit.
    @ResponseBody
    public String printHello(){
        return "Hello World!";
    }

<<<<<<< HEAD

    @GetMapping(value = "/printParam")
=======
    @GetMapping (value = "/printParam")
>>>>>>> FM: First commit.
    @ResponseBody
    public String printParam(@RequestParam("username") String name){
        return "Hello " + name;
    }

<<<<<<< HEAD

    @GetMapping (value = "/printPathVariable/{country}/index")
    @ResponseBody
    public String printPathVariable(@PathVariable String country){
        return "Site country " + country  ;
    }


}




=======
    @GetMapping (value = "/printPathVariable/{organization}")
    @ResponseBody
    public String printPathVariable(@PathVariable String organization){
        return "Hello " + organization;
    }

}
>>>>>>> FM: First commit.
