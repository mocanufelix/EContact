package com.demo.EContact.controller;



import com.demo.EContact.entity.Econtact;
import com.demo.EContact.service.EcontactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EcontactController {

    @Autowired
    EcontactService econtactService;

    @GetMapping(value = "/econtactOverview")
    public ModelAndView wiewEcontacts(Model model){
        ModelAndView mav = new ModelAndView();

        List<Econtact> econtactList = econtactService.getEcontacts();
        model.addAttribute("econtactList", econtactList);

        mav.setViewName("econtactOverviewPage");
        return mav;
    }

    @GetMapping(value = "/econtactForm")
    public ModelAndView getEcontactForm(Model model){
        ModelAndView mav = new ModelAndView();

        Econtact econtact = Econtact.builder().build();
        model.addAttribute("econtact", econtact);

        mav.setViewName("econtactForm");
        return mav;
    }

    @PostMapping (value = "/submitEcontact")
    public ModelAndView submitEcontact(@ModelAttribute Econtact econtact){
        ModelAndView mav = new ModelAndView();

        econtactService.saveEcontactToDataBase(econtact);

        mav.setViewName("redirect:/econtactOverview");
        return mav;
    }

    @PostMapping(value = "/editEcontact")
    public ModelAndView editEcontact(@RequestParam("econtactId") int idEcontact, @RequestParam String city, Model model){

        ModelAndView mav = new ModelAndView();

        System.out.println("ID: "  + idEcontact);
        System.out.println("city: "  + city);

        Econtact econtact = Econtact.builder()
                .id(1)
                .firstName("Felix")
                .lastName("Mocanu")
                .phoneNumber("0741588412")
                .address("str.AlexCiurcu nr.46")
                .city("Brasov")
                .email("mocanufelix@yahoo.com")
                .build();

        model.addAttribute("econtact", econtact);


        mav.setViewName("econtactForm");
        return mav;
    }

    @PostMapping (value = "/messageEcontact")
    public ModelAndView messageEcontact(@ModelAttribute Econtact econtact){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("redirect:/Mesagerie");
        return mav;
    }

}



