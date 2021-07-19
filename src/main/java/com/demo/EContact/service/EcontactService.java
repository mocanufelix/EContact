package com.demo.EContact.service;

import com.demo.EContact.component.DatabaseReader;
import com.demo.EContact.component.ExcelReader;
import com.demo.EContact.controller.Econtact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Service
public class EcontactService {

    @Autowired
    DatabaseReader dbReader;

    @Autowired
    ExcelReader excelReader;

    public List<Econtact>getEcontacts(){
        List<Econtact> list = new ArrayList<>();

        list.addAll(dbReader.getEcontactsFromDB());
        list.addAll(excelReader.getEcontactsFromExcel());

        return list;

    }

    public void saveEcontactToDatabase(Econtact econtact){

    }
}
