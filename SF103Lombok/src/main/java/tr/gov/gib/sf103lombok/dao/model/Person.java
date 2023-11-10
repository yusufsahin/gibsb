package tr.gov.gib.sf103lombok.dao.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Person {
    private final Long id;
    private final String firstname;
    private final String lastname;
    private final String phonenumber;

}
