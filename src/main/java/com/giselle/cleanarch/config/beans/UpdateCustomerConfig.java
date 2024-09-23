package com.giselle.cleanarch.config.beans;

import com.giselle.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.giselle.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.giselle.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.giselle.cleanarch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerUseCase(
            FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
            FindAddressByZipCodeImpl findAddressByZipCode,
            UpdateCustomerImpl updateCustomer
    ) {
        return new UpdateCustomerUseCaseImpl(findCustomerByIdUseCase, findAddressByZipCode, updateCustomer);

    }
}
