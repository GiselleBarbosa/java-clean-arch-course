package com.giselle.cleanarch.dataprovider.repository.mapper;

import com.giselle.cleanarch.core.domain.Customer;
import com.giselle.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
