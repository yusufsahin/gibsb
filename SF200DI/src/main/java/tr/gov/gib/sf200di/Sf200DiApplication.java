package tr.gov.gib.sf200di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Sf200DiApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context= SpringApplication.run(Sf200DiApplication.class,args);

        Araba araba=context.getBean(Araba.class);

        araba.baslat();
    }

}
