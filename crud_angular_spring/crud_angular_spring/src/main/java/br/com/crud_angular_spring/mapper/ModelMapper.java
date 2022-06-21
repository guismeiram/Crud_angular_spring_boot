package br.com.crud_angular_spring.mapper;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapper {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
