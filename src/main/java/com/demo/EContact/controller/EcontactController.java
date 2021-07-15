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
                .firstName("Felix")
                .lastName("Mocanu")
                .phoneNumber("0741588412")
                .adress("str.AlexCiurcu nr.46")
                .city("Brasov")
                .email("mocanufelix@yahoo.com")
                .build();

        Econtact econtact2;
        econtact2 = Econtact.builder()
                .id(2)
                .firstName("Daniel")
                .lastName("Tintea")
                .phoneNumber("0733122893")
                .adress("str. nr.")
                .city("Ploiesti")
                .email("tinteadanieldanny@yahoo.com")
                .build();

        Econtact econtact3;
        econtact3 = Econtact.builder()
                .id(2)
                .firstName("Aura")
                .lastName("Moraru")
                .phoneNumber("0741588123")
                .adress("str.Toamnei nr.50")
                .city("Brasov")
                .email("moraruaura@yahoo.com")
                .build();

        Econtact econtact4;
        econtact4 = Econtact.builder()
                .id(3)
                .firstName("Adela")
                .lastName("Anghelescu")
                .phoneNumber("0745258741")
                .adress("str.Dacia nr.76")
                .city("Bucuresti")
                .email("adeade@yahoo.com")
                .build();

        Econtact econtact5;
        econtact5 = Econtact.builder()
                .id(4)
                .firstName("Catalin")
                .lastName("Auras")
                .phoneNumber("0745123789")
                .adress("str.Mihai Viteazu nr.23")
                .city("Cluj")
                .email("aurasc@yahoo.com")
                .build();

        Econtact econtact6;
        econtact6 = Econtact.builder()
                .id(5)
                .firstName("Florin")
                .lastName("Mezzeti")
                .phoneNumber("0758456367")
                .adress("str.Aeroportului nr.29")
                .city("Oradea")
                .email("florinmezzeti@yahoo.com")
                .build();


        return List.of(econtact1, econtact2, econtact3, econtact4, econtact5, econtact6);

    }
}



