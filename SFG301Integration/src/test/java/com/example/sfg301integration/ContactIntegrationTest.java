package com.example.sfg301integration;

import com.example.sfg301integration.dao.ContactRepository;
import com.example.sfg301integration.dao.dao.impl.ContactRepositoryImpl;
import com.example.sfg301integration.dao.model.Contact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ContactIntegrationTest {

    private ContactRepository contactRepository;

    @BeforeEach
    public void setup()
    {
        contactRepository= new ContactRepositoryImpl();
    }

    @Test
    public void testSaveAndRetrieveContact()
    {
        Contact contact = new Contact();

        contact.setFirstName("John");
        contact.setLastName("Doe");
        contact.setPhoneNumber("987-65499031");

        Contact savedContact= contactRepository.save(contact);

        assertThat(savedContact.getId()).isNotNull();
        assertThat(contactRepository.findById(savedContact.getId())).isPresent();
        assertThat(contactRepository.findByFirstName("John")).isPresent();
    }
}
