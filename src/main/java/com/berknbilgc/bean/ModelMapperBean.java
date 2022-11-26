package com.berknbilgc.bean;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperBean {

    @Bean
    public ModelMapper modelMapperMethod(){
        // DTO yu Entity e , Entity i DTO ya çeviriyor.
        return new ModelMapper();
    }
}
