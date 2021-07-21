package com.demo.EContact.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name="t_Group")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(name="code")
    private String groupCode;

    @Column(name="name")
    private String groupName;

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    List<Econtact> econtactList;

}
