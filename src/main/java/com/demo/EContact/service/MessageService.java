package com.demo.EContact.service;


import com.demo.EContact.entity.Group;
import com.demo.EContact.entity.Message;
import com.demo.EContact.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    public List<Message> getMessage(){
        return messageRepository.findAll();
    }

    public void saveMessageToDataBase(Message message) {
        messageRepository.save(message);
    }
}
