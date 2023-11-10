package tr.gov.gib.sf701restapi.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import tr.gov.gib.sf701restapi.dao.impl.ContactRepositoryImpl;
import tr.gov.gib.sf701restapi.dao.model.Contact;

@Component
@Order(1)
public class DataInitializer implements CommandLineRunner {

    private final ContactRepositoryImpl contactRepository;

    public DataInitializer(ContactRepositoryImpl contactRepository) {
        this.contactRepository = contactRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Contact contact1= new Contact(1,"John","Doe","+23344556777");
        contactRepository.insert(contact1);
    }
}
