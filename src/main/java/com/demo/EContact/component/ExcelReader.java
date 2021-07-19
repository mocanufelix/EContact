package com.demo.EContact.component;

import com.demo.EContact.controller.Econtact;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class ExcelReader {
    public List<Econtact> getEcontactsFromExcel(){

        Econtact econtact7 = Econtact.builder()
                .id(7)
                .firstName("Felix")
                .lastName("Mocanu")
                .phoneNumber("0741588412")
                .address("str.AlexCiurcu nr.46")
                .city("Brasov")
                .email("mocanufelix@yahoo.com")
                .build();

        Econtact econtact8 = Econtact.builder()
                .id(8)
                .firstName("Daniel")
                .lastName("Tintea")
                .phoneNumber("0733122893")
                .address("str. nr.")
                .city("Ploiesti")
                .email("tinteadanieldanny@yahoo.com")
                .build();

        Econtact econtact9 = Econtact.builder()
                .id(9)
                .firstName("Aura")
                .lastName("Moraru")
                .phoneNumber("0741588123")
                .address("str.Toamnei nr.50")
                .city("Brasov")
                .email("moraruaura@yahoo.com")
                .build();

        Econtact econtact10 = Econtact.builder()
                .id(10)
                .firstName("Adela")
                .lastName("Anghelescu")
                .phoneNumber("0745258741")
                .address("str.Dacia nr.76")
                .city("Bucuresti")
                .email("adeade@yahoo.com")
                .build();

        Econtact econtact11 = Econtact.builder()
                .id(11)
                .firstName("Catalin")
                .lastName("Auras")
                .phoneNumber("0745123789")
                .address("str.Mihai Viteazu nr.23")
                .city("Cluj")
                .email("aurasc@yahoo.com")
                .build();

        Econtact econtact12 = Econtact.builder()
                .id(12)
                .firstName("Florin")
                .lastName("Mezzeti")
                .phoneNumber("0758456367")
                .address("str.Aeroportului nr.29")
                .city("Oradea")
                .email("florinmezzeti@yahoo.com")
                .build();

        return List.of(econtact7, econtact8, econtact9, econtact10, econtact11, econtact12);

    }

}
