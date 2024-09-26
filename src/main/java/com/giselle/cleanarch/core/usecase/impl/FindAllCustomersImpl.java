package com.giselle.cleanarch.core.usecase.impl;

import com.giselle.cleanarch.core.usecase.FindAllCustomersUseCase;
import com.giselle.cleanarch.core.domain.Customer;
import com.giselle.cleanarch.dataprovider.repository.CustomerRepository;
import com.giselle.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class FindAllCustomersImpl implements FindAllCustomersUseCase {

    private final CustomerRepository customerRepository;
    private final CustomerEntityMapper customerEntityMapper;

    @Autowired
    public FindAllCustomersImpl(CustomerRepository customerRepository, CustomerEntityMapper customerEntityMapper) {
        this.customerRepository = customerRepository;
        this.customerEntityMapper = customerEntityMapper;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll().stream()
                .map(customerEntityMapper::toCustomer)
                .collect(Collectors.toList());
    }
}
