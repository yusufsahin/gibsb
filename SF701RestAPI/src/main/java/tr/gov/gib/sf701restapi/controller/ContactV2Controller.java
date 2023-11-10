package tr.gov.gib.sf701restapi.controller;
import org.springframework.beans.factory.annotation.Autowired;
import tr.gov.gib.sf701restapi.dao.model.Contact;
import tr.gov.gib.sf701restapi.service.impl.ContactServiceImpl;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.*;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api/v2/contacts")
public class ContactV2Controller {

    @Autowired
    private final ContactServiceImpl contactService;

    @Autowired
    public ContactV2Controller(ContactServiceImpl contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public List<EntityModel<Contact>> getAllContacts() {
        return contactService.getAllContacts().stream()
                .map(contact -> EntityModel.of(
                        contact,
                        linkTo(methodOn(ContactV2Controller.class).getContactById(contact.getId())).withSelfRel(),
                        linkTo(methodOn(ContactV2Controller.class).getAllContacts()).withRel("contacts")
                ))
                .collect(Collectors.toList());
    }


    @GetMapping("/{id}")
    public EntityModel<Contact> getContactById(@PathVariable int id) {
        Contact contact= contactService.getContactById(id);
        Link selfLink= linkTo(methodOn(ContactV2Controller.class).getContactById(id)).withSelfRel();
        return  EntityModel.of(contact,selfLink);
    }

    @PostMapping
    public EntityModel<Contact> addContact(@RequestBody Contact contact) {
        Contact newContact = contactService.addContact(contact);
        return EntityModel.of(
                newContact,
                linkTo(methodOn(ContactV2Controller.class).getContactById(newContact.getId())).withSelfRel()
        );
    }

    @PutMapping
    public EntityModel<Contact> updateContact(@RequestBody Contact contact) {
        Contact updatedContact = contactService.updateContact(contact);
        return EntityModel.of(
                updatedContact,
                linkTo(methodOn(ContactV2Controller.class).getContactById(updatedContact.getId())).withSelfRel()
        );
    }

    @PatchMapping("/{id}")
    public EntityModel<Contact> partialUpdateContact(@PathVariable int id, @RequestBody Contact contact) {
        Contact existingContact = contactService.getContactById(id);
        if (existingContact != null) {
            if (contact.getFirstName() != null) {
                existingContact.setFirstName(contact.getFirstName());
            }
            if (contact.getLastName() != null) {
                existingContact.setLastName(contact.getLastName());
            }
            if (contact.getPhoneNumber() != null) {
                existingContact.setPhoneNumber(contact.getPhoneNumber());
            }
            Contact updatedContact = contactService.updateContact(existingContact);
            return EntityModel.of(
                    updatedContact,
                    linkTo(methodOn(ContactV2Controller.class).getContactById(updatedContact.getId())).withSelfRel()
            );
        }
        return null;

    }

    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable int id) {
        contactService.deleteContact(id);
    }
}
