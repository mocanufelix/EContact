package com.demo.EContact.controller;



import com.demo.EContact.entity.Econtact;
import com.demo.EContact.entity.Group;
import com.demo.EContact.service.EcontactService;
import com.demo.EContact.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EcontactController {

    @Autowired
    EcontactService econtactService;

    @Autowired
    GroupService groupService;


    @GetMapping(value="/EContact")
    public ModelAndView firstPageEcontact(Model model){
        ModelAndView mav = new ModelAndView();

        Econtact econtact = Econtact.builder().build();
        model.addAttribute("econtact", econtact);

        mav.setViewName("EContact");
        return mav;
    }



    @GetMapping(value="/Login")
    public ModelAndView logEcontact(Model model){
        ModelAndView mav = new ModelAndView();

        Econtact econtact = Econtact.builder().build();
        model.addAttribute("econtact", econtact);

        mav.setViewName("Login");
        return mav;
    }

    @GetMapping(value = "/econtactOverview")
    public ModelAndView wiewEcontacts(Model model){
        ModelAndView mav = new ModelAndView();

        List<Econtact> econtactList = econtactService.getEcontacts();
        model.addAttribute("econtactList", econtactList);

        mav.setViewName("econtactOverviewPage");
        return mav;
    }

    @RequestMapping(value = "/econtactForm", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView getEcontactForm(Model model){
        ModelAndView mav = new ModelAndView();

        Econtact econtact = Econtact.builder().build();
        model.addAttribute("econtact", econtact);

        List<Group> groupList = groupService.getGroup();
        model.addAttribute("groupList", groupList);

        mav.setViewName("econtactForm");
        return mav;
    }

    @GetMapping(value = "/groupForm")
    public ModelAndView getGroupForm(Model model){
        ModelAndView mav = new ModelAndView();

        Group group = Group.builder().build();
        model.addAttribute("group", group);

        mav.setViewName("groupForm");
        return mav;
    }

    @GetMapping(value = "/Mesagerie")
    public ModelAndView getmessageEcontact(Model model){
        ModelAndView mav = new ModelAndView();

        Econtact econtact = Econtact.builder().build();
        model.addAttribute("econtact", econtact);

        mav.setViewName("Mesagerie");
        return mav;
    }

    @PostMapping (value = "/submitGroup")
    public ModelAndView submitGroup(@ModelAttribute Group group ){
        ModelAndView mav = new ModelAndView();


        groupService.saveGroupToDataBase(group);

        mav.setViewName("redirect:/econtactForm");
        return mav;
    }

    @PostMapping (value = "/submitEcontact")
    public ModelAndView submitEcontact(@ModelAttribute Econtact econtact){
        ModelAndView mav = new ModelAndView();


        econtactService.saveEcontactToDataBase(econtact);

        mav.setViewName("redirect:econtactOverview");
        return mav;
    }

    @PostMapping(value = "/editEcontact")
    public ModelAndView editEcontact(@RequestParam("econtactId") int idEcontact, Model model){
        ModelAndView mav = new ModelAndView();

        Econtact econtact = econtactService.getEcontactById(idEcontact);
        model.addAttribute("econtact", econtact);

        List<Group> groupList = groupService.getGroup();
        model.addAttribute("groupList", groupList);

        mav.setViewName("econtactForm");
        return mav;
    }

    @PostMapping(value = "/deleteEcontact")
    public ModelAndView deleteEcontact(@RequestParam("econtactId") int idEcontact){
        ModelAndView mav = new ModelAndView();

        int deletedEcontactId = econtactService.deleteEcontactById(idEcontact);
        System.out.println("Number of deleted econtact: " + deletedEcontactId);

        mav.setViewName("redirect:/econtactOverview");
        return mav;
    }

    @PostMapping (value = "/messageEcontact")
    public ModelAndView messageEcontact(@ModelAttribute Econtact econtact){
        ModelAndView mav = new ModelAndView();


        mav.setViewName("redirect:/Mesagerie");
        return mav;
    }

}



