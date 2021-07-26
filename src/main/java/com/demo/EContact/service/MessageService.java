package com.demo.EContact.service;


import com.demo.EContact.entity.Group;
import com.demo.EContact.entity.Message;
import com.demo.EContact.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    @Autowired
    private JavaMailSender mailSender;

    public List<Message> getMessage(){
        return messageRepository.findAll();
    }

    public void saveMessageToDataBase(Message message) {
        messageRepository.save(message);
    }

    public void sendEmail(Message mail) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("practicaibm2021.com");
        message.setTo(mail.getAddressee());
        message.setText(mail.getBody());
        message.setSubject(mail.getSubject());

        mailSender.send(message);
        System.out.println("Mail Send...");
    }
}
