package com.giselle.cleanarch.core.usecase;

import com.giselle.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);
}
