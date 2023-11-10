package tr.gov.gib.sf103lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tr.gov.gib.sf103lombok.dao.model.Person;

@SpringBootApplication
public class Sf103LombokApplication {

    public static void main(String[] args) {
        Person person =  Person.builder()
                .id(1L)
                .firstname("John")
                .lastname("Doe")
                .phonenumber("+905303333333")
                .build();

       /* System.out.println(person.getId());
        System.out.println(person.getFirstname());
        System.out.println(person.getLastname());
        System.out.println(person.getPhonenumber());*/

        System.out.println(person.toString());
        SpringApplication.run(Sf103LombokApplication.class, args);
    }

}
