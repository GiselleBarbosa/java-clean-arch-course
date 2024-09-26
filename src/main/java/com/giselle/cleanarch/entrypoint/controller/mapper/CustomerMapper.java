package com.giselle.cleanarch.entrypoint.controller.mapper;

import com.giselle.cleanarch.core.domain.Customer;
import com.giselle.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.giselle.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(source = "address", target = "addressResponse")
    CustomerResponse toCustomerResponse(Customer customer);

    Customer toCustomer(CustomerRequest customerRequest);
}