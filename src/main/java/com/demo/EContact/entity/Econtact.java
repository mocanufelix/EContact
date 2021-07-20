package com.demo.EContact.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "t_econtact")
public class   Econtact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(name="lastName")
    private String lastName;

    @Column(name="firstName")
    private String firstName;

    @Column(name="phoneNumber")
    private String phoneNumber;

    @Column(name="address")
    private String address;

    @Column(name="city")
    private String city;

    @Column(name="email")
    private String email;

}
