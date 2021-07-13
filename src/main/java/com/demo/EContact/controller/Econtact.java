package com.demo.EContact.controller;

import lombok.*;

@Getter
@Setter
@Builder
public class   Econtact {
    private int id;
    private String lastName;
    private String firstName;
    private int monthlySalary;
    private String departmentName;
    private String phoneNumber;
    private String adress;
    private String email;
}
