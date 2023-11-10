package tr.gov.gib.sf903jpa.config;

import org.modelmapper.ModelMapper;

public interface ModelMapperConfigurer {
    void configure(ModelMapper modelMapper);
}