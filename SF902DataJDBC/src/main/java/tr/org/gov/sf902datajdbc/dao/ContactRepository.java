package tr.org.gov.sf902datajdbc.dao;

import org.springframework.stereotype.Repository;
import tr.org.gov.sf902datajdbc.dao.model.Contact;

@Repository
public interface ContactRepository extends JPARepository<Contact,Long> {
}
