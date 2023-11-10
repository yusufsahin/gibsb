package tr.gov.gib.sf500contactmanager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tr.gov.gib.sf500contactmanager.dao.impl.ContactRepositoryImpl;
import tr.gov.gib.sf500contactmanager.dao.model.Contact;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactRepositoryImplTest {
    private ContactRepositoryImpl contactRepository;
    @BeforeEach
    void setUp()
    {
        contactRepository= new ContactRepositoryImpl();
    }

    @Test
    void testFindAll()
    {
        Contact contact1 = new Contact(1L, "John", "Doe", "123-456-7890");
        Contact contact2 = new Contact(2L, "Jane", "Smith", "987-654-3210");

        contactRepository.save(contact1);
        contactRepository.save(contact2);

        List<Contact> contactList= contactRepository.findAll();

        assertEquals(2,contactList.size());

    }

    @Test
    void testSave()
    {
        Contact contact = new Contact(1L, "John", "Doe", "123-456-7890");
        contactRepository.save(contact);

        Contact found= contactRepository.findById(1L);
        assertEquals("John",found.getFirstName());
    }
    @Test
    void testFindById()
    {
        Contact contact = new Contact(1L, "John", "Doe", "123-456-7890");
        contactRepository.save(contact);
        Contact found = contactRepository.findById(1L);
        assertEquals("Doe", found.getLastName());
    }
}
