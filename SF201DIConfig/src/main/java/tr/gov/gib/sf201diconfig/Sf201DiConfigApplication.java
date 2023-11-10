package tr.gov.gib.sf201diconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import tr.gov.gib.sf201diconfig.di.Araba;

@SpringBootApplication
public class Sf201DiConfigApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context= SpringApplication.run(Sf201DiConfigApplication.class,args);
        Araba araba= context.getBean(Araba.class);

        araba.baslat();
    }

}
