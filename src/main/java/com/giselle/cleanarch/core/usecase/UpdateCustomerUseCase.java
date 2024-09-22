package com.giselle.cleanarch.core.usecase;

import com.giselle.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(Customer customer, String ZipCode);
}
