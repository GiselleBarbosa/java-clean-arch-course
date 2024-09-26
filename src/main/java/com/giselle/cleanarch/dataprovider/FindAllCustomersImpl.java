package com.giselle.cleanarch.dataprovider;

import com.giselle.cleanarch.core.dataprovider.FindAllCustomers;
import com.giselle.cleanarch.core.domain.Customer;
import com.giselle.cleanarch.dataprovider.repository.CustomerRepository;
import com.giselle.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FindAllCustomersImpl implements FindAllCustomers {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll().stream()
                .map(customerEntityMapper::toCustomer)
                .collect(Collectors.toList());
    }
}