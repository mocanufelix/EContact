package com.demo.EContact.component;

import com.demo.EContact.controller.Econtact;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DatabaseReader {

    public List<Econtact> getEcontactsFromDB(){

        Econtact econtact1 = Econtact.builder()
                .id(1)
                .firstName("Felix")
                .lastName("Mocanu")
                .phoneNumber("0741588412")
                .address("str.AlexCiurcu nr.46")
                .city("Brasov")
                .email("mocanufelix@yahoo.com")
                .build();

        Econtact econtact2 = Econtact.builder()
                .id(2)
                .firstName("Daniel")
                .lastName("Tintea")
                .phoneNumber("0733122893")
                .address("str. nr.")
                .city("Ploiesti")
                .email("tinteadanieldanny@yahoo.com")
                .build();

        Econtact econtact3 = Econtact.builder()
                .id(3)
                .firstName("Aura")
                .lastName("Moraru")
                .phoneNumber("0741588123")
                .address("str.Toamnei nr.50")
                .city("Brasov")
                .email("moraruaura@yahoo.com")
                .build();

        Econtact econtact4 = Econtact.builder()
                .id(4)
                .firstName("Adela")
                .lastName("Anghelescu")
                .phoneNumber("0745258741")
                .address("str.Dacia nr.76")
                .city("Bucuresti")
                .email("adeade@yahoo.com")
                .build();

        Econtact econtact5 = Econtact.builder()
                .id(5)
                .firstName("Catalin")
                .lastName("Auras")
                .phoneNumber("0745123789")
                .address("str.Mihai Viteazu nr.23")
                .city("Cluj")
                .email("aurasc@yahoo.com")
                .build();

        Econtact econtact6 = Econtact.builder()
                .id(6)
                .firstName("Florin")
                .lastName("Mezzeti")
                .phoneNumber("0758456367")
                .address("str.Aeroportului nr.29")
                .city("Oradea")
                .email("florinmezzeti@yahoo.com")
                .build();

        return List.of(econtact1, econtact2, econtact3, econtact4, econtact5, econtact6);


    }
}
