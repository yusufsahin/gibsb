package tr.gov.gib.sf002appcontext.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tr.gov.gib.sf002appcontext.service.impl.MyServiceImpl;

@Configuration
public class MyConfig {
    @Bean
    public MyServiceImpl myServiceImpl()
    {
        return new MyServiceImpl();
    }
}
