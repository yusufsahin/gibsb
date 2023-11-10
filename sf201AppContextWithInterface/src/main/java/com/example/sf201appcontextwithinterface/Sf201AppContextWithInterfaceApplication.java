package com.example.sf201appcontextwithinterface;

import com.example.sf201appcontextwithinterface.service.impl.MyServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Sf201AppContextWithInterfaceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context= SpringApplication.run(Sf201AppContextWithInterfaceApplication.class,args);

        MyServiceImpl myService= context.getBean(MyServiceImpl.class);
        myService.printMessage();
    }

}
