package com.demo.EContact.controller;

import lombok.*;

@Getter
@Setter
@Builder
public class   Econtact {
    private int id;
    private String lastName;
    private String firstName;
    private String phoneNumber;
    private String adress;
    private String city;
    private String email;
}
