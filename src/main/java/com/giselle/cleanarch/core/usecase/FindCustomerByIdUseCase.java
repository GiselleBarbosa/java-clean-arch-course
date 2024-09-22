package com.giselle.cleanarch.core.usecase;

import com.giselle.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);
}
