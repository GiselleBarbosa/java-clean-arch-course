package com.giselle.cleanarch.core.usecase;

import com.giselle.cleanarch.core.domain.Customer;

import java.util.List;

public interface FindAllCustomersUseCase {
    List<Customer> findAll();
}