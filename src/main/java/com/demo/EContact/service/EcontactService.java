package com.demo.EContact.service;

import com.demo.EContact.entity.Econtact;
import com.demo.EContact.repository.EcontactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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

    public Econtact getEcontactById(int idEcontact) {
        Optional<Econtact> econtact = econtactRepository.findById(idEcontact);
        return econtact.get();
    }

    @Transactional
    public int deleteEcontactById(int idEcontact) {
        return econtactRepository.deleteEcontactById(idEcontact);
    }

}
