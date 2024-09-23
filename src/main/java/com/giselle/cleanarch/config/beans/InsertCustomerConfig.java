package com.giselle.cleanarch.config.beans;

import com.giselle.cleanarch.core.usecase.impl.InsertCustomerUsercaseImpl;
import com.giselle.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import com.giselle.cleanarch.dataprovider.InsertCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUsercaseImpl insertCustomerUsercase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer) {
        return new InsertCustomerUsercaseImpl(findAddressByZipCode, insertCustomer);
    }
}
