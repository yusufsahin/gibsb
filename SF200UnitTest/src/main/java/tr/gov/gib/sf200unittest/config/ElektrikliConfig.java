package tr.gov.gib.sf200unittest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import tr.gov.gib.sf200unittest.di.Motor;

@Configuration
@Profile("elektrikli")
public class ElektrikliConfig {

    @Bean
    public Motor motor()
    {
        return  new Motor("Elektrikli");
    }
}
