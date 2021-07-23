package com.demo.EContact.repository;


import com.demo.EContact.entity.Econtact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface EcontactRepository extends JpaRepository<Econtact, Integer> {

    @Modifying
    @Query("delete from Econtact where id=:idEcontact")
    int deleteEcontactById(int idEcontact);

}
