package com.demo.EContact.repository;


import com.demo.EContact.entity.Econtact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EcontactRepository extends JpaRepository<Econtact, Integer> {

}
