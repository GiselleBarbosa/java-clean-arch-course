package com.giselle.cleanarch.core.dataprovider;

import com.giselle.cleanarch.core.domain.Customer;

import java.util.List;

public interface FindAllCustomers {
    List<Customer> findAll();
}