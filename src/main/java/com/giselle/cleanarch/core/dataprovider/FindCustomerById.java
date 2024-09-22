package com.giselle.cleanarch.core.dataprovider;

import com.giselle.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> find(String id);
}
