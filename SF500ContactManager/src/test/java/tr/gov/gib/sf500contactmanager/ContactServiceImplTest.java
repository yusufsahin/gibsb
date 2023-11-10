package tr.gov.gib.sf500contactmanager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tr.gov.gib.sf500contactmanager.dao.impl.ContactRepositoryImpl;
import tr.gov.gib.sf500contactmanager.dao.model.Contact;
import tr.gov.gib.sf500contactmanager.service.impl.ContactServiceImpl;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class ContactServiceImplTest {
    @InjectMocks
    ContactServiceImpl contactService;

    @Mock
    ContactRepositoryImpl contactRepository;

    @BeforeEach
    void setUp()
    {

        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetContactsAsString() {
        when(contactRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Contact(1L, "John", "Doe", "123-456-7890"),
                        new Contact(2L, "Jane", "Smith", "987-654-3210")
                )
        );

        String result = contactService.getContactsAsString();
        assertTrue(result.contains("John"));
        assertTrue(result.contains("Doe"));
        assertTrue(result.contains("Jane"));
        assertTrue(result.contains("Smith"));
    }
}
