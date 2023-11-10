package tr.gov.gib.sf500contactmanager.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import tr.gov.gib.sf500contactmanager.dao.ContactRepository;
import tr.gov.gib.sf500contactmanager.dao.model.Contact;

@Component
@Order(1)
public class FeedContact implements CommandLineRunner {
    private  final ContactRepository contactRepository;

    @Autowired
    public FeedContact(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        contactRepository.save(new Contact(1L, "John", "Doe", "123-456-7890"));
        contactRepository.save(new Contact(2L, "Jane", "Smith", "987-654-3210"));
    }
}
