package com.demo.EContact.controller;


import ch.qos.logback.core.net.SyslogOutputStream;
import javassist.compiler.ast.Symbol;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EcontactController {

    private Model model;

    @GetMapping(value = "/econtactOverview")
    public ModelAndView wiewEcontacts(Model model, Symbol symbol){
        ModelAndView mav = new ModelAndView();

        model.addAttribute("greetings", "Hello World");

        List<String> econtactNameList = List.of("Popescu","Georgescu","Ionescu","Alexandrescu");
        model.addAttribute("econtactNameList", econtactNameList);

        List<Econtact> econtactList = getEcontactList();
        model.addAttribute("econtactList", econtactList);


        mav.setViewName("econtactOverviewPage");
        return mav;
    }



    @GetMapping(value = "/econtactForm")
    public ModelAndView getEcontactForm(){
        ModelAndView mav = new ModelAndView();

        mav.setViewName("econtactForm");
        return mav;
    }

    @PostMapping (value = "/submitEcontact")
    public ModelAndView submitEcontact(){
        ModelAndView mav = new ModelAndView();

        System.out.println("submitEcontact");

        mav.setViewName("redirect:/econtactOverview");
        return mav;
    }

    private List<Econtact> getEcontactList(){
        Econtact econtact1;
        econtact1 = Econtact.builder()
                .id(1)
                .firstName("aaa")
                .lastName("bbb")
                .monthlySalary(100)
                .departmentName("dep1")
                .build();

        Econtact econtact2 = Econtact.builder()
                .id(2)
                .firstName("xxx")
                .lastName("yyy")
                .monthlySalary(200)
                .departmentName("dep2")
                .build();

        Econtact econtact3 = Econtact.builder()
                .id(3)
                .firstName("ggg")
                .lastName("hhh")
                .monthlySalary(300)
                .departmentName("dep3")
                .build();

        return List.of(econtact1, econtact2, econtact3);

    }
}



