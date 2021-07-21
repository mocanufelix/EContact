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

    @Column(name="lastname")
    private String lastName;

    @Column(name="firstname")
    private String firstName;

    @Column(name="phonenumber")
    private String phoneNumber;

    @Column
    private String address;

    @Column
    private String city;

    @Column
    private String email;

    @ManyToOne
    @JoinColumn(name="id_group")
    private Group group;

}
