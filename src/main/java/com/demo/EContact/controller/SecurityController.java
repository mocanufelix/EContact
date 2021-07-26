package com.demo.EContact.controller;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecurityController  {

    @GetMapping("/adminpage")
    @ResponseBody
    public String adminpage(Authentication authentication){
        return "Admin page: " + authentication;
    }

    @GetMapping("/userpage")
    @ResponseBody
    public String userpage(Authentication authentication){
        return "User page: " + authentication;
    }

    @GetMapping("/anypage")
    @ResponseBody
    public String anypage(Authentication authentication){
        return "Any page: " + authentication;
    }

}
