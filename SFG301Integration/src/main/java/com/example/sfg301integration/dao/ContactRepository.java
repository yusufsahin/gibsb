package com.example.sfg301integration.dao;

import com.example.sfg301integration.dao.model.Contact;

import java.util.Optional;

public interface ContactRepository {
    Contact save(Contact contact);
    Optional<Contact> findById(Long id);
    Optional<Contact> findByFirstName(String firstName);
}
