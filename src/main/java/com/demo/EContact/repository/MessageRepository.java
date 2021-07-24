package com.demo.EContact.repository;

import com.demo.EContact.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {

}
