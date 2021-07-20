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
       // System.out.println("submitEcontact");
       // System.out.println(econtact.toString());
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



  /*  private List<Econtact> getEcontactList(){
        Econtact econtact1;
        econtact1 = Econtact.builder()
                .id(1)
                .firstName("Felix")
                .lastName("Mocanu")
                .phoneNumber("0741588412")
                .address("str.AlexCiurcu nr.46")
                .city("Brasov")
                .email("mocanufelix@yahoo.com")
                .build();

        Econtact econtact2;
        econtact2 = Econtact.builder()
                .id(2)
                .firstName("Daniel")
                .lastName("Tintea")
                .phoneNumber("0733122893")
                .address("str. nr.")
                .city("Ploiesti")
                .email("tinteadanieldanny@yahoo.com")
                .build();

        Econtact econtact3;
        econtact3 = Econtact.builder()
                .id(2)
                .firstName("Aura")
                .lastName("Moraru")
                .phoneNumber("0741588123")
                .address("str.Toamnei nr.50")
                .city("Brasov")
                .email("moraruaura@yahoo.com")
                .build();

        Econtact econtact4;
        econtact4 = Econtact.builder()
                .id(3)
                .firstName("Adela")
                .lastName("Anghelescu")
                .phoneNumber("0745258741")
                .address("str.Dacia nr.76")
                .city("Bucuresti")
                .email("adeade@yahoo.com")
                .build();

        Econtact econtact5;
        econtact5 = Econtact.builder()
                .id(4)
                .firstName("Catalin")
                .lastName("Auras")
                .phoneNumber("0745123789")
                .address("str.Mihai Viteazu nr.23")
                .city("Cluj")
                .email("aurasc@yahoo.com")
                .build();

        Econtact econtact6;
        econtact6 = Econtact.builder()
                .id(5)
                .firstName("Florin")
                .lastName("Mezzeti")
                .phoneNumber("0758456367")
                .address("str.Aeroportului nr.29")
                .city("Oradea")
                .email("florinmezzeti@yahoo.com")
                .build();


        return List.of(econtact1, econtact2, econtact3, econtact4, econtact5, econtact6);

    }*/
}



