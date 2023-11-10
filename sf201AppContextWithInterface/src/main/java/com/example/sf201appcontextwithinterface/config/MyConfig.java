package com.example.sf201appcontextwithinterface.config;

import com.example.sf201appcontextwithinterface.service.impl.MyServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public MyServiceImpl myServiceImpl()
    {
        return  new MyServiceImpl();
    }
}
