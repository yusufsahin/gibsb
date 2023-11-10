package tr.org.gov.sf902datajdbc.dao.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import jakarta.persistence.*;
import lombok.*;

@SuppressWarnings("serial")
@Entity
@Builder

@Table(name = "contacts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Contact {
    @Id
    private Long id;
    private String firstname;
    private String lastname;
    private String phonenumber;
    private String email;
}