package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ContactServiceImpl implements ContactService {

    List<Contact> list= Stream.of(new Contact(1L,"upender@gmail.com","Amit",1311L),
            new Contact(2L,"ram@gmail.com","samer",1311L),
            new Contact(3L,"har@gmail.com","har",1312L)).collect(Collectors.toList());
    @Override
    public List<Contact> getContactUser(Long Id) {
        return this.list.stream().filter(e->e.getUserId().equals(Id)).collect(Collectors.toList());
    }
}
