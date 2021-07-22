package com.demo.EContact.service;

import com.demo.EContact.entity.Group;
import com.demo.EContact.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class GroupService {

    @Autowired
    GroupRepository groupRepository;

    public List<Group>getGroup(){
        return groupRepository.findAll();
    }

    public void saveGroupToDataBase(Group group) {
        groupRepository.save(group);
    }
}
