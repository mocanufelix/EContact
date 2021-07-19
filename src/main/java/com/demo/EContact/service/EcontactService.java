package com.demo.EContact.service;

import com.demo.EContact.entity.Econtact;
import com.demo.EContact.repository.EcontactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EcontactService {

    @Autowired
    EcontactRepository econtactRepository;

    public List<Econtact>getEcontacts(){
       return econtactRepository.findAll();
    }

    public void saveEcontactToDataBase(Econtact econtact) {
        econtactRepository.save(econtact);
    }
}
