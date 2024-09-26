package com.giselle.cleanarch.config.beans;

import com.giselle.cleanarch.core.usecase.impl.FindAllCustomersImpl;
import com.giselle.cleanarch.dataprovider.repository.CustomerRepository;
import com.giselle.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindAllCustomersConfig {

    @Bean
    public FindAllCustomersImpl findAllCustomersUseCase(CustomerRepository customerRepository, CustomerEntityMapper customerEntityMapper) {
        return new FindAllCustomersImpl(customerRepository, customerEntityMapper);
    }
}