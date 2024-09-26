package com.giselle.cleanarch.dataprovider.repository.mapper;

import com.giselle.cleanarch.core.domain.Customer;
import com.giselle.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    @Mapping(source = "addressEntity", target = "address")
    Customer toCustomer(CustomerEntity customerEntity);

    @Mapping(source = "address", target = "addressEntity")
    CustomerEntity toCustomerEntity(Customer customer);
}
